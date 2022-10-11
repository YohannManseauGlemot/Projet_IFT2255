import java.util.Scanner;
public class SignalerProbleme {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);

    public void menu3(){
        System.out.println();

        String l1 = "**************************";
        String l2 = "*  Signaler un problème  *";
        String l3 = "**************************";

        System.out.println(l1);
        System.out.println(l2); 
        System.out.println(l3);

        String nom;
        String adresse;
        String courriel;
        String type;
        String texte;

        System.out.println("Veuillez inscrire votre nom, adresse de domicile, adresse courriel et le type de votre problème");
        System.out.println("Nom: ");
        nom =scanner.nextLine();
        //scanner.close();
        System.out.println();
        System.out.println("Adresse: ");
        adresse = scanner.nextLine();
        System.out.println();
        System.out.println("Courriel: ");
        courriel = scanner.nextLine();
        System.out.println();
        System.out.println("Type de problème: ");
        type = scanner.nextLine();
        System.out.println();
        System.out.println("Vos informations ont été enregistrées avec succès");
        System.out.println();
        System.out.println("Veuillez rédiger votre requête: ");
        texte = scanner.nextLine();
        System.out.println();
        System.out.println("Nous vous remercions pour votre requête, la ville de Montréal vous contactera sous peu");

        String reponse;
        int compteur = 0;
        while(true){
            System.out.println();
            System.out.println("Voulez-vous rédiger une autre requête? (Oui/Non): ");

            try{
                reponse = scan.nextLine();

                if(reponse.equalsIgnoreCase("Oui") == true){
                    compteur++;
                    
                    menu3();
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
