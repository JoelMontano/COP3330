import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException{
        String dataFile = "problem2.txt";
        String outputFile = "unique_word_counts.txt";
        DuplicateCounter dupe = new DuplicateCounter();
        dupe.count(dataFile);
        dupe.write(outputFile);
    }
}
