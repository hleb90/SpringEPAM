import java.util.List;
/**
 * Created by Глеб on 10.02.2017.
 */
public class MemoryCalculator extends SimpleCalculator implements MemoryCalculatorInterface{ // the calculators type is 1 !!!

    private double memory = 0;
    private double value, result = 0;

    @Override
    public void clear() {   //  the sign of the method is "MC"    !!!!
        memory = 0;
    }

    @Override
    public double setValue(double result) {   //   the sign of the method is "MS"    !!!!!
        return result;
    }

    @Override
    public double getValue(double memory) {    //   the sign of the method is  "MR"   !!!!
        return memory;
    }

    @Override
    public double increaseValue(double result) {    //   the sign of the method is "M+"   !!!!!!
        return result;
    }

    @Override
    public double decreaseValue(double result) {    // the sign of the method is "M-"    !!!!!!
        return result;
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

