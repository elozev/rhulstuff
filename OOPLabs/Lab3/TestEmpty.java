import java.util.Scanner;
class TestEmpty{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input string: ");
		String a = scanner.nextLine();

		if (a.length() == 0) {
			System.out.println("The string length is empty");
		}

		if (a.isEmpty()) {
			System.out.println("The string length is empty");
		}
		System.out.println("The string length is " + a.length());

	}	
}