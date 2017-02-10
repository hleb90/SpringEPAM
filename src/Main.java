import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Глеб on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        try {
            String testDataFileName = args[0];
            Path path = Paths.get(testDataFileName);
            File file = path.toFile();

            if (!file.exists()) {
                throw new IllegalArgumentException("File not found.");
            }

            ParsingFile parsingFile = new ParsingFile(file);
            parsingFile.parsing();
        } catch (IndexOutOfBoundsException ex) {
            throw new IllegalArgumentException("Please specify the name of the file with test data as first argument of the program.");
        }
    }
}

