import java.util.Scanner;

public class ATMCheck {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your current balance: ");
        double current_bal = input.nextDouble();

        System.out.println("Hello, " + name + "! Your current balance is " + current_bal);

        System.out.print("Enter your withdrawl amount: ");
        double withdrawl_amt = input.nextDouble();
        
        if (withdrawl_amt > current_bal) {
        	System.out.println("insufficient funds");
        }else {
        	current_bal -= withdrawl_amt;
        	System.out.println("Succesful..!!, Current balance: "+ current_bal);
        }
        	
        input.close();
    }

}
