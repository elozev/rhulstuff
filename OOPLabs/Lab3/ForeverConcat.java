import java.util.Scanner;
class ForeverConcat{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String bigString = "";


		while(true){
			System.out.print("Input string: ");
			String a = scanner.nextLine();
			if(a.equals("")){
				break;
			}
			bigString += a;
			System.out.println(bigString);
		}
	}	
}