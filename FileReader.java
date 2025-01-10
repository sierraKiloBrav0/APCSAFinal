import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class FileReader {

    public FileReader() {
        // no initialization
    }

    public ArrayList<String> readLinesFromFile(String filePath) {
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
