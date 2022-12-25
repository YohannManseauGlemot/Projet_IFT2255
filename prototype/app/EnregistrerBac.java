import java.util.Scanner;
//import java.util.InputMismatchException;

public class EnregistrerBac{

   
    private static Scanner scan = new Scanner(System.in);
    
    

    /*
     * |||||||||||||||||||||||||
     * |Enregistrement d'un bac|   
     * |||||||||||||||||||||||||
     */
    public void printL(){
        System.out.print("*************************\n*Enregistrement d'un bac*\n*************************");
    }
    public void menu2(){
        System.out.println();
        printL();
        /* 
        String l1 = "*************************";
        String l2 = "*Enregistrement d'un bac*";
        String l3 = "*************************";

        

        System.out.println(l1);
        System.out.println(l2); 
        System.out.println(l3);
        */
        String l4 = " ----------------------------";
        String l5 = "|                            |";

        String enter;

        while (true){
            System.out.println("Veuillez scanner votre code QR et cliquer sur ENTER:");
        System.out.println(l4);
        for(int i = 0; i < 8; i++){
            System.out.println(l5);
        }
        System.out.println(l4);

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

        String nom;
        String type;

        System.out.println("Veuillez donner le nom du bac: ");
        nom = scan.nextLine(); 
        
        
        System.out.println("Quel est le type de votre bac? (Bleu, Brun ou Noir): ");

        type = scan.nextLine();

        
        System.out.println();
        System.out.println("Votre bac a été enregistré avec succès!");

        String reponse;
        
        int compteur = 0;
        

        while(true){
            System.out.println();
            System.out.println("Voulez-vous ajouter un autre bac? (Oui/Non): ");
            
            try{
                
                reponse = scan.nextLine();
                
                

                if(reponse.equalsIgnoreCase("Oui") == true){

                    compteur++;
                    
                    menu2();
                }
                if(reponse.equalsIgnoreCase("Non") == true){
                    System.out.println("Retour au menu principal...");
                    break;

                }
                else{
                    if(compteur>0){
                        break;
                    }
                    else
                        throw new InputException("Veuillez entrez Oui ou Non");
                }
            }
            catch(InputException e){

                System.out.println(e.toString());
                
                scan.nextLine();
                continue;
            }
        }

        
        
        
    }
        
    
     
    
}
