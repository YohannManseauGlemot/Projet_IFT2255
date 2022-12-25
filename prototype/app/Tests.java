import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Tests {

    Main main = new Main();
    @Test
    public void testValide() {
        // Test valid login
        String email = "bobdylan@gmail.com";
        String password = "123456";
        assertEquals(false, Main.valide(email, password));

        // Test invalid login
        email = "invalid@example.com";
        password = "wrongpassword";
        assertEquals(false, Main.valide(email, password));
    }

    @Test
    public void testPrintLogo() {
        Consommateur cons = new Consommateur();

        // Capture the output of the printLogo method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the printLogo method
        cons.printLogo();

        // Check that the output matches the expected logo
        String expectedOutput = "**********************************\n*Trouver et noter un consommateur*\n**********************************";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testPrintL() {
        EnregistrerBac bac = new EnregistrerBac();

        // Capture the output of the printLogo method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the printLogo method
        bac.printL();

        // Check that the output matches the expected logo
        String expectedOutput = "*************************\n*Enregistrement d'un bac*\n*************************";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testClearConsole() {
        // Create a new ClearConsole object
        Menu menu = new Menu();

        // Capture the output of the clearConsole method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the clearConsole method with a value of 5
        menu.clearConsole(0);

        // Check that the output is 5 newline characters
        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testLogo() {
        Menu menu = new Menu();

        // Capture the output of the printLogo method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the printLogo method
        menu.logo();

        // Check that the output matches the expected logo
        String expectedOutput = "    ____  _                      \n   |  _ "+'\\'+"(_)                     \n   |  _ "+'\\'+"(_)                     \n   |  _ <| | '_ \\ / _ \\/ __/ _ \\ \n   | |_) | | | | |  __/ (_| (_) |\n   |____/|_|_| |_|\\___|\\___\\___/ ";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void titreTest() {
        SignalerProbleme prob = new SignalerProbleme();

        // Capture the output of the printLogo method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the printLogo method
        prob.titre();

        // Check that the output matches the expected logo
        String expectedOutput = "**************************\n*  Signaler un problème  *\n**************************";
        assertEquals(expectedOutput, outContent.toString());
    }


}