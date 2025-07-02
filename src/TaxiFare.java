import java.util.Scanner;
public class TaxiFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base_fare = 50;
		int fare_per_km = 10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total distence traveled in KM: ");
		float distence_traveled = sc.nextFloat();
		
		float total_fare;
		if(distence_traveled <= 1) {
			total_fare = base_fare;
		}else {
			total_fare = base_fare + (distence_traveled * fare_per_km);
		}
		
		System.out.println("You need to pay:: "+ total_fare);
		sc.close();
	}

}
