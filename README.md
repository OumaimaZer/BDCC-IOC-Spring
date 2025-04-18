### Mise en œuvre de l'injection des dépendances
Dans cette vidéo pédagogique "https://www.youtube.com/watch?v=vOLqabN-n2k", le Professeur Mohamed Youssfi introduit les concepts fondamentaux de l'injection des dépendances (IoC - Inversion of Control) en Java, en s'inspirant du framework Spring.​ Le but de ce TP est de réaliser une application fermée à la modification et ouverte à l'extension.

## Objectifs de la vidéo
-  Comprendre le principe d'inversion de contrôle et son importance dans le développement d'applications modulaires.
-  Mettre en œuvre l'injection des dépendances via deux approches :
-  Utilisation d'un fichier de configuration XML.
-  Utilisation des annotations Java.
-  Illustrer les différentes méthodes d'injection : par constructeur, par setter et par champ (field).​

## Contenu abordé
-  Création d'interfaces et de leurs implémentations pour simuler des composants d'une application.
-  Configuration des dépendances entre les composants à l'aide d'un fichier XML.
-  Utilisation des annotations @Component et @Autowired pour automatiser l'injection des dépendances.
-  Comparaison des avantages et inconvénients des deux approches.​

## Points clés
-  L'injection des dépendances favorise la séparation des responsabilités et améliore la testabilité du code.
-  L'approche XML offre une configuration externe, tandis que les annotations permettent une configuration déclarative directement dans le code.
-  La maîtrise de ces concepts est essentielle pour développer des applications robustes et maintenables avec des frameworks comme Spring.​

## Résultats du code :

PresSpringXML.java :
![image](https://github.com/user-attachments/assets/b8d569e9-3756-4d6e-8fa3-3d1bfb60b9a4)

PresSpringAnnotation.java :
![image](https://github.com/user-attachments/assets/1b960f0f-3a5b-4b69-8281-e4052fb9bfde)

Pres1.java :
![image](https://github.com/user-attachments/assets/e97ecf98-709a-4edd-9e8b-bd3e6e9206e0)

Pres2.java :
![image](https://github.com/user-attachments/assets/24937b01-5a86-46d6-8249-e4804500b000)


