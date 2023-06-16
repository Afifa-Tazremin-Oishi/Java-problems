//3. Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52
//---------------------------------------------------------------------------

public class TwoDecimalPoint {
    public static void main(String[] args) {
        double a = 15.5276 ;

        System.out.println("Double Number: " + a);
        System.out.printf("Upto 2 decimal point = %.2f", a);

    }
}
