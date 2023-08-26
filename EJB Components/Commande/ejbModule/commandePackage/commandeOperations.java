package commandePackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import caissePackage.caisseOperationsRemote;
import stockPackage.stockOperationsRemote;

@Stateless
public class commandeOperations implements commandeOperationsRemote {

    @EJB
    stockOperationsRemote stock;
    @EJB
    caisseOperationsRemote caisse;

    @Override
    public int passerCommande(int numeroBoisson, int montant) {
        // ACCESS A LA BASE DE DONNER, DÉCRIMENTER NOMBRE
        // DATABASE CONNECTION DETAILS
        String jdbcUrl = "jdbc:derby://localhost:1527/sample;create=true";
        String username = "user";
        String password = "123";
        // SQL QUERY
        String sql1 = "select * from productStock";
        String sql2 = "select * from piecesCaisse";
        List < Map < String, Object >> tableData_stock = new ArrayList < > ();
        List < Map < String, Object >> tableData_caisse = new ArrayList < > ();
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql1)) {
            while (resultSet.next()) {
                int productId = resultSet.getInt("id_produit");
                String productName = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                Map < String, Object > row = new HashMap < > ();
                row.put("Numero", productId);
                row.put("Produit", productName);
                row.put("Prix", price);
                row.put("Quantite", quantity);
                tableData_stock.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (stock.choisirBoisson(numeroBoisson, tableData_stock)) {
            int prixP = 0;
            for (Map < String, Object > map: tableData_stock) {
                Object produit = map.get("Numero");
                Object prix = map.get("Prix");
                if (Integer.valueOf(produit.toString()).equals(numeroBoisson)) {
                    prixP = Integer.valueOf(prix.toString());
                    break;
                }
            }
            if (prixP <= montant) {
                try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql2)) {
                    while (resultSet.next()) {
                        int id_piece = resultSet.getInt("id_piece");
                        int valeur = resultSet.getInt("valeur");
                        int quantite = resultSet.getInt("quantite");
                        Map < String, Object > row = new HashMap < > ();
                        row.put("id_piece", id_piece);
                        row.put("valeur", valeur);
                        row.put("quantite", quantite);
                        tableData_caisse.add(row);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                int restMnt = montant - prixP;
                Map < Integer, Integer > pieces = new HashMap < > ();
                pieces = caisse.effectuerPaiement(restMnt);
                for (Map.Entry < Integer, Integer > entry: pieces.entrySet()) {
                    int necessaryDenomination = entry.getKey();
                    int necessaryQuantity = entry.getValue();
                    boolean changePossible = false;
                    for (Map < String, Object > map: tableData_caisse) {
                        Object id_piece = map.get("id_piece");
                        Object quantite = map.get("quantite");
                        if (Integer.valueOf(id_piece.toString()).equals(necessaryDenomination) && necessaryQuantity <= Integer.valueOf(quantite.toString())) {
                            changePossible = true;
                            break;
                        }
                    }
                    if (!changePossible) {
                        return 3; // PIECES CAISSE INSUFFISANTS //RETOURNER UN ECHEC
                    }
                }
                // MàJ BDD
                String sql3 = "UPDATE productStock SET quantity = quantity - 1 WHERE id_produit = ?";
                try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password); PreparedStatement statement = connection.prepareStatement(sql3)) {
                    statement.setInt(1, numeroBoisson);
                    statement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                String sql4a = "UPDATE piecesCaisse SET quantite = quantite - ";
                String sql4b = " WHERE id_piece = ?";
                String sql4;
                for (Map.Entry < Integer, Integer > entry: pieces.entrySet()) {
                    int necessaryDenomination = entry.getKey();
                    int necessaryQuantity = entry.getValue();
                    sql4 = sql4a + necessaryQuantity + sql4b;

                    try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password); PreparedStatement statement = connection.prepareStatement(sql4)) {
                        statement.setInt(1, necessaryDenomination);
                        statement.executeUpdate();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                return restMnt; // TOUT PARFAIT
            } else {
                return 2; // MONTANT INSUFFISANT //RETOURNER UN ECHEC
            }
        } else {
            return 1; // STOCK VIDE //RETOURNER UN ECHEC
        }
    }

    @Override
    public void effectuerMaintenanceCaisse(int id_piece, int quantite) {
        String jdbcUrl = "jdbc:derby://localhost:1527/sample;create=true";
        String username = "user";
        String password = "123";
        String sql = "UPDATE piecesCaisse SET quantite = quantite + ? WHERE id_piece = ?";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, quantite);
            statement.setInt(2, id_piece);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void effectuerMaintenanceStock(String name, int price, int quantity) {
        String jdbcUrl = "jdbc:derby://localhost:1527/sample;create=true";
        String username = "user";
        String password = "123";
        String sql = "INSERT INTO productStock (name, price, quantity) VALUES (?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setInt(2, price);
            statement.setInt(3, quantity);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}