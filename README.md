<div id="header" align="center">
  <img src="https://media.giphy.com/media/9Dy9tn2sJvZ32HzcYT/giphy.gif" width="300"/>
  <img src="https://media.giphy.com/media/xF0rU6UoW92npy7C8m/giphy.gif" width="300"/>
  <img src="https://media.giphy.com/media/YreUmAkitSryHQpPWi/giphy.gif" width="300"/>
</div>
<div align="center">
  <img src="https://komarev.com/ghpvc/?username=your-github-username&style=flat-square&color=blue" alt=""/>
 </div>
  
# TheBlindTestGame

<h3>Projet de cours sur les Web Services, le but de cette application est de jouer au jeu du Blind Test !</br></br>
C'est à dire écouter des musiques en tout genres et tester ces connaissances ainsi que sa capacité à réagir, trouver le premier... et gagner le plus de point pour remporter la victoire !</h3>
</br>

**Base de données** : MySQL

<img src="https://user-images.githubusercontent.com/36078099/176978209-86a66e8f-f96f-49c6-b7fe-4ec944dcf332.png" title="Spring" alt="Spring" width="80"/>&nbsp; 

**Front** : TheBlindTestClient Angular 14

<img src="https://github.com/devicons/devicon/blob/master/icons/angularjs/angularjs-original.svg" alt="Spring" width="70"/>&nbsp; 

**Back** : TheBlindTest Java 11

<img src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original-wordmark.svg" alt="Spring" width="80"/>&nbsp; 

**Architecture** : 3 layers

<img src="https://user-images.githubusercontent.com/36078099/176978050-ff525261-e2c5-4249-bb4c-22d3f3a34d20.png" alt="Spring" width="80"/>&nbsp;

# :warning: Prérequis avant le premier lancement du projet :warning:

## :arrow_down_small: Cloner le projet

- ``git clone https://github.com/ShayneTwoK/TheBlindTestGame.git``

## ⚙ Installation

- **Node.js**

``https://nodejs.org/en/download/``

- **Angular CLI**

``npm install -g @angular/cli``

- **MySQL**

``https://dev.mysql.com/downloads/installer/``

- **Un IDE** (IntelliJ IDEA, VS Code..)

## :bricks: MySQL

Lancer **MySQL Server** et crée une bdd appellée "bdd_tbt" en local

    identifiant : **root**
    mot de passe : **root**
    port : 3306

***NB**: Vous pouvez modifier cette configuration à votre convenance depuis le fichier **TheBlindTest/src/main/resources/application.properties***

## :clipboard: Maven

Installer les dépendances du projet 

    mvn clean install -DskipTests

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
