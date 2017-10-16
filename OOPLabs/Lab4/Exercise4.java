import java.util.Scanner;
public class Exercise4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n;
		System.out.println("Enter some n: ");
		n = scanner.nextInt();


		int sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i;
		}
		System.out.println("Average: " + (double)sum/n);
	}
}