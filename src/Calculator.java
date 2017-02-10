import java.util.List;

/**
 * Created by Глеб on 08.02.2017.
 */
public interface Calculator {

    double sum(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b);

    void calculate(List<String> list);

}
