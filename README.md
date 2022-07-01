# TheBlindTestGame

Projet de cours sur les Web Services, le but de cette application est de
jouer au jeu du Blind Test, c'est à dire écouter des musiques en tout genres et tester ces connaissances
ainsi que sa capacité à réagir pour trouver le premier et gagner le plus de point !

Base de données : MySQL
Front : TheBlindTestClient Angular 14
Back : TheBlindTest Java 11 Spring Boot
Architecture : 3 layers

### /!\ Prérequis avant le premier lancement du projet /!\

1. Cloner le projet :

- ``git clone https://github.com/ShayneTwoK/TheBlindTestGame.git``

2. Avoir installer sur son poste :

- Node.js

``https://nodejs.org/en/download/``

- Angular CLI

``npm install -g @angular/cli``

- MySQL

``https://dev.mysql.com/downloads/installer/``

- Un IDE (IntelliJ IDEA, VS Code..)

3. Lancer MySQL Server et crée une bdd appellée "bdd_tbt" en local
    - identifiant : **root**
    - mot de passe : **root**
    - port : 3306

NB: Vous pouvez modifier cette configuration à votre convenance depuis le fichier **TheBlindTest/src/main/resources/application.properties**

4. Maven pour installer les dépendances :

- ``mvn clean install -DskipTests``

5. Lancer le serveur Tomcat Java avec ``mvn spring-boot:run``, l'url sera ``http://localhost:8080/``, il doit directement vous afficher la page Swagger pour tester l'API.

NB: Autre façon de tester après avoir lancer le serveur, en prenant ce lien ``http://localhost:8080/api-docs`` et l'importer sur Postman

6. Lancer le serveur npm Angular avec ``ng serve``, l'url sera ``http://localhost:4200/``

Enjoy !