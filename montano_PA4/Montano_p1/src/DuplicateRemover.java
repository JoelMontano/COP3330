import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateRemover {
    private Set<String> uniqueWords;
    public void remove(String dataFile) throws FileNotFoundException {
        Scanner scnr = new Scanner(new File(dataFile));
        String word;
        uniqueWords = new HashSet<String>();
        while (scnr.hasNext()) {
            word = scnr.next();
            uniqueWords.add(word);
        }
        scnr.close();
    }
    public void write(String outputFile) throws IOException{
        File file;
        FileWriter filew = null;
        file = new File(outputFile);
        String word2;

        if(file.exists()){
            filew = new FileWriter(file, true);
            Iterator iterate = uniqueWords.iterator();

            while(iterate.hasNext()) {
                word2 = (String) iterate.next();
                filew.write(word2 + "\n");
            }
            filew.close();
        }
        else{
            file.createNewFile();
            filew = new FileWriter(file);
            Iterator iterate = uniqueWords.iterator();

            while(iterate.hasNext()){
                word2 = (String)iterate.next();
                filew.write(word2 + "\n");
            }
            filew.close();
        }
    }
}
