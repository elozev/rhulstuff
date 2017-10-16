 import java.util.Scanner;

 public class Halve{
 	public static void main(String[] args){
 		Scanner scan = new Scanner(System.in);
 		System.out.println("Enter a string: ");
 		// String line = scan.nextLine();
 		String s = scan.nextLine();

 		char [] a = s.toCharArray();
 		for(int i = 0; i < (a.length/2); i++){
			System.out.print(a[i]); 			
 		}
 		
 	}
 }