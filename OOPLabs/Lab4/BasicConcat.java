import java.util.Scanner;
public class BasicConcat{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String s1 = scan.nextLine();

		System.out.println("Enter the second string: ");
		String s2 = scan.nextLine();


		char[] s1arr = s1.toCharArray();
		char[] s2arr = s2.toCharArray();
		char[] s3arr = new char[s1arr.length + s2arr.length];

		for(int i = 0; i < s1arr.length; i++){
			s3arr[i] = s1arr[i];
		} 
		for(int i = 0; i < s2arr.length; i++){
			s3arr[s1arr.length + i] = s2arr[i];
		} 

		String finalString = new String(s3arr);
		System.out.println("The concat is: " + finalString);
	}
}