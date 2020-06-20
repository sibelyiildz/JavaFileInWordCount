import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\sibel\\Desktop\\test.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //satırdaki kelimeleri bulmak için boşlukları kullanıyoruz.
            words += line.split(" ").length;
        }
        System.out.println("Dosyadaki kelime sayısı : " + words);

    }
}
