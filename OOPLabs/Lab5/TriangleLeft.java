import java.util.Scanner;

public class TriangleLeft{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter height of the triangle: ");
		int h = scanner.nextInt();
	
		for(int i = 0; i <= h; i++){
			String line = "";

			for(int j = 0; j < i; j++){
				line += "o";
			}

			System.out.println(line);
		}
	}
}