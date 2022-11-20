import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DataBase {
    
    public static User validateUser(String userName, String password){
        Scanner fileReader;
        User foundUser = null;
        try {
            fileReader = new Scanner(new File("prototype/appV2/UserBase.txt"));
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                Scanner lineReader = new Scanner(line);
                lineReader.useDelimiter(",");
                String readName = lineReader.next();
                String readPass = lineReader.next();
                if( readName.equals(userName) && readPass.equals(password)){
                    int readID = lineReader.nextInt();
                    String readType = lineReader.next();
                    if(readType == "CONS"){
                        foundUser = new Consummer(readID);
                    }else{
                        foundUser = new User(readID);
                    }
                    lineReader.close();
                    break;
                }
                lineReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Database unaccessible.");
        }

        return foundUser;
    }
    
}
