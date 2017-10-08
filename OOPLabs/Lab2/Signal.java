import java.util.Scanner;
class Signal{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n;

		System.out.print("Enter number: ");
		n = scanner.nextInt();

		if(n >= 0)
			System.out.println("Positive!");
		else
			System.out.println("Negative!");
	}
}