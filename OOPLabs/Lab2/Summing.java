import java.util.Scanner;
class Summing{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n, sum = 0, i = 0;

		System.out.print("Input: ");
		n = scanner.nextInt();

		if(n < 0){
			System.out.println("Error, negative number!");
			System.exit(1);	
		}
		while(i <= n){
			sum += i++;
		}
		System.out.println("The sum from 0 to " + n + " is " + sum);
	}
}