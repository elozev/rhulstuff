import java.util.Scanner;	

public class Mood {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = "";

		System.out.println("How do you feel?");
		s = scan.nextLine();
		System.out.println("Ans: " + s);
	}
}
