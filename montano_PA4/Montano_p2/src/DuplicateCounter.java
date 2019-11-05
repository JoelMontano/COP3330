import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Map;

public class DuplicateCounter {
    private Map<String, Integer> wordCounter;
    public void count(String dataFile) throws FileNotFoundException{
        Scanner scnr = new Scanner(new File(dataFile));
        String word;
        wordCounter = new HashMap<String, Integer>();

        while (scnr.hasNext()){
            word = scnr.next();

            if (wordCounter.containsKey(word))
                wordCounter.put(word, wordCounter.get(word)+1);
            else
                wordCounter.put(word, 1);
        }
        scnr.close();
    }
    public void write (String outputFile) throws IOException{
        File file;
        FileWriter filew = null;
        file = new File(outputFile);

        if (file.exists()){
            filew = new FileWriter(file);
            for (Map.Entry entry: wordCounter.entrySet()){
                filew.write(entry.getKey()+":"+entry.getValue()+" "+"\n");
            }
            filew.close();
        }
        else {
            file.createNewFile();
            filew = new FileWriter(file);
            for (Map.Entry entry : wordCounter.entrySet()) {
                filew.write(entry.getKey() + ":" + entry.getValue() + " "+"\n");
            }
            filew.close();
        }

    }
}
