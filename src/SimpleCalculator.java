import java.util.List;

/**
 * Created by Глеб on 10.02.2017.
 */
public class SimpleCalculator implements Calculator  {   // The calculators type is 0 !!!

    private static double result = 0;
    @Override
    public double sum(double a, double b) {
        return  a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public void calculate(List<String> list) {
        for (String iter: list) {
            iter.trim();
        }
        result = Double.parseDouble(list.get(0));
        for (int i = 1; i < list.size(); i++){

            if ("+".equals(list.get(i))) {
                double b = Double.parseDouble(list.get(i + 1));
                result = sum(result, b);
            }
            if ("-".equals(list.get(i))) {
                double b = Double.parseDouble(list.get(i + 1));
                result = sub(result, b);
            }
            if ("*".equals(list.get(i))) {
                double b = Double.parseDouble(list.get(i + 1));
                result = mul(result, b);
            }if ("/".equals(list.get(i))){
                double b = Double.parseDouble(list.get(i + 1));
                result = div(result, b);
            }
        }
        System.out.println(result);

    }
}
