//1. Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10
//---------------------------------------------------------------------------------------

public class SwapTwoVariable {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
