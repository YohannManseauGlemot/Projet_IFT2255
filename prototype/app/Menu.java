import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;



public class Menu {

    private static Scanner scanner = new Scanner(System.in);
     
    

    public void clearConsole(int a){
        for (int i = 0; i < a; ++i) 
            System.out.println();

    }
    
    /**
     * @throws Exception
     */
    public void menuPrincipal() throws Exception {
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

        System.out.println("    |1| Enregistrer un bac");
        System.out.println("    |2| Statistiques");
        System.out.println("    |3| Trouver un consommateur");
        System.out.println("    |4| Signaler un problème à la ville");
        System.out.println("    |0| Quitter bineco");
        System.out.println();
        

        int choix;
        while (true){
            System.out.print("Entrez votre choix: ");

            try{
                choix = scanner.nextInt();
    
                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 5");
                }
                if(choix > 5){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 5");
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
            EnregistrerBac bac = new EnregistrerBac();
                clearConsole(10);
                bac.menu2();

                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }

                Main main2 = new Main();
                main2.retour();

                break;
               
            case 2:
            break;
                
            case 3:
                clearConsole(2);
                break;
            case 4: 
                SignalerProbleme prob = new SignalerProbleme();
                clearConsole(10);
                prob.menu3();
                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (Exception e) {
                    System.out.println("Erreur");
                }
                Main main3 = new Main();
                main3.retour();

                break;
            case 5:
                clearConsole(2);
                break;
            case 0:
                
                break;

        }

        
    }
    
    
}
