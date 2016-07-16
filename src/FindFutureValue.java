/**
 * Created by troy.hill on 7/9/16.
 */
import java.util.*;
import java.math.*;

public class FindFutureValue {
    public static void main(String[] args) {

        // Create scanner to read user input
        Scanner inp = new Scanner(System.in);

        // Get the user input for the following data points
        System.out.println("Enter the Present Value\n");
        final float PRESENT_VALUE = inp.nextFloat();
        System.out.println("Enter the interest rate\n");
        final float ANNUAL_INTEREST_RATE = inp.nextFloat();
        System.out.println("Enter the number of Annual Compoundings\n");
        final float NUMBER_OF_COMPOUNDS_ANNUALLY = inp.nextFloat();
        System.out.println("Enter the number of years\n");
        final float NUMBER_YEARS = inp.nextFloat();

        float test = findFutureValue(PRESENT_VALUE, ANNUAL_INTEREST_RATE, NUMBER_OF_COMPOUNDS_ANNUALLY, NUMBER_YEARS);
        System.out.println(round(test, 2));
    }

    public static float round(float d, int decimalPlace) {
        return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
    }

    private static float findFutureValue(float PRESENT_VALUE, float ANNUAL_INTEREST_RATE, float NUMBER_OF_COMPOUNDS_ANNUALLY, float NUMBER_YEARS) {
        // Build the ()
        float paren = 1 + (ANNUAL_INTEREST_RATE / NUMBER_OF_COMPOUNDS_ANNUALLY);
        float exponent = NUMBER_OF_COMPOUNDS_ANNUALLY * NUMBER_YEARS;
        float raisedVaue = paren;

        //Raise the paren to the power from the exponent
        for (int i = 0; i < (int)exponent - 1; i++) {
            raisedVaue *= paren;
            }
        float FV = PRESENT_VALUE * raisedVaue;

        return FV;
    }

}
