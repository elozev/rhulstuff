import java.util.Scanner;
class BigProd{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long prod = 0;

		while(true){
			System.out.print("Enter number: ");
			int n = scanner.nextInt();
			
			if(n == 1)
				break;
			prod += n;
			System.out.println("Prod: " + prod);
		}
	}
}