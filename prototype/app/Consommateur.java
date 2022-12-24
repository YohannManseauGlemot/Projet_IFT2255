import java.util.Scanner;
import java.util.InputMismatchException;

public class Consommateur extends Main{
    private static Scanner scan = new Scanner(System.in);
    private static Scanner scan2 = new Scanner(System.in);
    private int[] noteConsommateur = {0,0,0,0,0,0,0,0,0,0};

    public void consommateur(){
        //listConsommateur(): simule l'appel à la liste des consommateur
        System.out.println("Liste de consommateurs disponibles: ");
        System.out.println();
        System.out.println(noteConsommateur[0]+" 1. Composte Montréal");
        System.out.println(noteConsommateur[1]+" 2. Mayor Environnement");
        System.out.println(noteConsommateur[2]+" 3. Tervita");
        System.out.println(noteConsommateur[3]+" 4. Waste services inc.");
        System.out.println(noteConsommateur[4]+" 5. GFL environmental inc.");
        System.out.println(noteConsommateur[5]+" 6. Monsieur débris");
        System.out.println(noteConsommateur[6]+" 7. Polystyvert");
        System.out.println(noteConsommateur[7]+" 8. E-waste");
        System.out.println(noteConsommateur[8]+" 9. Multi-recycle");
        System.out.println(noteConsommateur[9]+" 10. Cyclejunk");
        System.out.println();

        int choix;
        while (true){
            System.out.print("Entrez le numéro du consommateur que vous voulez sélectionner: ");

            try{
                choix = scan.nextInt();

                if(choix > 10 || choix < 1){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 1 et 10");
                }
                
            }
            catch (InputMismatchException e){
                System.out.println(" Erreur: Vous devez entrer un chiffre");
                System.out.println();
                scan.nextLine();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                scan.nextLine();
                continue;
            } 
            break;
        }
        System.out.println();
        System.out.println("Voici les informations du consommateur choisi: ");
        System.out.println();
        //"compostemontreal@gmail.com","123456","Composte Montreal","123","5147366677","composte", "600 tonnes"}
        System.out.println("Nom: "+ consommateur[choix-1][2]);
        System.out.println("Courriel: "+ consommateur[choix-1][0]);
        System.out.println("Code: "+ consommateur[choix-1][3]);
        System.out.println("Telephone: "+ consommateur[choix-1][4]);
        System.out.println("Types de dechets: "+ consommateur[choix-1][5]);
        System.out.println("Capacite: "+ consommateur[choix-1][6]);

        String enter;

        while (true){
            System.out.println();
            System.out.println("Cliquez sur ENTER pour retourner au menu principal");
       

            try{
                enter = scan2.nextLine();
    
                if(enter.length() != 0 ){

                    throw new InputException(" Erreur: Veuillez cliquer sur ENTER");
                    
                }
                
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                scan2.nextLine();
                continue;
            } 
            break;
        }
        System.out.println("Retour au menu principal...");
    }

    public void noter(){
        System.out.println("Liste des consommateurs: ");
        System.out.println();
        System.out.println(noteConsommateur[0]+" 1. Composte Montréal");
        System.out.println(noteConsommateur[1]+" 2. Mayor Environnement");
        System.out.println(noteConsommateur[2]+" 3. Tervita");
        System.out.println(noteConsommateur[3]+" 4. Waste services inc.");
        System.out.println(noteConsommateur[4]+" 5. GFL environmental inc.");
        System.out.println(noteConsommateur[5]+" 6. Monsieur débris");
        System.out.println(noteConsommateur[6]+" 7. Polystyvert");
        System.out.println(noteConsommateur[7]+" 8. E-waste");
        System.out.println(noteConsommateur[8]+" 9. Multi-recycle");
        System.out.println(noteConsommateur[9]+" 10. Cyclejunk");
        System.out.println();

        int num;
        while(true){
            System.out.println("Veuillez entrer le numéro du consommateur à noter: ");

            try{
                num = scan.nextInt();
                if(num >10 || num < 1){
                    throw new InputException("Le numéro du consommateur doit être entre 1 et 10");
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
        
        
        int note;
        while(true){
            System.out.println("Veuillez noter ce consommateur sur une note de 1 à 5: ");

            try{
                note = scan.nextInt();
                if(note >5 || note < 1){
                    throw new InputException("La note doit être entre 1 et 5");
                }
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                scan.next();
                continue;
            } 
            break;
            

        }
        //"[0,0,0,0,0,0,0,0,0]"

        if(this.noteConsommateur[num-1] == 0){
            this.noteConsommateur[num-1] = note;
        }
        else{
            this.noteConsommateur[num-1] = ((this.noteConsommateur[num-1] + note) /2);
        }

        String reponse;
        int compteur = 0;
        while(true){
            System.out.println();
            System.out.println("Voulez-vous noter un autre consommateur? (Oui/Non): ");
            
            try{
                
                reponse = scan.next();
                
                

                if(reponse.equalsIgnoreCase("Oui") == true){

                    compteur++;
                    
                    noter();
                }
                if(reponse.equalsIgnoreCase("Non") == true){
                    
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

    public void menu4() {
        System.out.println();
        String l1 = "**********************************";
        String l2 = "*Trouver et noter un consommateur*";
        String l3 = "**********************************";

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println();

        String choix;

        while(true){
            System.out.println("   1. Noter un consommateur");
            System.out.println("   2. Choisir un consommateur");
            System.out.println("   0. Retour au menu principal");
            System.out.println();
            System.out.println("Entrer votre choix: ");

             choix = scan2.nextLine();

             if(Integer.parseInt(choix) == 1){
                noter();
                
                menu4();
                break;

             }
             if(Integer.parseInt(choix) == 2){
                consommateur();
                menu4();
                break;
                
             }
             if(Integer.parseInt(choix) == 0){
                System.out.println();
                System.out.println("Retour au menu principal...");
                System.out.println();
                break;
             }

        }
        
    }
    
}
