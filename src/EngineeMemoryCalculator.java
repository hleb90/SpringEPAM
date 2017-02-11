import java.util.List;
/**
 * Created by Глеб on 10.02.2017.
 */
public class EngineeMemoryCalculator extends MemoryCalculator implements EngineerCalculatorInterface {  // the calculators type is 3 !!!

    private static double result;
    private double memory = 0;

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
            }if (COS.equals(currentValue)) {
                result = cos(result);
            }if (EXP.equals(currentValue)){
                result = exp(result);
            }if (SQRT.equals(currentValue)){
                result = sqrt(result);
            }if (MC.equals(currentValue)){
                clear();
            }if (MS.equals(currentValue)){
                memory = setValue(result);
                String nextCurrentValue = list.get(i + 1);
                result = Double.parseDouble(nextCurrentValue);
            }if (MR.equals(currentValue)){
                result = getValue(memory);
            }if (M_PLUS.equals(currentValue)){
                memory += increaseValue(result);
                if ((i + 2) > list.size()) {
                    result = 0;
                }else {
                    String nextCurrentValue = list.get(i + 1);
                    result = Double.parseDouble(nextCurrentValue);
                }
            }if (M_MINUS.equals(currentValue)){
                memory -= decreaseValue(result);
                if ((i + 2) > list.size()) {
                    result = 0;
                }else {
                    String nextCurrentValue = list.get(i + 1);
                    result = Double.parseDouble(nextCurrentValue);
                }
            }
        }
        String theLastValue = list.get(list.size() - 1);
        if (M_PLUS.equals(theLastValue) || M_MINUS.equals(theLastValue)){
            System.out.println(memory);
        }else {
            System.out.println(result);
        }
    }
}

