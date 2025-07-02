import java.util.Scanner;
public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Shoped Amount:: ");
		double purchase_amt = sc.nextDouble();
		double discount = 0.0;
		
		if (purchase_amt >= 5000) {
		    // 20% discount
			discount = 0.20;
		} else if (purchase_amt >= 2000 && purchase_amt <= 4999) {
		    // 10% discount
			discount = 0.10;
		} else if (purchase_amt >= 500 && purchase_amt <= 1999) {
		    // 5% discount
			discount = 0.05;
		} else {
		    // No discount
			System.out.println("Discount not applicable for this amount");
		}
		
		// Calculate discounted amount
        double discountAmount = purchase_amt * discount;
        double finalAmount = purchase_amt - discountAmount;

        // Print the final amount
        System.out.printf("Discount Applied: %.2f", discountAmount);
        System.out.println();
        System.out.printf("Amount to Pay: %.2f", finalAmount);

        sc.close();

	}

}
