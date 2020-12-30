# Projet de Programmation Mobile 4A 2020

## Informations principales 
- Développeur : Mathis DENIS Classe 42
- Nom de l'application : Unknown Land
- Environnement de développement : Android Studio 
- Langage de programmation : Kotlin
- Lien du projet sur GitHub : https://github.com/MathisDENIS/ProjetMathisDENIS42.git
## Présentation 
Cette application affiche une liste des pays d'Amérique Centrale (utilisation d'une API sur GitHub). Pour accèder à cette liste, il suffit de créer un compte puis de s'identifier. Il est possible de réutiliser ce compte (utilisation d'une base de donnée).
## Consignes respectées
- Langage Kotlin
- Utilisation d'une réelle base de donnée
- Ecran avec une liste d'éléments (RecyclerView)
- Appel WebService à une API Rest (americancent.json) avec retrofit
- Architecture MVVM
- Clean Architecture
## Fonctionnalités
### Icone de l'application
- On clique sur l'icône pour lancer l'application.

![Capture d’écran 2020-12-30 172828](https://user-images.githubusercontent.com/62901279/103367395-431e3d00-4ac5-11eb-88eb-52d4a64d3e91.png)


### Ecran de connexion
- Ce premier écran d'accueil permet de s'identifier en utilisant son adresse mail et son mot de passe. Si l'utilisateur ne possède pas de compte, il lui suffit d'en créer un en cliquant sur "Create Account".

![Capture d’écran 2020-12-30 172908](https://user-images.githubusercontent.com/62901279/103367434-5b8e5780-4ac5-11eb-8075-cdc7783e8fb4.png)
![Capture d’écran 2020-12-30 173027](https://user-images.githubusercontent.com/62901279/103367479-7bbe1680-4ac5-11eb-97ab-9f5e40557b50.png)

Avant création de compte ------------------------------------ Après creation de compte

![Capture d’écran 2020-12-30 173055](https://user-images.githubusercontent.com/62901279/103367494-8a0c3280-4ac5-11eb-84be-14807d559bc9.png)
![Capture d’écran 2020-12-30 173224](https://user-images.githubusercontent.com/62901279/103367592-cf306480-4ac5-11eb-8eb1-e998e3a2b51b.png)


### Ecran de création de compte
- Après avoir cliqué sur le bouton "Create Account" le deuxième écran permet à l'utilisateur de créer son compte personnel en indiquant ses informations personnelles. L'utilisateur clique sur le bouton "Create" pour valider et retourner sur la page de connexion.

![Capture d’écran 2020-12-30 173130](https://user-images.githubusercontent.com/62901279/103367520-9c866c00-4ac5-11eb-887b-13f43be1303f.png)
![Capture d’écran 2020-12-30 173159](https://user-images.githubusercontent.com/62901279/103367566-bb84fe00-4ac5-11eb-98b9-34541cf8375e.png)

### Ecran d'affichage de la liste de pays 
- Après s'être identifie en cliquant sur le bouton "Login", cet écran permet l'affichage de la liste de pays.

![Capture d’écran 2020-12-30 173305](https://user-images.githubusercontent.com/62901279/103367614-dd7e8080-4ac5-11eb-823b-d7cab564abcb.png)

## Mon API Rest : americancent.json
- Cette API Rest contient toutes les données sur les pays d'Amerique Centrale

Exemple des données pour le Guatemala :

![Capture d’écran 2020-12-30 174303](https://user-images.githubusercontent.com/62901279/103367929-91800b80-4ac6-11eb-9cf9-e44cf197ad12.png)


