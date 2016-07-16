import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by troy.hill on 7/10/16.
 */
public class NetPresentValue {

    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);

        int times = inp.nextInt();
        float[] total = new float[times];

        for (int i = 0; i < times; i++) {
            total[i] = FindPresentValue.main(null);
        }

        float sum = 0;
        for (int i = 0; i < times; i++) {
            sum += total[i];
        }
    }
}
