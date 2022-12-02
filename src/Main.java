import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //task 1
        List<String> listOfSuffering = Arrays.asList("страдание", "страдания", "страданию", "страданием", "страдании");
        int countStradanieScanerParser = 0;
        int countStradanieBufferedParser = 0;
        File file = new File("voin.txt");
        Parser bufferedParser = new Parser();
        ScanerParser scanerParser = new ScanerParser();
        ArrayList<String> listScanerParser = scanerParser.parser(file);
        ArrayList<String> listBufferedParser = bufferedParser.parser(file);
        for (String str : listScanerParser) {
            for (String str2 : listOfSuffering) {
                countStradanieScanerParser = countStradanieScanerParser + count(str, str2);
            }
        }
        for (String str : listBufferedParser) {
            for (String str2 : listOfSuffering) {
                countStradanieBufferedParser = countStradanieBufferedParser + count(str, str2);
            }
        }
        System.out.println("Количество вхождений слова \"страдание\" c использованием" +
                " класса BufferedReader: " + countStradanieBufferedParser);
        System.out.println("Количество вхождений слова \"страдание\" c использованием" +
                " класса Scanner: " + countStradanieScanerParser);

        //task 2
        for(int i = 1, n = 1; ; i++){
            System.out.print(i*n+" ");
            if(n==10&&i==10) break;
            if(i==10){
                System.out.println("");
                i=0;
                n++;
            }
        }


    }

    static private int count(String line, String word) {
        return (line.length() - line.replace(word, "").length()) / word.length();
    }
}