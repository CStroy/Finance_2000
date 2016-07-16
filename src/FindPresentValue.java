/**
 * Created by troy.hill on 7/7/16.
 */
import java.util.*;
import java.math.*;

public class FindPresentValue {
    public static float main(String[] args) {

        // Create scanner to read user input
        Scanner inp = new Scanner(System.in);

        // Get the user input for the following data points
        System.out.println("Enter the Future Value\n");
        final float FUTURE_VALUE = inp.nextFloat();
        System.out.println("Enter the interest rate\n");
        final float ANNUAL_INTEREST_RATE = inp.nextFloat();
        System.out.println("Enter the number of Annual Compoundings\n");
        final float NUMBER_OF_COMPOUNDS_ANNUALLY = inp.nextFloat();
        System.out.println("Enter the number of years\n");
        final float NUMBER_YEARS = inp.nextFloat();

        float test = findPresentValue(FUTURE_VALUE, ANNUAL_INTEREST_RATE, NUMBER_OF_COMPOUNDS_ANNUALLY, NUMBER_YEARS);
        return round(test, 2);
    }

    public static float round(float d, int decimalPlace) {
        return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
    }

    private static float findPresentValue(float PRESENT_VALUE, float ANNUAL_INTEREST_RATE, float NUMBER_OF_COMPOUNDS_ANNUALLY, float NUMBER_YEARS) {
        float denomo = buildDenominator(ANNUAL_INTEREST_RATE, NUMBER_OF_COMPOUNDS_ANNUALLY, NUMBER_YEARS);
        return PRESENT_VALUE / denomo;
    }

    private static float buildDenominator(float ANNUAL_INTEREST_RATE, float NUMBER_OF_COMPOUNDS_ANNUALLY, float NUMBER_YEARS) {
        float paren = 1 + (ANNUAL_INTEREST_RATE / NUMBER_OF_COMPOUNDS_ANNUALLY);
        float exponent = NUMBER_OF_COMPOUNDS_ANNUALLY * NUMBER_YEARS;
        float raised = paren;

        for (int i = 0; i < (int)exponent - 1; i++) {
            raised *= paren;
        }

        return raised;
    }

}