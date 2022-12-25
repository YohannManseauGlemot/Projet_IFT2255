import java.util.Scanner;
public class SignalerProbleme {
    
    private static Scanner scan = new Scanner(System.in);
    //private MunicipInfoService municipInfo = new MunicipInfoService();

    public void titre(){
        System.out.print("**************************\n*  Signaler un problème  *\n**************************");
    }

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
        nom =scan.nextLine();
        //scanner.close();
        System.out.println();
        System.out.println("Adresse: ");
        adresse = scan.nextLine();
        System.out.println();
        System.out.println("Courriel: ");
        courriel = scan.nextLine();
        System.out.println();
        System.out.println("Type de problème: ");
        type = scan.nextLine();
        System.out.println();
        System.out.println("Vos informations ont été enregistrées avec succès");
        System.out.println();
        System.out.println("Veuillez rédiger votre requête: ");
        texte = scan.nextLine();

        //municipInfo.postMessage(texte); //Simule l'envoie du message à MunicipInfo
        
        System.out.println();
        System.out.println("Nous vous remercions pour votre requête, MunicipInfo vous contactera sous peu");

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
