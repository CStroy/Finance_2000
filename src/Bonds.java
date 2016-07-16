/**
 * Created by troy.hill on 7/11/16.
 */
public class Bonds {

    public static void main () {
        float FACE_VALUE;                  //F
        float COUPON_RATE;                 //c
        float COUPON_PAYMENT;              //Fc
        float YEARS_TO_MATURITY;           //T
        float INTEREST_RATE;               //i
        float BOND_PRCE;                   //Pb

    }

    private float build (float CP, float IR, int NY, float BP) {
        float total[] = new float[NY];

        for (int i = 1; i < NY; i++) {
            float sum = CP / buildDenom(IR, i);
        }

        return BP;
    }

    private float buildDenom(float IR, int i) {
        float denom = 1 + IR;
        float total[] = new float[i];
        float newTotal = 0;

        if(i == 1) {
            return denom;
        }

        for (int j =0; j<i; j++) {
            total[j] *= denom;
        }

        for (int k=0; k<i; k++) {
            newTotal += total[k];
        }
        return newTotal;
    }
}
