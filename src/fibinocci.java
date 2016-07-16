/**
 * Created by troy.hill on 7/16/16.
 */
public class fibinocci {

    public static void main(String args[]) {
        System.out.println(foo(6));
    }

    public static int foo(int n) {
        if (n < 2) {
            return n;

        }
        return (foo(n - 1)) + (foo(n - 2));
    }

}
