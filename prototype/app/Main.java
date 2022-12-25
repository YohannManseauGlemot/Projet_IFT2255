import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    private static int identifiant;
    private static Menu menu = new Menu();
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);
    private static String[][] residents = {{"bobdylan@gmail.com","123456"}, {"lebronjames@yahoo.ca","qwerty"}, {"spacecadet@gmail.com","ytrewq"}};
    protected static String[][] consommateur = {{"compostemontreal@gmail.com","123456","Composte Montreal","123","5147366677","composte", "600 tonnes"}, {"mayorenv@yahoo.ca","qwerty","Mayor Environnement","456","450972828","plastique","500 tonnes"}, {"tervita@gmail.com","ytrewq","Tervita","789","5142348765","composte","300 tonnes"},{"wasteservicesinc@gmail.com","54321","Waste Services Inc","321","5149274545","composte","350 tonnes"},{"gflenv@gmail.com","gfl123","GFL Environnement","654","5143678383","composte","275 tonnes"},{"monsieurdebris@gmail.com","mrdebris123","Monsieur Debris","876","5142348789","verre et plastique","400 tonnes"},{"polystyvert@gmail.com","polyvert","Polystyvert","738","5146789876","composte","600 tonnes"},{"ewaste@gmail.com","ewaste$","E-waste","999","4509876543","metal","200 tonnes"},{"multirecycle@gmail.com","multi12$","Multi-recycle","555","5142346153","plastique","500 tonnes"},{"cyclejunk@gmail.com","xsqwerp","Cycle Junk","101","5146274836","metal","300 tonnes"}};

    
        
    
     
    public static void main(String[] args) throws IOException{
        
       
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
       

        System.out.println("Veuillez choisir entre vous connecter à un type de compte ou d'en créer un :");
        System.out.println();

        System.out.println("    |1| Résident");
        System.out.println("    |2| Consommateur");
       
        System.out.println("    |3| Créer un compte");
        System.out.println("    |4| Modifier son profil");
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
                if(choix >= 5){
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
                adresse = scan.nextLine();
               
                System.out.println("Veuillez entrer votre mot de passe: ");
                mdp = scan.nextLine();
                
                boolean login = valide(adresse, mdp);
                 

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
                    else{
                        identifiant = 3;
                    }
                    
                    menu.menuPrincipal(identifiant, adresse);
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
                adresse2 = scan.nextLine();
               
                System.out.println("Veuillez entrer votre mot de passe: ");
                mdp2 = scan.nextLine();
                
                boolean login2 = valide(adresse2, mdp2);
                 

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

            case 3:

            Scanner scanCompte = new Scanner(System.in);
            Scanner scanT =new Scanner(System.in);
            System.out.println("Veuilez choisir le type de compte à créer (Résidents[1], Consommateur[2]): ");
            int type = scanT.nextInt();
            
            System.out.println();
            System.out.print("Entrer votre courriel: ");
            String email = scanCompte.nextLine();
            System.out.println();
            System.out.print("Entrer votre mot de passe: ");
            String password = scanCompte.nextLine();
        
            // Write the email and password to the text file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("accounts.txt", true))) {
              bw.write(email + " " + password);
              bw.newLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
            // Confirm that the account has been created
            System.out.println("Compte créé avec succès!");

            accueil();
            break;
            case 4:
                System.out.println();
                String l1 = "*************************";
                String l2 = "*Modifier son profil*****";
                String l3 = "*************************";
                System.out.println(l1);
                System.out.println(l2);
                System.out.println(l3);
                modifierProfil();
                accueil();
                break;
                
            case 0:
                System.out.println("Merci d'avoir utilisé Bineco!");
                break;
        }

    }
    public static boolean valide(String ad, String mdp){
        boolean val;

        try (BufferedReader br = new BufferedReader(new FileReader("accounts.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
              // Split the line into email and password fields
              String[] fields = line.split(" ");
              String storedEmail = fields[0];
              String storedPassword = fields[1];
      
              
              if (ad.equals(storedEmail) && mdp.equals(storedPassword)) {
                System.out.println("Login successful!");
                val = true;
                return val;
              }
              else{

                continue;
              }
            }  
        } 
        catch (IOException e) {
         
            e.printStackTrace();
        }
        val = false;
        return val;
   }
   public static void modifierProfil() {
    // Prompt the user for the email and password they want to modify
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez votre email: ");
    String email = scanner.nextLine();
    System.out.print("Entrez votre nouveau mot de passe: ");
    String password = scanner.nextLine();

    // Read the file line by line
    String line;
    String modifiedContent = "";
    try {
        BufferedReader reader = new BufferedReader(new FileReader("accounts.txt"));
        while ((line = reader.readLine()) != null) {
            // Split the line into email and password
            String[] parts = line.split(" ");
            String fileEmail = parts[0];
            //String filePassword = parts[1];

            // Check if the email in the file matches the email the user wants to modify
            if (fileEmail.equalsIgnoreCase(email)) {
                // If it matches, modify the password
                modifiedContent += fileEmail + " " + password + "\n";
            } else {
                // If it doesn't match, keep the original content
                modifiedContent += line + "\n";
            }
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Write the modified content back to the file
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.txt"));
        writer.write(modifiedContent);
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println("Vous avez changé votre email et mot de passe!");
}

}
