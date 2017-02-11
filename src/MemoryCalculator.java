import java.util.List;
/**
 * Created by Глеб on 10.02.2017.
 */
public class MemoryCalculator extends SimpleCalculator implements MemoryCalculatorInterface{ // the calculators type is 1 !!!

    private double memory = 0;
    private double result;

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

