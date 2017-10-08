import java.util.Scanner;
public class ReducedPrice {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello to the museum! What is your age?");
		int age = scanner.nextInt();

		if((age < 26) || (age > 60))
			System.out.println("Reduced!");
		else 
			System.out.println("Full price!");
	}
}
