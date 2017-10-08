import java.util.Scanner;	

public class ReadNumber {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int s;

		System.out.println("Enter a number:");
		s = scan.nextInt();
		System.out.println("The number is: " + s);
	}
}
