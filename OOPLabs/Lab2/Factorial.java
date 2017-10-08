import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n, fac = 1, i = 1;

		System.out.print("Input: ");
		n = scanner.nextInt();

		if(n < 0){
			System.out.println("Error, negative number!");
			System.exit(1);	
		}
		while(i <= n){
			fac *= i++;
		}
		System.out.println("!" + n + " is: " + fac);
	}
}