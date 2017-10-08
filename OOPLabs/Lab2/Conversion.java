import java.util.Scanner;

public class Conversion {


	public static double cToF(double c){
		return (9*c)/5 + 32;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double s;

		System.out.println("Enter tempature in C:");
		s = scan.nextDouble();
		System.out.println("Tempature in F is: " + cToF(s));
	}
}
