SELECT TABLENAME
FROM SYS.SYSTABLES
WHERE TABLETYPE = 'T';

CREATE TABLE productStock (
    id_produit INTEGER GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(50),
    price INTEGER,
    quantity integer,
    PRIMARY KEY (id_produit)
);

CREATE TABLE piecesCaisse (
    id_piece INTEGER,
    valeur 	 integer,
    quantite integer,
    PRIMARY KEY (id_piece)
);

INSERT INTO productStock (name, price, quantity) VALUES ('Coca-Cola', 50, 3);
INSERT INTO productStock (name, price, quantity) VALUES ('Pepsi'    , 60, 3);
INSERT INTO productStock (name, price, quantity) VALUES ('Sprite'   , 45, 3);

INSERT INTO piecesCaisse (id_piece, valeur, quantite) VALUES (5  , 5  , 20);
INSERT INTO piecesCaisse (id_piece, valeur, quantite) VALUES (10 , 10 , 20);
INSERT INTO piecesCaisse (id_piece, valeur, quantite) VALUES (20 , 20 , 20);
INSERT INTO piecesCaisse (id_piece, valeur, quantite) VALUES (50 , 50 , 10);
INSERT INTO piecesCaisse (id_piece, valeur, quantite) VALUES (100, 100, 10);
INSERT INTO piecesCaisse (id_piece, valeur, quantite) VALUES (200, 200, 10);

select * from productStock;