CREATE TABLE Produit(
	int PRIMARY KEY numProd,
	varchar NOT NULL nom,
	varchar description,
	boolean NOT NULL dispo,
	real NOT NULL prix,
	varchar[] options);

CREATE TABLE Commande(			/*Manque la liste des lignes d'articles*/
	int NOT NULL numCom,
	int NOT NULL table,
	date NOT NULL dateCom,
	real NOT NULL prixTot,
	statut NOT NULL ENUM('prépa entrée','entrée à servir','prépa plats','plats à servir',
		'prépa desserts','desserts à servir','prépa breuvages','breuvages à servir','à payer','fini'),
	PRIMARY KEY(numCom,/*la tu rajoute l'autre element*/)
	);

CREATE TABLE CommandeFini(
	int PRIMARY KEY numCom,
	date NOT NULL dateCom,
	real NOT NULL prix);

CREATE TABLE Table(
	int PRIMARY KEY numTable,
	int NOT NULL nbPlaces,
	statut NOT NULL ENUM('Prête','Utilisée','En préparation'));