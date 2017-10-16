 import java.util.Scanner;

 public class Swap{
 	public static void main(String[] args){
 		Scanner scan = new Scanner(System.in);
 		System.out.println("Enter a string: ");
 		// String line = scan.nextLine();
 		String s = scan.nextLine();

 		char [] a = s.toCharArray();
 		if(a.length > 1){
 			char temp = a[a.length - 1];
 			a[a.length - 1] = a[0];
 			a[0] = temp;
 		}

 		String swaped = new String(a);
 		System.out.println(swaped);
 		
 	}
 }