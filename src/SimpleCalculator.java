import java.util.List;

/**
 * Created by Глеб on 10.02.2017.
 */
public class SimpleCalculator implements Calculator  {   // The calculators type is 0 !!!

    private double result;

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
        for (String elem: list) {
            elem.trim();
        }
        result = Double.parseDouble(list.get(0));
        for (int i = 1; i < list.size(); i++){
            String currentValue = list.get(i);

            if (SUM.equals(currentValue)) {
                String nextCurrentValue = list.get(i + 1);
                double b = Double.parseDouble(nextCurrentValue);
                result = sum(result, b);
            }
            if (SUB.equals(currentValue)) {
                String nextCurrentValue = list.get(i + 1);
                double b = Double.parseDouble(nextCurrentValue);
                result = sub(result, b);
            }
            if (MUL.equals(currentValue)) {
                String nextCurrentValue = list.get(i + 1);
                double b = Double.parseDouble(nextCurrentValue);
                result = mul(result, b);
            }if (DIV.equals(currentValue)){
                String nextCurrentValue = list.get(i + 1);
                double b = Double.parseDouble(nextCurrentValue);
                result = div(result, b);
            }
        }
        System.out.println(result);

    }
}
