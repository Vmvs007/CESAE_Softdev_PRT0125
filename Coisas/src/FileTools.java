import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTools {

    public static void printFile(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
