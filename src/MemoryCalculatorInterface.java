/**
 * Created by Глеб on 10.02.2017.
 */
public interface MemoryCalculatorInterface extends Calculator {

    void clear();
    double setValue(double result);
    double getValue(double memory);
    double increaseValue(double result);
    double decreaseValue(double result);
}

