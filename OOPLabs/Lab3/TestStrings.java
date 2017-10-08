import java.util.Scanner;
class TestStrings{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String a,b;

		System.out.print("Enter first string: ");
		a = scanner.nextLine();

		System.out.print("Enter second string: ");
		b = scanner.nextLine();
		

		if(a.equals(b)){
			System.out.println("They are equal!");
		}else{
			System.out.println("They are NOT equal!");
		}
	}
}