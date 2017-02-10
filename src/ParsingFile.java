import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Глеб on 10.02.2017.
 */
public class ParsingFile {

    private File file;
    String type;

    public ParsingFile(File file) {
        this.file = file;
    }

    void parsing(){
        try {
            Scanner scanner = new Scanner(file);
            type = scanner.next();
            Calculator calculator = CalculatorFactory.createCalculatorByType(type);
            List<String> list = new ArrayList<>();
            while (scanner.hasNext()){
                list.add(scanner.next());
            }
            calculator.calculate(list);
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }

    }

}

