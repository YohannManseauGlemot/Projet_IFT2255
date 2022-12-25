import java.util.Scanner;
import java.util.InputMismatchException;

public class Notifier {
    private static Scanner scan = new Scanner(System.in);
    private static Scanner scan1 = new Scanner(System.in);
    //private MunicipInfoService municipInfo = new MunicipInfoService();

    
    public void menu(){
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

        int choix;
        while (true){
            System.out.print("Entrez votre choix: ");

            try{
                choix = scan.nextInt();
    
                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 2");
                }
                if(choix > 2){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 2");
                }
                
            }
            catch (InputMismatchException e){
                System.out.println(" Erreur: Vous devez entrer un chiffre");
                System.out.println();
                scan.next();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                scan.next();
                continue;
            } 
            break;
        }
        switch(choix){
            case 1:

                sensibilisation();
                break;
               
            case 2:
                accumulation();
                break;
            case 0:

                System.out.println("Retour au menu principal...");
                break;
        }
    
    }

    public void sensibilisation(){
        String notifS;

        System.out.println("Veuillez rédiger votre requête de sensibilisation: ");
        System.out.println();
        notifS = scan1.nextLine();
        //municipInfo.postMessage(notifS);
        System.out.println();
        System.out.println("Votre requête a été enregistrée, les résidents en seront notifié !");

    }
    public void accumulation(){
        String notifA;

        System.out.println("Veuillez rédiger votre requête d'accumulation: ");
        System.out.println();
        notifA = scan1.nextLine();
        //municipInfo.postMessage(notifA);
        System.out.println();
        System.out.println("Votre requête a été enregistrée, les résidents en seront notifié !");
    }


}
