import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ScanerParser {
    ArrayList<String> parser(File file) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(file));
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                lines.add(line.toLowerCase(Locale.ROOT));
            }
            scanner.close();
            return lines;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
