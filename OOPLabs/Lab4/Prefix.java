import java.util.Scanner;
public class Prefix{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String s1 = scan.nextLine();

		System.out.println("Enter the second string: ");
		String s2 = scan.nextLine();


		char[] s1arr = s1.toCharArray();
		char[] s2arr = s2.toCharArray();

		for(int i = 0; i < s1arr.length; i++){
			if(s1arr[i] != s2arr[i]){
				System.out.println("The first is NOT prefix of of the second!");
				System.exit(1);
			}
		} 
		System.out.println("The first is prefix of of the second!");
	}
}