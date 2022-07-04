<div id="header" align="center">
  <img src="https://media.giphy.com/media/9Dy9tn2sJvZ32HzcYT/giphy.gif" width="300"/>
  <img src="https://media.giphy.com/media/xF0rU6UoW92npy7C8m/giphy.gif" width="300"/>
  <img src="https://media.giphy.com/media/YreUmAkitSryHQpPWi/giphy.gif" width="300"/>
</div>
<div align="center">
  <img src="https://komarev.com/ghpvc/?username=your-github-username&style=flat-square&color=blue" alt=""/>
 </div>
  
# TheBlindTestGame

<p>Projet de cours sur les Web Services, le but de cette application est de jouer à un <b>PROTOTYPE</b> de jeu, celui du Blind Test !</br></br>
C'est à dire écouter des musiques en tout genres et tester ces connaissances ainsi que sa capacité à réagir, trouver le premier... et gagner le plus de point pour remporter la victoire !</p>
</br>

**Base de données** : MySQL

<img src="https://user-images.githubusercontent.com/36078099/176978209-86a66e8f-f96f-49c6-b7fe-4ec944dcf332.png" width="80"/>&nbsp; 

**Front** : TheBlindTestClient Angular 14

<img src="https://github.com/devicons/devicon/blob/master/icons/angularjs/angularjs-original.svg" width="70"/>&nbsp; 

**Back** : TheBlindTest Java 11

<img src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original-wordmark.svg" width="80"/>&nbsp; 

**Architecture** : 3 layers

<img src="https://user-images.githubusercontent.com/36078099/176978050-ff525261-e2c5-4249-bb4c-22d3f3a34d20.png" width="80"/>&nbsp;

**Système d'exploitation utilisé pour la configuration du projet** : Windows

![image](https://user-images.githubusercontent.com/36078099/177215102-a1465b20-5012-4376-b471-502355d01863.png)

**Documentation** : Swagger (OpenAPI3)

![image](https://user-images.githubusercontent.com/36078099/177060611-55b84ba3-c3ad-4671-9917-92ac4250ab0e.png)

Schéma de la bdd, Maquette Prototype du site, Endpoint renseigner pour chaque page dans l'url

![Maquette_TheBlindTest drawio](https://user-images.githubusercontent.com/36078099/177215209-b3dae0a7-91f9-4454-9f9e-772e9b93c7f0.png)

# :warning: Prérequis avant le premier lancement du projet

## :arrow_down_small: Cloner le projet

- ``git clone https://github.com/ShayneTwoK/TheBlindTestGame.git``

## ⚙ Installation

- **Node.js**

``https://nodejs.org/en/download/``

- **Angular CLI**

``npm install -g @angular/cli``

- **MySQL**

``https://dev.mysql.com/downloads/installer/``
Prendre la fonctionnalité "MySQLServer"

- **Un IDE** (IntelliJ IDEA, VS Code..)

## :bricks: MySQL

Lancer **MySQL Server**
 - Soit vous Lancez MySQLWorkbench et connectez-vous à votre instance local
 - Soit vous enregistrer le chemin complet du bin MySQL Server dans vos variables d'environnements et lancer dans le cmd ``mysqld``

Crée une bdd appellée "bdd_tbt" en local qui aura par défaut :

    identifiant : root
    mot de passe : root
    port : 3306

***NB**: Vous pouvez modifier cette configuration à votre convenance depuis le fichier **TheBlindTest/src/main/resources/application.properties*** pour rendre l'app compatible avec votre config SQL
pour une autre DB.

## :clipboard: Maven

Installer les dépendances du projet 

    mvn clean install -DskipTests

# :globe_with_meridians: Lancement de l'application !

## :rocket: Lancer le serveur Tomcat Java

    mvn spring-boot:run
    url : http://localhost:8080/

il doit directement vous afficher la page Swagger pour tester l'API.

***NB**: Autre façon de tester après avoir lancer le serveur, en prenant ce lien ``http://localhost:8080/api-docs`` et l'importer sur Postman*

## :rocket: Lancer le serveur npm Angular

    ng serve
    url : http://localhost:4200/
<div align="center">
    <img src="https://media.giphy.com/media/msiYsnJG2ANFxXgZDW/giphy.gif" width="300"/>
</div>

# Fonctionnement de l'application

Pour l'instant, l'application n'est que en local et aucun WebSocket n'a été intégrer, donc pas de Multi.
J'ai préféré me concentrer sur l'essentiel de ce qui à été demandé à savoir :
 - Modéliser une bdd avec Sprint Boot
 - Construire une API RESTFul
 - Gestion des codes d'erreurs et quelques logs
 - Front basique avec utlisation de composant Angular, Routing, Service
 - Stocker mes joueurs en base
 - Récupérer les infos et les afficher
 
Le joueur vas aller sur l'application de manière anonyme et n'a pas besoin de se connecter.

Donc techniquement, celon ce principe, le user ne sera stocker dans la base que temporairement afin de suivre sa progression pour une session de jeu de BlindTest et faire du traitement, un peu comme à la Gartic Phone ou Skribbl.io.

# Suite

- Ajout de Tests Unitaires
- Finalisation de toutes les pages comme représenté sur la maquette
- Intégration API externe Youtube
- Jeu en local avec Gameplay en place
- WebSocket pour jouer en mutlijoueur
- Docker pour un futur hébergement
