import java.util.Scanner;
class SquareSum{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n;
		int sqrSum = 0;

		System.out.println("Enter number: ");
		n = scanner.nextInt();

		do{
			sqrSum += Math.pow(n, 2);
			n--;
		}while(n > 0);

		System.out.println("The sum is: " + sqrSum);
	}
}