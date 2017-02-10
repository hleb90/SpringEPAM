/**
 * Created by Глеб on 10.02.2017.
 */
public class CalculatorFactory {

    static Calculator createCalculatorByType(String type){

        if (type.equals("0")) {
            return new SimpleCalculator();
        }
        if (type.equals("1")) {
            return new MemoryCalculator();
        }
        if (type.equals("2")) {
            return new EngineerCalculator();
        }
        if (type.equals("3")) {
            return new EngineeMemoryCalculator();
        }
        else {
            throw new RuntimeException("Неверный тип калькулятора!");
        }
    }
}

