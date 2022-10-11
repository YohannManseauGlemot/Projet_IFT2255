import java.util.Scanner;
import java.util.InputMismatchException;

public class Statistiques {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);

    public void enter(){
        String enter;

        while (true){
            System.out.println();
            System.out.println("Cliquez sur ENTER de votre clavier pour retourner au volet statistques");
            enter = scan.nextLine();

            try{
                
    
                if(enter.length() != 0 ){

                    throw new InputException(" Erreur: Veuillez cliquer sur ENTER");
                    
                }
                
            }
            catch (InputException e){
                System.out.println(e.toString());
                scan.nextLine();
                continue;
            } 
            break;
        }

    }

    public void etatBac(){
        System.out.println("Voici l'état actuel de vos différents bacs, 11 octobre 2022:");
        System.out.println("                 Bac Brun      Bac Bleu      Bac Noir");
        System.out.println("Niv. remplissage:  50%           40%           30%");
        System.out.println("Température:       45°C          20°C          30°C");
        System.out.println("    pH:             6            N/A           N/A ");
        System.out.println("Humidité:          35%           N/A           N/A        ");
        System.out.println();
        System.out.println("Ci dessous vous pouvez voir la composition de chacun de vos bacs. Le contenu de chacun des bacs est décrit au dessus de sa composition:");
        System.out.println();
        System.out.println("Bac Brun: Résidus alimentaire/Produits fibreux/Produits compostable/Herbes et plantes"+ "(en % du contenu du bac)");
        System.out.println("               50%           /        15%     /         10%        /         25%       ");
        System.out.println();
        System.out.println("Bac Bleu: Papier/Carton/Verre/Metal/Conteneurs de plastique" + "(En % du contenu du bac)");
        System.out.println("            10% /  20% / 15% / 20% / 35%                                      ");
        System.out.println();
        System.out.println("Bac Noir: Déchets/Matières recyclables/Matières compostable (En % du contenu du bac)");
        System.out.println("            80%  /        10%         /      10% ");

        
        enter();
        
    }
    public void metrique(){

        System.out.println("Ici vous pouvez examiner les métriques écologiques qui reflète l'efficacité du traitement des déchets de la ville de Montréal du mois dernier");
        System.out.println();
        System.out.println("Matière organique collecté par la ville (en tonnes):     | 90 000  |    ");
        System.out.println("Taux de récupération des matières organiques:            |   30%   |    ");
        System.out.println("Matière recyclable collecté par la ville (en tonnes):    | 150 000 |    ");
        System.out.println("Taux de récupération des matières recyclables:           |   65%   |    "); 

        System.out.println();
        System.out.println();

        System.out.println("Voici les métriques écologique au niveau résidentiel, c'est-à-dire une comparaison entre ");
        System.out.println("votre activité écologique et celle des citoyens de la ville de Montréal du mois dernier. Ces métriques sont en lien avec les bac de composte");
        System.out.println();
        System.out.println("                                                    Vous      |  Moyenne des citoyens   ");
        System.out.println("           1.Ration carbone/azote (C/N) :            30:1     |        50:1           ");
        System.out.println("            2.Concentration d'oxygène (%):           10       |        6                ");
        System.out.println("3.Ratio matières compostables/non-compostables:      75:1     |        50:1              ");
        System.out.println("           4.Dégagement de CO2 (lbs):                70       |        50               ");
        System.out.println("       5.Quantité de matière composté (lbs):         200      |        143                        ");
        System.out.println();

        
        String afficher;
        

        
        while(true){
            System.out.print("Afficher les explications des métriques au niveau résidentiel? (Oui/Non) ");
            afficher = scanner.next();
            if(afficher.equalsIgnoreCase("Oui")){
                System.out.println("1. le ratio carbone/azote dans un bac de composte doit être le plus près possible de 30:1");
                System.out.println("pour un compostage optimal.");
                System.out.println();
                System.out.println("2. le taux d'oxygène est important dans un bac de compost puisque sans oxygène, un bac de compost va généré plus de méthane que de CO2.");
                System.out.println(" Le méthane a un pouvoir de réchauffement 80 fois plus élevé que le CO2. Aussi, un compost avec un taux d'oxygène plus élevé vas de décomposer plus rapidement");
                System.out.println();
                System.out.println("3.Le ratio de matière compostable et non compostable indique simplement le rapport entre les déchets bénifique et nuisible pour votre composte");
                System.out.println();
                System.out.println("4. Le dégagement de CO2 vous donne une idée de votre empreinte écologique, par contre il faut garder en tête que plus une personne compost plus elle produira de CO2");
                System.out.println();
                System.out.println("5. La quantité de matière composté permet de vous comparer avec les autres citoyens sur votre taux de compostage");
                System.out.println();
                System.out.println("Note: En moyenne, un bac de compost génère 160 kg de CO2 pour 1 tonne de compost. Donc en assummant qu'un citoyen ");
                System.out.println("prend 2 semaine à remplir son compost à 100 lbs, alors en 1 mois il auras compsoté 200 lbs et géneré environ 70 lbs de CO2");

                break;

            }
            if(afficher.equalsIgnoreCase("Non")){
                break;
            }
            else{
                continue;
            }
        }

        

        enter();

    }
    public void traitement(){

        System.out.println("Voici un aperçu sur le traitement actuel des déchets de la municipalité:");
        System.out.println();
        System.out.println("Checkpoint 1 Collecte: 3 octobre ");
        System.out.println("      - Du 1er au 3 octobre, 20 000 tonnes de matières organiques, 40 000 tonnes de matières recyclables ");
        System.out.println("        et 30 000 tonnes d'ordures ont été collecté par la ville de Montréal.                 ");
        System.out.println();
        System.out.println("Checkpoint 2 Livraison: 10 octobre                     ");
        System.out.println("       - Le 10 octobre, la totalité des matières organiques et recyclables ont été livré à leurs usines respectives pour le triage     ");
        System.out.println("         Les ordures ont toutes été amenées à des sites d'enfouissement et d'incinération               ");
        
        System.out.println();
        
        System.out.println();
        System.out.println("Checkpoint 3 Usage: 21 octobre                 ");
        System.out.println("       - Depuis la livraison du 10 octobre, 30% des matières organiques ont été réutilisées suite au triage. Dans ce 30%,  ");
        System.out.println("         15% à été attribué aux sites de compostage municipaux, 10% aux sites de biométhanisation et 5% à d'autres organismes de compostage.");
        System.out.println("         Le 70% des matières restantes se sont retrouvés dans des sites d'enfouissement et d'incinération       ");
        System.out.println();
        System.out.println("       - Dans les 40 000 tonnes de recyclage, 60% ont été réutilisé après le triage. Dans ce 60%, 40% ont été envoyé à des usines de recyclage  ");
        System.out.println("         et le 20% restant ont été donné à de nombreux organismes de fabrication de vêtements ");



        enter();

    }
    public void activites(){

        System.out.println("Voici les activités auxquelles vous participer: ");
        System.out.println();
        System.out.println("1. Fabrication de chaussures avec des plastiques recyclés");
        System.out.println("2. Écocentre Montréal");
        System.out.println("3. Collecte municipal");
        System.out.println("4. Activité de composte municipal");

        enter();

    }

    public void menu5(){
        System.out.println();
        String l1 = "*************************";
        String l2 = "*      Statistiques     *";
        String l3 = "*************************";

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println("Choisissez la catégorie que vous voulez afficher :");
        System.out.println();

        System.out.println("    |1| État de mes bac");
        System.out.println("    |2| Métriques écologiques");
        System.out.println("    |3| Traitement de mes déchets");
        System.out.println("    |4| Activités que je maintiens ");
        System.out.println("    |0| Retour au menu principal ");
        
        System.out.println();
        

        int choix;
        while (true){
            System.out.print("Entrez votre choix: ");

            try{
                choix = scanner.nextInt();
    
                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 4");
                }
                if(choix > 4){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 4");
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

                etatBac();
                menu5();
                break;
               
            case 2:
                metrique();
                menu5();
                break;
                
            case 3:
                traitement();
                menu5();
                break;
            case 4: 
                activites();
                menu5();
                break;
            case 0:
                System.out.println("Retour au menu principal...");
            
                break;

        }

    }

     
    
}
