import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private static final int LOGIN = 0, 
    USERMENU = 1, CONSMENU = 2, ENRG = 3, 
    STATS = 4, TROUV = 5, PROB = 6, NOTIF = 7, 
    SENSIB = 8, ACCUM = 9, ETATBAC = 10, 
    METR = 11, TRAIT=12, ACTIV=13,
    NOTER = 14, CHOIX = 15;
    private static Scanner input = new Scanner(System.in);
    private static int systemState = 0;
    private static int ID;
    private static DataBase dataBase;
    private static User user;
    private static boolean running;
    
    public static void main(String[] args) throws Exception{
        running = true;

        while(running){
            switch(systemState){
                case LOGIN:
                    loginSequence();
                break;
                case USERMENU:
                    userMenu();
                break;
                case CONSMENU:
                    consummerMenu();
                break;
                case ENRG:
                    enregisterBac();
                break;
                case STATS:
                    voirStatistiques();
                break;
                case TROUV:
                break;
                case PROB:
                break;
                case NOTIF:
                    notifier();
                break;
                case SENSIB:
                    sensibilisation();
                break;
                case ACCUM:
                    accumulation();
                break;
                case ETATBAC:
                    etatBac();
                break;
                case METR:
                    metriques();
                break;
                case TRAIT:
                    traitement();
                break;
                case ACTIV:
                    activites();
                break;
                default:
                break;
            }
        }
        

    }

    private static void loginSequence(){ //State #0
        GUI.login();
        
        int choix;
        while(true){
            try {
                choix = input.nextInt();

                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 2");
                }
                if(choix >= 3){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 2");
                }
            }
            catch (InputMismatchException e){
                System.out.println(" Erreur: Vous devez entrer un chiffre");
                System.out.println();
                input.next();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                input.next();
                continue;
            } 
            break;
        }

        String userName;
        String userPassword;
        User potentialUSer;
        switch(choix){
            case 0:
                GUI.merci();
                running = false;
                break;
            case 1:
                GUI.askUsername();
                userName = input.next();
                GUI.askUserPassword();
                userPassword = input.next();
                potentialUSer = DataBase.validateUser(userName, userPassword);
                if(potentialUSer != null){
                    user = potentialUSer;
                    systemState = USERMENU;
                }else{
                    systemState = LOGIN; //refaire le login
                }
                break;
            case 2:
                GUI.askUsername();
                userName = input.next();
                GUI.askUserPassword();
                userPassword = input.next();
                potentialUSer = DataBase.validateUser(userName, userPassword);
                if(potentialUSer != null){
                    user = potentialUSer;
                    systemState = CONSMENU; // Consummer menu
                }else{
                    systemState = LOGIN; //refaire le login
                }
                break;
        }
    }

    private static void userMenu(){
        GUI.userMenu();

        int choix;
        while (true){
            try{
                choix = input.nextInt();
    
                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 4");
                }
                if(choix >= 5){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 4");
                }
                
            }
            catch (InputMismatchException e){
                System.out.println(" Erreur: Vous devez entrer un chiffre");
                System.out.println();
                input.nextLine();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                input.nextLine();
                continue;
            } 
            break;
        }

        switch(choix){
            case 0: 
                GUI.retour();
                systemState = LOGIN;
            break;
            case 1:
                systemState = ENRG;
            break;
            case 2:
                systemState = STATS;
            break;
            case 3:
                systemState = TROUV;
            break;
            case 4:
                systemState = PROB;
            break;
        }
    }

    private static void consummerMenu(){
        GUI.consummerMenu();

        int choix;
        while (true){

            try{
                choix = input.nextInt();
    
                if(Integer.toString(choix).length() != 1 ){

                    throw new InputException(" Erreur: Votre choix doit contenir un seul chiffre entre 0 et 1"); // Changer le 4  en cas de changements
                }
                if(choix >= 5){
                    throw new InputException("Erreur: Veuillez entrer un chiffre entre 0 et 1");
                }
                
            }
            catch (InputMismatchException e){
                System.out.println(" Erreur: Vous devez entrer un chiffre");
                System.out.println();
                input.nextLine();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                input.nextLine();
                continue;
            } 
            break;
        }
        switch(choix){
            case 0:
                GUI.retour();
                systemState = LOGIN;
                break;
            case 1:
                systemState = NOTIF; //TODO: placeholder
                break;
        }
    }

    private static void enregisterBac(){
        GUI.enregisterBac();

        input.nextLine();
        input.nextLine();

        String nomBac;
        String typeBac;

        GUI.askBacName();
        nomBac = input.nextLine();
        GUI.askBacType();
        typeBac = input.nextLine();
        GUI.bacConfirmAndRedo();

        String reponse;
        while(true){
            
            try{
                
                reponse = input.nextLine();
                
                if(reponse.equalsIgnoreCase("Oui") == true){
                    systemState = ENRG;
                    break;
                }
                if(reponse.equalsIgnoreCase("Non") == true){
                    GUI.retour();
                    systemState = USERMENU;
                    break;

                } else{
                    throw new InputException("Veuillez entrez Oui ou Non");
                }
            }
            catch(InputException e){
                System.out.println(e.toString());
                System.out.println();
                input.nextLine();
                continue;
            }
        }
        
    }

    private static void notifier(){
        GUI.notifier();

        int choix;
        while (true){
            System.out.print("Entrez votre choix: ");

            try{
                choix = input.nextInt();
    
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
                input.next();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                input.next();
                continue;
            } 
            break;
        }
        switch(choix){
            case 1:
                systemState = SENSIB;
            break;
               
            case 2:
                systemState = ACCUM;
            break;
            case 0:
                GUI.retour();
                systemState = CONSMENU;
            break;
        }
    }

    private static void sensibilisation(){
        GUI.sensibilisation();

        String notification = input.nextLine();

        GUI.notifConfirmation();

        systemState = CONSMENU;
    }

    private static void accumulation(){
        GUI.accumulation();

        String notification = input.nextLine();

        GUI.notifConfirmation();

        systemState = CONSMENU;
        GUI.retour();
    }

    private static void voirStatistiques(){
        GUI.statistiquesMenu();

        int choix;
        while (true){

            try{
                choix = input.nextInt();
    
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
                input.nextLine();
                continue;
            }
            catch (InputException e){
                System.out.println(e.toString());
                System.out.println();
                input.nextLine();
                continue;
            } 
            break;
        }
        switch(choix){
            case 1:
                systemState = ETATBAC;
            break;
               
            case 2:
                systemState = METR;
            break;
                
            case 3:
                systemState = TRAIT;
            break;
            case 4: 
                systemState = ACTIV;
            break;
            case 0:
                systemState = USERMENU;
                GUI.retour();
            break;

        }
    }

    private static void etatBac(){
        GUI.etatBac(user.etatBac);
        input.next();
        systemState = STATS;
    }

    private static void metriques(){
        GUI.metriques(user.metrique);

        double fV =0, fB =0, fN =0;
        while(true){
            String reponse = input.next();
            if(reponse.equalsIgnoreCase("Oui")){
                while (true){
                
                    try{
                        System.out.print("Facteur Vert: ");
                        fV = input.nextInt();
                        System.out.println("Facteur Bleu: ");
                        fB = input.nextInt();
                        System.out.println("Facteur Noir: ");
                        fN = input.nextInt();
                    
                        if(fV < 0 || fB <0 || fN < 0){
                            throw new InputException("Erreur: Veuillez entrer un nombre positif");
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println(" Erreur: Vous devez entrer un chiffre");
                        System.out.println();
                        input.nextLine();
                        continue;
                    }
                    catch (InputException e){
                        System.out.println(e.toString());
                        System.out.println();
                        input.nextLine();
                        continue;
                    } 
                    break;
                }
                break;
            }
            else if(reponse.equalsIgnoreCase("Non")){
                break;
            }
            else{
                continue;
            }
        }

        GUI.metriques(user.metrique, fV, fB, fN);

        while(true){
            String afficher = input.next();
            if(afficher.equalsIgnoreCase("Oui")){
                GUI.metriquesInfo(true);
                break;
            }
            if(afficher.equalsIgnoreCase("Non")){
                GUI.metriquesInfo(false);
                break;
            }
            else{
                continue;
            }
        }

        input.next();
        
        systemState = STATS;

    }

    private static void traitement(){
        GUI.traitement(user.traitement);

        input.next();
        systemState = STATS;
    }

    private static void activites(){
        GUI.activites(user.activites);

        input.next();
        systemState = STATS;
    }


}
