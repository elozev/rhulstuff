import java.util.Scanner;
class EvenLength{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input string: ");
		String a = scanner.nextLine();

		if (a.length() % 2 == 0) {
			System.out.println(a);
		}
	}	
}