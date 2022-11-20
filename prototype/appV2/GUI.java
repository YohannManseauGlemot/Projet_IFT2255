public class GUI {
    
    private static void logo(){
        String s1 = "    ____  _                      ";
        String s2 = "   |  _ "+'\\'+"(_)                     ";
        String s3 = "   | |_) |_ _ __   ___  ___ ___  ";
        String s4 = "   |  _ <| | '_ \\ / _ \\/ __/ _ \\ ";
        String s5 = "   | |_) | | | | |  __/ (_| (_) |";
        String s6 = "   |____/|_|_| |_|\\___|\\___\\___/ ";

        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println();
        System.out.println();
    }

    private static void optionsLogin(){
        System.out.println("Choisissez le type de compte avant de vous connecter :");
        System.out.println();

        System.out.println("    |1| Résident");
        System.out.println("    |2| Consommateur");
        System.out.println("    |0| Quitter bineco");
        System.out.println();
        System.out.print("Entrez votre choix: ");
    }

    private static void userOptionsMenu(){
        System.out.println("Choisissez le service que vous voulez utiliser :");
        System.out.println();

        System.out.println("    |1| Enregistrer un bac");
        System.out.println("    |2| Statistiques");
        System.out.println("    |3| Trouver un consommateur");
        System.out.println("    |4| Signaler un problème à MunicipInfo");
        System.out.println("    |0| Retour à l'accueil");
        System.out.println();
        System.out.print("Entrez votre choix: ");
    }

    private static void consummerOptionsMenu(){
        System.out.println("Choisissez le service que vous voulez utiliser :");
        System.out.println();

        System.out.println("    |1| Notifier les résidents");
        System.out.println("    |0| Retourner à l'accueil");
        System.out.println();
        System.out.print("Entrez votre choix: ");
    }

    public static void login(){
        logo();
        optionsLogin();
    }

    public static void merci(){
        System.out.println("Merci d'avoir utilisé Bineco!");
    }

    public static void retour(){
        System.out.println("Retour à l'accueil...");
    }

    public static void askUsername(){
        System.out.println("Veuillez entrer votre adresse courriel: ");
    }

    public static void askUserPassword(){
        System.out.println("Veuillez entrer votre mot de passe: ");
    }

    public static void userMenu(){
        logo();
        userOptionsMenu();
    }

    public static void consummerMenu(){
        logo();
        consummerOptionsMenu();
    }

    public static void enregisterBac(){
        System.out.println();
        String l1 = "*************************";
        String l2 = "*Enregistrement d'un bac*";
        String l3 = "*************************";

        String l4 = " ----------------------------";
        String l5 = "|                            |";

        System.out.println(l1);
        System.out.println(l2); 
        System.out.println(l3);
        System.out.println("Veuillez scanner votre code QR et cliquer sur une touche:");
            System.out.println(l4);
            for(int i = 0; i < 8; i++){
                System.out.println(l5);
            }
            System.out.println(l4);
    }

    public static void askBacName(){
        System.out.println("Veuillez donner le nom du bac: ");
    }

    public static void askBacType(){ 
        System.out.println("Quel est le type de votre bac? (Bleu, Brun ou Noir): ");
    }

    public static void bacConfirmAndRedo(){
        System.out.println("Votre bac a été enregistré avec succès!");
        System.out.println();
        System.out.println("Voulez-vous ajouter un autre bac? (Oui/Non): ");
    }

    public static void notifier(){
        System.out.println();
        String l1 = "*************************";
        String l2 = "*Notifier les résidents**";
        String l3 = "*************************";

        System.out.println(l1);
        System.out.println(l2); 
        System.out.println(l3);

        System.out.println("Choisissez le type de notification que vous voulez envoyer :");
        System.out.println();

        System.out.println("    |1| Sensibilisation");
        System.out.println("    |2| Accumulation");
        System.out.println("    |0| Retour");
        
        System.out.println();
        System.out.print("Entrez votre choix: ");
    }

    public static void sensibilisation(){
        System.out.println("Veuillez rédiger votre requête de sensibilisation: ");
    }

    public static void accumulation(){
        System.out.println("Veuillez rédiger votre requête d'accumulation: ");
    }

    public static void notifConfirmation(){
        System.out.println("Votre requête a été enregistrée, les résidents en seront notifié !");
    }

    public static void statistiquesMenu(){
        System.out.println();
        String l1 = "*************************";
        String l2 = "*      Statistiques     *";
        String l3 = "*************************";

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println("Choisissez la catégorie que vous voulez afficher :");
        System.out.println();

        System.out.println("    |1| État de mes bacs");
        System.out.println("    |2| Métriques écologiques");
        System.out.println("    |3| Traitement de mes déchets");
        System.out.println("    |4| Activités que je maintiens ");
        System.out.println("    |0| Retour au menu principal ");
        
        System.out.println();
        System.out.print("Entrez votre choix: ");
    }

    public static void etatBac(String[] etatBac){
        System.out.println("Voici l'état actuel de vos différents bacs, 20 novembre 2022. Ces données sont misent à jour à chaque 24h:");
            System.out.println("                 Bac Brun      Bac Bleu      Bac Noir");
            System.out.println("Niv. remplissage:  "+etatBac[0]+"           "+etatBac[1]+"           "+etatBac[2]+"");
            System.out.println("Température:       "+etatBac[3]+"          "+etatBac[4]+"          "+etatBac[5]+"");
            System.out.println("    pH:             "+etatBac[6]+"            "+etatBac[7]+"           "+etatBac[8]+" ");
            System.out.println("Humidité:          "+etatBac[9]+"           "+etatBac[10]+"           "+etatBac[11]+"        ");
            System.out.println();
            System.out.println("État du capteur: "+etatBac[12]+"");
            System.out.println();
            System.out.println("Ci dessous vous pouvez voir la composition de chacun de vos bacs. Le contenu de chacun des bacs est décrit au dessus de sa composition:");
            System.out.println();
            System.out.println("Bac Brun: Résidus alimentaires/Produits fibreux/Produits compostables/Herbes et plantes"+ "(en % du contenu du bac)");
            System.out.println("                "+etatBac[13]+"          /        "+etatBac[14]+"     /         "+etatBac[15]+"        /         "+etatBac[16]+"       ");
            System.out.println();
            System.out.println("Bac Bleu: Papier/Carton/Verre/Metal/Conteneurs de plastique" + "(En % du contenu du bac)");
            System.out.println("            "+etatBac[17]+" /  "+etatBac[18]+" / "+etatBac[19]+" / "+etatBac[20]+" / "+etatBac[21]+"                                      ");
            System.out.println();
            System.out.println("Bac Noir: Déchets/Matières recyclables/Matières compostable (En % du contenu du bac)");
            System.out.println("            "+etatBac[22]+"  /        "+etatBac[23]+"         /      "+etatBac[24]+" ");
            System.out.println();
            System.out.println("Cliquez sur une touche de votre clavier pour retourner au volet Statistiques");
    }

    public static void metriques(String[] metriques){
        System.out.println("Ici vous pouvez examiner les métriques écologiques qui reflètent l'efficacité du traitement des déchets de la ville de Montréal du mois dernier");
        System.out.println();
        System.out.println("Matières organiques collectées par la ville (en tonnes):     | "+metriques[0]+"  |    ");
        System.out.println("Taux de récupération des matières organiques:                |   "+metriques[1]+"   |    ");
        System.out.println("Coût énergétique total du traitement (en kWh) :               |   "+metriques[2]+"   |    ");
        System.out.println("Matières recyclables collectées par la ville (en tonnes):    | "+metriques[3]+" |    ");
        System.out.println("Taux de récupération des matières recyclables:               |   "+metriques[4]+"   |    "); 
        System.out.println("Coût énergétique total du traitement (en kWh) :              |   "+metriques[5]+"   |    ");

        System.out.println();
        System.out.println();
        System.out.println("Voulez-vous paramétriser le ratio matières écologiques/non-écologiques?");
    }

    public static void metriques( String[] metriques, double fV, double fB, double fN ){
        
        System.out.println("Voici les métriques écologiques au niveau résidentiel, c'est-à-dire une comparaison entre ");
        System.out.println("votre activité écologique et celle des citoyens de la ville de Montréal du mois dernier. Ces métriques sont en lien avec vos différents bacs");
        System.out.println();
        System.out.println("                                                     Vous      |  Moyenne des citoyens    ");
        System.out.println("           1.Ration carbone/azote (C/N) :             "+metriques[6]+"     |        "+metriques[7]+"              ");
        System.out.println("       3 .Ratio matières écologiques/non-écologiques: "+(Double.parseDouble(metriques[9])*fV)+((Double.parseDouble(metriques[11])*fB)) /((Double.parseDouble(metriques[13])*fN) +1)+"     |        "+metriques[8]+"              ");
        System.out.println("       5.Quantité de matière compostée (lbs):         "+metriques[9]+"    |        "+metriques[10]+"              ");
        System.out.println("       5.Quantité de matière recyclé (lbs):           "+metriques[11]+"    |        "+metriques[12]+"              ");
        System.out.println("       5.Quantité de déchets (lbs):                   "+metriques[13]+"    |        "+metriques[14]+"              ");
        System.out.println();
        System.out.print("Afficher les explications des métriques au niveau résidentiel? (Oui/Non) ");
    }

    public static void metriquesInfo(boolean show){
        if(show){
            System.out.println("1. Le ratio carbone/azote dans un bac de composte doit être le plus près possible de 30:1");
            System.out.println("pour un compostage optimal.");
            System.out.println();
            System.out.println("2. Le taux d'oxygène est important dans un bac de composte puisque sans oxygène, un bac de composte va générer plus de méthane que de CO2.");
            System.out.println(" Le méthane a un pouvoir de réchauffement 80 fois plus élevé que le CO2. Aussi, un composte avec un taux d'oxygène plus élevé va se décomposer plus rapidement");
            System.out.println();
            System.out.println("3.Le ratio de matières compostables et non compostables indique simplement le rapport entre les déchets bénifiques et nuisibles pour votre composte");
            System.out.println();
            System.out.println("4. Le dégagement de CO2 vous donne une idée de votre empreinte écologique, par contre il faut garder en tête que plus une personne composte plus elle produira de CO2");
            System.out.println();
            System.out.println("5. La quantité de matière compostée permet de vous comparer avec les autres citoyens sur votre taux de compostage");
            System.out.println();
            System.out.println("Note: En moyenne, un bac de composte génère 160 kg de CO2 pour 1 tonne de composte. Donc en assummant qu'un citoyen ");
            System.out.println("prend 2 semaine à remplir son composte à 100 lbs, alors en 1 mois il aura composté 200 lbs et géneré environ 70 lbs de CO2");
        }
        System.out.println();
        System.out.println("Cliquez sur une touche de votre clavier pour retourner au volet Statistiques");
    }

    public static void traitement(String infos){
        System.out.println(infos);
        System.out.println();
        System.out.println("Cliquez sur une touche de votre clavier pour retourner au volet Statistiques");
    }

    public static void activites(String infos){
        System.out.println(infos);
        System.out.println();
        System.out.println("Cliquez sur une touche de votre clavier pour retourner au volet Statistiques");
    }
}
