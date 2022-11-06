# Feedback DM1

> **Équipe 404**  
> Yohann MANSEAU-GLÉMOT (20217138)  
> Alex CHEVRIER (20216495)  
> Maxime BÉLANGER (20219276)  

## Cadre du projet

- Le cadre du projet est clairement défini.
  - Ajoutez les objectifs de l'initiative
- L'échéancier n'est pas très soigné et manque certaines informations
  - La distribution des tâches est présente dans le rapport, mais n'est pas directement présentée dans l'échéancier. Si possible, affichez-les côte à côte (via du CSS)
  - L'échéancier doit s'étendre sur toute la durée prévue du projet. Les éléments connus ou planifiés à date pour les jalons futurs doivent aussi être présentés.
- Bonne priorisation

## Compréhension du domaine

Les questions de compréhension devraient être dans cette section

### Glossaire

Bon glossaire. Certains termes et expressions du domaine sont absents.

#### Termes manquants

> `*` = important

- Bineco*
- Résident*
- Activités*
- Bacs*
- Métriques écologiques*
- Type de bacs
- Capteurs

### Persona

Bon persona

- Ajoutez l'âge pour plus de personnalisation
- Ajoutez un autre persona pour plus de diversités

## Modélisation du domaine

### Cas d'utilisation

L'ensemble des interactions est capturé dans le diagramme, mais il y a quelques erreurs dans la notation et l'identification des acteurs.

- Acteurs manquants: Résident (pas Citoyen), Capteurs. Les capteurs peuvent interagir avec Bineco en envoyant des données.
- Base de données n'est pas un acteur. C'est une composante de Bineco.
- La relation de généralisation est dans le mauvais sens.
  - Utilisateur peut aussi *S'authentifier*, *Modifier son profil*
- CUs manquants: *Supprimer un bac*, *Mettre à jour les données des bacs*, *S'authentifier*
- Mauvaise utilisation de la relation `include`. Ici, les CUs semblent être des extensions du CU `Accès au volet statistique`
  - Faire un lien direct entre Résident et les sous-CUs.

### Scénarios

Bien dans l'ensemble. Bon usage des scénarios alternatifs.

- Les étapes doivent alterner entre le système et les acteurs. Éviter d'avoir plus de 2 étapes successives pour le même acteur.
- Ajoutez la connexion à Bineco comme préconditions à l'ensemble des CUs
- CU *Créer un compte*
  - La précondition de la nécessité d'équipement n'est pas nécessaire.
- CU *Signaler un problème.*
  - On devrait avoir une postcondition pour garantir que le message a été bien reçu par le système de la ville
- CU *Voir les statistiques* a trop de sous-étapes
- CU *Trouver un consommateur*
  - Les sous-étapes 3.1 et 3.2 peuvent être des étapes de premier niveau 4 et 5.
  - Les scénarios alternatifs pourraient être mieux insérés
- CU *Afficher les métriques écologiques*
  - Les sous-étapes 3.1, 3.2 et 3.3 peuvent être des étapes de premier niveau 4, 5 et 6.

## Analyse

Excellente analyse, avec beaucoup de détails techniques.

### Risques

Très bien. Les risques se concentrent principalement sur l'aspect technique.

- Les risques peuvent porter sur d'autres aspects du projet
  - Données sont utilisées à mauvais escient
  - Consommateurs ne veulent pas coopérer
  - Résident n'apprécie pas l'outil
  - Projet trop couteux
  - Politique empêche la réalisation du projet
  - Temps alloué insuffisant

### Exigences non-fonctionnelles

Très bien. Associez à chaque exigence, une caractéristique du logiciel (critère de qualité): Sécurité, Utilisabilité, Fiablité, Performance, Accessibilité...

### Ressources

Très bien. Élaborer un peu plus la solution de stockage.

- Type de base de données
- Intégration avec système municipal

### Contraintes

Très bien.

### Propositions et choix de métriques

Très bonnes études préliminaires.

#### Métrique résidentielle

- Le ration carbone/azote risque est spécifique à l'activité de compostage et risque d'etre un trop technique. Ajoutez-y des paliers d'interprétation pour le rendre plus accessible.
- Le taux d'oxygène ou dégagement de CO2 est hors du contrôle des résidents et trop techniques
- Le ratio compostable/non-compostable est un bon de début de calcul. On pourrait l'étendre avec une formule comme qVxfV + qBxfB / qNxfN + 1
  - qV: quantité vert (recyclable)
  - fV: facteur vert (configurable)
  - qB: quantité brun (compostable)
  - fB: facteur brun (configurable)
  - qN: quantité noir (ordures)
  - fN: facteur noir (configurable)

#### Métrique municipale

Très bien.

- Le cout énergétique peut aussi être utilisé pour mesure l'efficacité du traitement

### Prototype

Très bien.

- Manque une vue propre au consommateur

## Rapport

Très bon rapport.

## Git

Très bon usage de Git.
