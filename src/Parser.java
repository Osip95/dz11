import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class Parser {
    ArrayList<String> parser(File file) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.toLowerCase(Locale.ROOT));
            }
            return lines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
