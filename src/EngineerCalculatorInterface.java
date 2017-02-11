/**
 * Created by Глеб on 10.02.2017.
 */
public interface EngineerCalculatorInterface extends Calculator{

    String COS = "cos";
    String EXP = "exp";
    String SQRT = "sqrt";

    double cos(double result);
    double exp(double result);
    double sqrt(double result);
}

