import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;
import java.util.Random;



public class Menu {

        private String cN;
        private String qC;
        private String qR;
        private String qD;
        private String nom;

    private static Scanner scanner = new Scanner(System.in);
    private static Main main = new Main();
    private EnregistrerBac bac = new EnregistrerBac();
    private Consommateur cons = new Consommateur();
    private Statistiques stat = new Statistiques();
    private SignalerProbleme prob = new SignalerProbleme();
    private Notifier notif = new Notifier();
     
    

    public void clearConsole(int a){
        for (int i = 0; i < a; ++i) 
            System.out.println();

    }
    public void logo(){
        System.out.print("    ____  _                      \n   |  _ "+'\\'+"(_)                     \n   |  _ "+'\\'+"(_)                     \n   |  _ <| | '_ \\ / _ \\/ __/ _ \\ \n   | |_) | | | | |  __/ (_| (_) |\n   |____/|_|_| |_|\\___|\\___\\___/ ");
    }
    public void menuConsommateur(){

        String s1 = "    ____  _                      ";
        String s2 = "   |  _ "+'\\'+"(_)                     ";
        String s3 = "   | |_) |_ _ __   ___  ___ ___  ";
        String s4 = "   |  _ <| | '_ \\ / _ \\/ __/ _ \\ ";
        String s5 = "   | |_) | | | | |  __/ (_| (_) |";
        String s6 = "   |____/|_|_| |_|\\___|\\___\\___/ ";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println();
        System.out.println();

        System.out.println("Choisissez le service que vous voulez utiliser :");
        System.out.println();

        System.out.println("    |1| Notifier les résidents");
        System.out.println("    |2| Ajouter une activité");
        System.out.println("    |3| Supprimer une activité");
        System.out.println("    |4| Modifier une activité");
        System.out.println("    |0| Retourner à l'accueil");
        System.out.println();

        int choix;
        while (true){
            System.out.print("Entrez votre choix: ");

            try{
                choix = scanner.nextInt();
    
                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 4"); // Changer le 4  en cas de changements
                }
                if(choix >= 5){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 4");
                }
                
            }
            catch (InputMismatchException e){
                System.out.println(" Erreur: Vous devez entrer un chiffre");
                System.out.println();
                scanner.nextLine();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                scanner.nextLine();
                continue;
            } 
            break;
        }

         switch(choix){
            case 1:
            
                System.out.println();
                notif.menu();

                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }

                
                menuConsommateur();

                break;
            case 0:
                System.out.println("Retour à l'accueil...");
                Main.accueil();
                break;
         }
                

    }
    
    /**
     * @throws Exception
     */
    public void menuPrincipal(int id, String ad) {
        
        if(id == 0){
            nom = "Dylan";
            cN = "30:1";
            qC = "200";
            qR = "170";
            qD = "150";
        }
        if(id == 1 ){
            nom = "James";
            cN = "25:1";
            qC = "230";
            qR = "190";
            qD = "140";
        }
        if(id == 2){
            nom = "Cadet";
            cN = "35:1";
            qC = "150";
            qR = "180";
            qD = "120";
        }
        if(id == 3){
            nom = ad.substring(0,5);
            Random rand = new Random();
            String cn =  ""+(rand.nextInt(21)+20);
            cN = cn+":1";
            qC =  ""+(rand.nextInt(56)+115);
        
            qR =  ""+(rand.nextInt(61)+140);
            qD =  ""+(rand.nextInt(41)+90);
            
        }
        String s1 = "    ____  _                      ";
        String s2 = "   |  _ "+'\\'+"(_)                     ";
        String s3 = "   | |_) |_ _ __   ___  ___ ___  ";
        String s4 = "   |  _ <| | '_ \\ / _ \\/ __/ _ \\ ";
        String s5 = "   | |_) | | | | |  __/ (_| (_) |";
        String s6 = "   |____/|_|_| |_|\\___|\\___\\___/ ";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println();
        System.out.println();
       
    
        System.out.println("Bienvenue sur Bineco Mr "+ nom+ "!");
        System.out.println();
        System.out.println("Choisissez le service que vous voulez utiliser :");
        System.out.println();

        System.out.println("    |1| Enregistrer un bac");
        System.out.println("    |2| Statistiques");
        System.out.println("    |3| Trouver et notifier un consommateur");
        System.out.println("    |4| Signaler un problème à MunicipInfo");
        System.out.println("    |0| Retour à l'accueil");
        System.out.println();
        System.out.println("   Vos métriques écologiques du mois de novembre: ");
        System.out.println();
        System.out.println("   * Ratio C/N: "+cN+"       * Composte (lbs): "+qC      );
        System.out.println("   * Recyclage (lbs): "+qR+"  * Ordure (lbs): "+ qD);
        

        int choix;
        while (true){
            System.out.println();
            System.out.print("Entrez votre choix: ");

            try{
                choix = scanner.nextInt();
    
                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 4");
                }
                if(choix >= 5){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 4");
                }
                
            }
            catch (InputMismatchException e){
                System.out.println(" Erreur: Vous devez entrer un chiffre");
                System.out.println();
                scanner.nextLine();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                scanner.nextLine();
                continue;
            } 
            break;
        }
        
        switch(choix){
            case 1:
            
                System.out.println();
                bac.menu2();

                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }

                
                menuPrincipal(id, ad);

                break;
               
            case 2:
                
                System.out.println();
                stat.menu5(id);
                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }
                
                menuPrincipal(id, ad);
                break;
                
            case 3:
                
                System.out.println();
                cons.menu4();
                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }
                menuPrincipal(id, ad);
                break;
            case 4: 
                
                System.out.println();
                prob.menu3();
                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }
                
                menuPrincipal(id, ad);

                break;
            case 0:
            System.out.println("Retour à l'accueil...");
            try {
                TimeUnit.SECONDS.sleep(3);
            }
            catch (Exception e) {
                System.out.println("Erreur");
            }
                Main.accueil();
                break;

        }

        
    }
    
    
}
