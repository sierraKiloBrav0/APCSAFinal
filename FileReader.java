import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
* Program grabs lines from a certain file and adds all of them to an array list
*
* @author Team
* @version 1.0
* date: 1/13/2025
*/

class FileReader {

    public FileReader() {
        // no initialization
    }

    public ArrayList<String> getContent(String filePath) {
        ArrayList<String> lines = new ArrayList<>();
        
        try (Scanner in = new Scanner(new File(filePath))) {
            while (in.hasNextLine()) {
                lines.add(in.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return lines;
    }
}
