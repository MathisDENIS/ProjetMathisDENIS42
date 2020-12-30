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

![Capture d’écran 2020-12-30 103857](https://user-images.githubusercontent.com/62901279/103344377-bd7f9a80-4a8e-11eb-8cc6-a7596d8daa89.png)


### Ecran de connexion
- Ce premier écran d'accueil permet de s'identifier en utilisant son adresse mail et son mot de passe. Si l'utilisateur ne possède pas de compte, il lui suffit d'en créer un en cliquant sur "Create Account".

![Capture d’écran 2020-12-30 103935](https://user-images.githubusercontent.com/62901279/103345872-ce320f80-4a92-11eb-93ad-f6f328282fc9.png)
![Capture d’écran 2020-12-30 104026](https://user-images.githubusercontent.com/62901279/103345954-0fc2ba80-4a93-11eb-9f81-8147d98e8b47.png)







### Ecran de création de compte
- Après avoir cliqué sur le bouton "Create Account" le deuxième écran permet à l'utilisateur de créer son compte personnel en indiquant une adresse mail et un mot de passe.



### Ecran d'affichage de la liste de pays 
- Après s'être identifier, cet écran permet l'affichage de la liste de pays.




## Mon API Rest : americancent.json
- Cette API Rest contient toutes les données sur les pays d'Amerique Centrale

Exemple des données pour le Guatemala :

