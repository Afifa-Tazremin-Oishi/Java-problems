//20. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?
// [Extract the digits from the paragraph and calculate the price]
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class PriceCalculate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Laptop Price: "  );
        int laptopPrice = input.nextInt();
        System.out.println("Enter Mouse Price: " );
        int mousePrice = input.nextInt();

        // Calculating the total cost after applying a 15% discount
        double totalCost = laptopPrice + mousePrice;
        double discountAmount = totalCost * 0.15;
        double discountedCost = totalCost - discountAmount;

        // Displaying the results

        System.out.println("Total Cost before discount: " + totalCost + " tk");
        System.out.println("Discounted Cost (15% off): " + discountedCost + " tk");
    }
}
