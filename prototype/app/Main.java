import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static int identifiant;
    private static Menu menu = new Menu();
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);
    private static String[][] compte = {{"bobdylan@gmail.com","123456"}, {"lebronjames@yahoo.ca","qwerty"}, {"spacecadet@gmail.com","ytrewq"}};
    private static String[][] compte2 = {{"compostemontreal@gmail.com","123456"}, {"mayorenv@yahoo.ca","qwerty"}, {"tervita@gmail.com","ytrewq"},{"wasteservicesinc@gmail.com","54321"},{"gflenv@gmail.com","gfl123"},{"monsieurdebris@gmail.com","mrdebris123"},{"polystyvert@gmail.com","polyvert"},{"ewaste@gmail.com","ewaste$"},{"multirecycle@gmail.com","multi12$"},{"cyclejunk@gmail.com","xsqwerp"}};

    
        
    
     
    public static void main(String[] args) throws Exception {
        
       
        accueil();
  
       

    } 

    public static void accueil(){
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
       

        System.out.println("Choisissez le type de compte avant de vous connecter :");
        System.out.println();

        System.out.println("    |1| Résident");
        System.out.println("    |2| Consommateur");
        //System.out.println("    |3| Trouver un consommateur");
        //System.out.println("    |4| Signaler un problème à la ville");
        System.out.println("    |0| Quitter bineco");
        System.out.println();
        
        int choix;
        while (true){
            System.out.print("Entrez votre choix: ");

            try{
                choix = scanner.nextInt();
    
                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 2");
                }
                if(choix >= 3){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 2");
                }
                
            }
            catch (InputMismatchException e){
                System.out.println(" Erreur: Vous devez entrer un chiffre");
                System.out.println();
                scanner.next();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                scanner.next();
                continue;
            } 
            break;
        }
        
        switch(choix){
            case 1:
                String adresse;
                String mdp;
                System.out.println();
                System.out.println("Veuillez entrer votre adresse courriel: ");
                adresse = scan.next();
               
                System.out.println("Veuillez entrer votre mot de passe: ");
                mdp = scan.next();
                
                boolean login = valide(adresse, mdp, compte);
                 

                if(login == true){
                    
                    if(adresse.equalsIgnoreCase("bobdylan@gmail.com")){
                        identifiant = 0;
                    }
                    else if(adresse.equalsIgnoreCase("lebronjames@yahoo.ca")){
                        identifiant = 1;
                    }
                    else if(adresse.equalsIgnoreCase("spacecadet@gmail.com")){
                        identifiant = 2;
                    }

                    menu.menuPrincipal(identifiant);
                }
                else{
                    accueil();
                }
               

                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }

                

                break;
               
            case 2:
                String adresse2;
                String mdp2;

                System.out.println();
                System.out.println("Veuillez entrer votre adresse courriel: ");
                adresse2 = scan.next();
               
                System.out.println("Veuillez entrer votre mot de passe: ");
                mdp2 = scan.next();
                
                boolean login2 = valide(adresse2, mdp2, compte2);
                 

                if(login2 == true){
                    menu.menuConsommateur();
                }
                else{
                    accueil();
                }


                
                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }
                
                
                break;
            case 0:
                System.out.println("Merci d'avoir utilisé Bineco!");
                break;
        }

    }
    public static boolean valide(String ad, String mdp, String[][] comptes){
        boolean val = false;
        
        
        for (int i = 0; i < comptes.length; i++) {
            if(ad.equalsIgnoreCase(comptes[i][0])){
                
                if(mdp.equalsIgnoreCase(comptes[i][1])){
                    val = true;
                    
                   
                    break;
                }
                
            }
        
        }
        return val;

    }
    
    //public void retour() throws Exception{
       // Menu menuP = new Menu();
       // menuP.menuPrincipal();
   // }
}
