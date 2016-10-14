import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static boolean readFile(String path) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(path));
            String line = fileReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = fileReader.readLine();
            }
            return true;
        } catch (FileNotFoundException e) {
            //throw new IllegalArgumentException(e);
            System.out.println("FileNotFoundException " + e);
        } catch (IOException e) {
            //throw new IllegalArgumentException(e);
            System.out.println("IOException " + e);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        if(scanner.hasNextLine()) {
            String path = scanner.nextLine();
            while(!readFile(path)) {
                System.out.println("Повторите ввод: ");
                path = scanner.nextLine();
            }
            // /home/dmitry/Desktop/file.txt
        }
    }
}
