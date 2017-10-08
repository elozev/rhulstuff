import java.util.Scanner;
class StringLength{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input string: ");
		String a = scanner.nextLine();

		System.out.print("The string length is " + a.length());

	}	
}