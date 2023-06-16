const express = require('express');
const fs = require('fs');
const app = express();
const port = 8080;

app.use(express.json());
app.use(express.static('public'));

// Endpoint pour récupérer le contenu du panier (GET)
app.get('/api/shopCarts', (req, res) => {
    fs.readFile('data.json', 'utf8', (err, data) => {
        if (err) {
            console.error(err);
            res.status(500).json({ error: 'Erreur lors de la lecture du fichier de données.' });
            return;
        }
        const cart = JSON.parse(data);
        res.json(cart);
    });
});

// Endpoint pour ajouter un article au panier (POST)
app.post('/api/shopCarts/items', (req, res) => {
    const { itemId, itemName, quantity, price } = req.body;
    fs.readFile('data.json', 'utf8', (err, data) => {
        if (err) {
            console.error(err);
            res.status(500).json({ error: 'Erreur lors de la lecture du fichier de données.' });
            return;
        }
        const cart = JSON.parse(data);
        const newItem = {
            itemId,
            itemName,
            quantity,
            price
        };
        cart.items.push(newItem);
        fs.writeFile('data.json', JSON.stringify(cart), (err) => {
            if (err) {
            console.error(err);
            res.status(500).json({ error: 'Erreur lors de l\'écriture du fichier de données.' });
            return;
            }
        res.json(newItem);
        });
    });
});

// Endpoint pour supprimer un article du panier (DELETE)
app.delete('/api/shopCarts/items/:itemId', (req, res) => {
    const { itemId } = req.params;
    fs.readFile('data.json', 'utf8', (err, data) => {
        if (err) {
            console.error(err);
            res.status(500).json({ error: 'Erreur lors de la lecture du fichier de données.' });
            return;
        }
        const cart = JSON.parse(data);
        const index = cart.items.findIndex(item => item.itemId === itemId);
        if (index !== -1) {
            const deletedItem = cart.items.splice(index, 1);
            fs.writeFile('data.json', JSON.stringify(cart), (err) => {
            if (err) {
                console.error(err);
                res.status(500).json({ error: 'Erreur lors de l\'écriture du fichier de données.' });
                return;
            }
            res.json(deletedItem);
            });
        } else {
            res.status(404).json({ error: 'Article non trouvé dans le panier.' });
        }
    });
});

// Démarrer le serveur
app.listen(8080, () => {
    console.log('Serveur en cours d\'exécution sur le port 8080');
});