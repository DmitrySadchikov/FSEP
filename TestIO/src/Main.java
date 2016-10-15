import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void readFile(String path) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(path));
            String line = fileReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = fileReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException " + e);
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }

    public static void main(String[] args) {
        readFile(args[0]);
    }
}
