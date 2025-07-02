import java.util.Scanner;
public class AgeCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:: ");
		int age = sc.nextInt();
		if(age > 0) {
			if (1 <= age && age <= 12) {
				System.out.println("Child");
			}else if(13 <= age && age <= 19) {
				System.out.println("Teenager");
			}else if(20 <= age && age <= 59) {
				System.out.println("Adult");
			}else {
				System.out.println("Senior");
			}
		}else {
			System.out.println("Invalid...!");
		}
		sc.close();
	}

}
