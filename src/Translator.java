import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) throws FileNotFoundException {
        /*Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        System.out.println();

        Scanner input = new Scanner(new File(text));
        String line = input.nextLine();
        line = line.toLowerCase();
        String[] word = line.split(" ");*/


        File file = new File("/Users/elysetoder/Documents/DooleyHacks/src/text");
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] word = line.split(" ");
        //String word;

        while (sc.hasNextLine()) {
            if (line == "LOL"){

            }

        }

    }

}