import java.util.List;
/**
 * Created by Глеб on 10.02.2017.
 */
public class EngineerCalculator extends SimpleCalculator implements EngineerCalculatorInterface { // the calculators type is 2!!!

    private static double result;

    @Override
    public double cos(double result) {
        return Math.cos(result);
    }

    @Override
    public double exp(double result) {
        return Math.exp(result);
    }

    @Override
    public double sqrt(double result) {
        return Math.sqrt(result);
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
            }if ("-".equals(list.get(i))) {
                double b = Double.parseDouble(list.get(i + 1));
                result = sub(result, b);
            }if ("*".equals(list.get(i))) {
                double b = Double.parseDouble(list.get(i + 1));
                result = mul(result, b);
            }if ("/".equals(list.get(i))){
                double b = Double.parseDouble(list.get(i + 1));
                result = div(result, b);
            }if ("cos".equals(list.get(i))) {
                result = cos(result);
            }if ("exp".equals(list.get(i))){
                result = exp(result);
            }if ("sqrt".equals(list.get(i))){
                result = sqrt(result);
            }
        }
        System.out.println(result);
    }
}

