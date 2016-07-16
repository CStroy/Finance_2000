/**
 * Created by troy.hill on 7/11/16.
 */
import java.math.*;

public class BaseClass {

    public static void main(String args[]) {
        System.out.println(getDenominator(10, 2, 2));
    }

    /**
     * This method
     * @param interestRate
     * @param numberOfCompounds
     * @param numberOfPeriods
     * @return
     */
    public static float getDenominator(float interestRate, float numberOfCompounds, int numberOfPeriods) {
        float rate = ((interestRate / 100) / numberOfCompounds) + 1;
        float power = numberOfCompounds * numberOfPeriods;
        float total = 1;

        for (int i = 0; i < power; i++) {
            total *= rate;
        }
        return round(total, 2);
    }

    public static float round(float d, int decimalPlace) {
        return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
    }
}
