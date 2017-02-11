/**
 * Created by Глеб on 10.02.2017.
 */
public interface MemoryCalculatorInterface extends Calculator {

    String MC = "MC";
    String MS = "MS";
    String MR = "MR";
    String M_PLUS = "M+";
    String M_MINUS = "M-";

    void clear();
    double setValue(double result);
    double getValue(double memory);
    double increaseValue(double result);
    double decreaseValue(double result);
}

