import java.util.Scanner;
class Power{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double a;
		int n;

		System.out.println("Enter number a: ");
		a = scanner.nextDouble();

		System.out.println("Enter number n: ");
		n = scanner.nextInt();

		double multipl = a;
		
		if(n > 0){
			do {
				--n;
				a *= multipl;
			}while(n != 1);
		}else if(n < 0){
			do {
				++n;
				a /= multipl;
			}while(n != 1);
		}else{
			a = 1;
		}
		
		System.out.println("Pow: " + a);
	}
}