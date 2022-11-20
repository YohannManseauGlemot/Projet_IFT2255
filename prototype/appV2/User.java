import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class User {
    int identifiant;
    String[] etatBac = new String[25];
    String[] metrique = new String[15];
    String activites = "";
    String traitement = "";

    public User(){}
    public User(int identifiant){
        this.identifiant = identifiant;
         try {
            Scanner userFileReader = new Scanner(new File("prototype/appV2/UserData/" + identifiant + ".user"));
            userFileReader.useDelimiter(",");
            // 25 premiers pour etatbac
            for (int i = 0; i < etatBac.length; i++) {
                etatBac[i] = userFileReader.next();
            }
            for (int i = 0; i < metrique.length; i++) {
                metrique[i] = userFileReader.next();
            }
            userFileReader = new Scanner(new File("prototype/appV2/UserData/montreal.trait_log"));
            while(userFileReader.hasNext()){
                traitement = traitement + userFileReader.nextLine() + "\n";
            }
            userFileReader = new Scanner(new File("prototype/appV2/UserData/montreal.activ_log"));
            while(userFileReader.hasNext()){
                activites = activites + userFileReader.nextLine() + "\n";
            }
         } catch (FileNotFoundException e) {
            System.out.println("Error: Database unaccessible.");
         }
         catch( NoSuchElementException e){
            System.out.println("out of bounds?");
         }
        
    }
}
