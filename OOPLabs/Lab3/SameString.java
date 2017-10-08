import java.util.Scanner;
class SameString {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String prevStr = "";

		do{
			System.out.print("Enter String: ");
			String str = scanner.nextLine();
			if(str.equals(prevStr)){
				System.out.println(str);
				System.exit(1);
			}
			prevStr = str;
		}while(true);
	}
}