import java.util.Scanner;
//import java.util.InputMismatchException;

public class EnregistrerBac{

    private static Scanner qr = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);
    private static Scanner scan2 = new Scanner(System.in);
    private static Scanner scan3 = new Scanner(System.in);

    /*
     * |||||||||||||||||||||||||
     * |Enregistrement d'un bac|   
     * |||||||||||||||||||||||||
     */
    public void menu2() throws Exception{
        String l1 = "*************************";
        String l2 = "*Enregistrement d'un bac*";
        String l3 = "*************************";

        String l4 = " ----------------------------";
        String l5 = "|                            |";

        System.out.println(l1);
        System.out.println(l2); 
        System.out.println(l3);
        
        

        String enter;

        while (true){
            System.out.println("Veuillez scanner votre code QR et cliquer sur ENTER:");
        System.out.println(l4);
        for(int i = 0; i < 8; i++){
            System.out.println(l5);
        }
        System.out.println(l4);

            try{
                enter = qr.nextLine();
    
                if(enter.length() != 0 ){

                    throw new InputException(" Erreur: Veuillez cliquer sur ENTER");
                    
                }
                
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                qr.nextLine();
                continue;
            } 
            break;
        }

        String nom;
        String type;

        System.out.println("Veuillez donner le nom du bac: ");
        nom = scan.nextLine(); 
        
        
        System.out.print("Quel est le type de votre bac? (Bleu, Vert ou Noir): ");

        type = scan2.nextLine();
        System.out.println("Votre bac a été enregistré avec succès!");

        String reponse;
        

        while(true){
            System.out.println("Voulez-vous ajouter un autre bac? (Oui/Non): ");

            try{
                reponse = scan3.nextLine();

                if(reponse.equalsIgnoreCase("Oui") == true){
                    menu2();
                }
                if(reponse.equalsIgnoreCase("Non") == true){
                    break;

                }
                else{
                    throw new InputException("Veuillez entrez Oui ou Non");
                }
            }
            catch(InputException e){

                System.out.println(e.toString());
                scan3.next();
                continue;
            }
        }

        System.out.println("Retour au menu principal...");
        
        



    }
        
    
     
    
}
