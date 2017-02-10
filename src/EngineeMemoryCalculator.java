import java.util.List;
/**
 * Created by Глеб on 10.02.2017.
 */
public class EngineeMemoryCalculator extends MemoryCalculator implements EngineerCalculatorInterface {  // the calculators type is 3 !!!

    private static double result = 0;
    private static double memory = 0;

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
            }if ("cos".equals(list.get(i))) {
                result = cos(result);
            }if ("exp".equals(list.get(i))){
                result = exp(result);
            }if ("sqrt".equals(list.get(i))){
                result = sqrt(result);
            }if ("MC".equals(list.get(i))){
                clear();
            }if ("MS".equals(list.get(i))){
                memory = setValue(result);
                result = Double.parseDouble(list.get(i + 1));
            }if ("MR".equals(list.get(i))){
                result = getValue(memory);
            }if ("M+".equals(list.get(i))){
                memory += increaseValue(result);
                if ((i + 2) > list.size()) {
                    result = 0;
                }else {
                    result = Double.parseDouble(list.get(i + 1));
                }
            }if ("M-".equals(list.get(i))){
                memory -= decreaseValue(result);
                if ((i + 2) > list.size()) {
                    result = 0;
                }else {
                    result = Double.parseDouble(list.get(i + 1));
                }
            }
        }
        if ("M+".equals(list.get(list.size() - 1)) || "M-".equals(list.get(list.size() - 1))){
            System.out.println(memory);
        }else {
            System.out.println(result);
        }
    }
}

