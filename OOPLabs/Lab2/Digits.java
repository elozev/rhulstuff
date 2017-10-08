import java.util.Scanner;
class Digits{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int enteredNumber = scanner.nextInt();
		int digits = 0;
		while(enteredNumber != 0){
			enteredNumber /= 10;
			digits++;
		}

		System.out.println("Digits: " + digits);
	}   	
}