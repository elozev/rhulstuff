import java.util.Scanner;
public class Suffix{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String s1 = scan.nextLine();

		System.out.println("Enter the second string: ");
		String s2 = scan.nextLine();


		char[] s1arr = s1.toCharArray();
		char[] s2arr = s2.toCharArray();

		int counter = s2arr.length - 1;
		for(int i = s1arr.length - 1; i > 0; i--){
			if(s1arr[i] != s2arr[counter]){
				System.out.println("The first is NOT suffix of of the second!");
				System.exit(1);
			}
			counter--;
		} 
		System.out.println("The first is suffix of of the second!");
	}
}