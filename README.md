# TP5 : Microservice Product

## Description
Microservice de gestion de produits avec Spring 5.3, Hibernate 5.6 et MySQL 8.
Il utilise une `SessionFactory`, des transactions (`@Transactional`) et un DAO.

## Structure du dépôt
- [microservice-product](./microservice-product) : code source
- [LAB5](./LAB5) : captures d'écran de l'exécution

## Exécution
1. Démarrer MySQL
2. Adapter `src/main/resources/application.properties` (utilisateur, mot de passe)
3. Lancer `MainApp` (la base `product_db` et la table `products` sont créées automatiquement)
4. Lancer `TestHibernate` pour vérifier la lecture via le DAO

## Preuves d'exécution

### 1. Capture 1
![Capture 1](./LAB5/IM1.png)

### 2. Capture 2
![Capture 2](./LAB5/IM2.png)
