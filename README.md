# bell-store


### 1- Configuration BD

	- Driver Class		: org.h2.Driver
	- Lien pour console : localhost:8080/h2-console
	- JDBC URL			: jdbc:h2:mem:products
	- User Name 		: sa


### 2- Backend 

	- J'ai pas pu utiliser des patrons de conception vu l'utilisation de spring 
	qui organise le code (service, controlleur, .. etc) et qui rend l'utilisation
	de certain patrons de conception tel que Business Delegate plus abstrait.

	- J'ai utilisé les Queries annotation juste pour comprendre un peu la mécanique
	derrière eux

	- Dans le controlleur, j'ai utilisé getProductDescription() qui prends en paramètre
	un id et qui retourne le produit recherché, j'aurais pu prendre le produit à partir
	de la liste que j'envoie, mais j'ai ajouté cette méthode juste pour ajouter une certaine 
	granularité coté backend


### 3- Front-end

	- j'ai utilisé React pour la partie Front-end, la communication se fait via une 
	un service REST coté back-end.

	- Afin d'exécuter les 2 programmes sur la meme machine, il faut installer l'extention 
	chrome suivante : Allow-Control-Allow-Origin

	- j'ai sauvegarder tous dependances dans le fichier package.json, donc il faut just
	rouler les commandes suivantes : 
	
```bash
npm install
npm start 
npm stop  
```