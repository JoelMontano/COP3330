import java.io.IOException;
public class Application {
    public static void main (String[] args) throws IOException {
        DuplicateRemover dupe = new DuplicateRemover();
        dupe.remove("problem1.txt");
        dupe.write("uniqueWords.txt");
    }
}
