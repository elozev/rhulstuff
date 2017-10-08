import java.util.Scanner;
class Reverse {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter num: ");
		int n = scanner.nextInt();
		
		int enteredNumber = n; 
		int reversedNumber = 0;		 
		
		while(n != 0){
			reversedNumber *= 10;
			reversedNumber += (n % 10);
			n /= 10;
		}
		if(enteredNumber == reversedNumber){
			System.out.println("The entered number is palindromic!");
		}

		System.out.println(reversedNumber);
	}
}