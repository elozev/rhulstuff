import java.util.Scanner;
public class Exercise5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n;
		System.out.println("Enter some n: ");
		n = scanner.nextInt();


		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		System.out.println("Factorial: " + fact);
	}
}