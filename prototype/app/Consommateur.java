import java.util.Scanner;
import java.util.InputMismatchException;
public class Consommateur {
    private static Scanner scan = new Scanner(System.in);

    public void menu4() throws Exception{
        System.out.println();
        String l1 = "*************************";
        String l2 = "*Trouver un consommateur*";
        String l3 = "*************************";

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println();

        System.out.println("Liste de consommateurs disponible: ");
        System.out.println();
        System.out.println("Consommateur 1");
        System.out.println("Consommateur 2");
        System.out.println("Consommateur 3");
        System.out.println("Consommateur 4");
        System.out.println();
        System.out.println("Veuillez sélectionner le consommateur avec qui vous voulez travailler");

        String enter;

        while (true){
            System.out.println();
            System.out.println("Cliquez sur ENTER pour retourner au menu principal");
       

            try{
                enter = scan.nextLine();
    
                if(enter.length() != 0 ){

                    throw new InputException(" Erreur: Veuillez cliquer sur ENTER");
                    
                }
                
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                scan.nextLine();
                continue;
            } 
            break;
        }
        System.out.println("Retour au menu principal...");
        
    }
    
}
