import java.util.Scanner;

public class TriangleRight{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter height of the triangle: ");
		int h = scanner.nextInt();

		int spaces = h - 1;
	
		for(int i = 0; i < h; i++){
			String line = "";

			for(int j = 0; j < h; j++){
				if(j < spaces)
					line += " ";
				else
					line += "o";
			}

			System.out.println(line);
			spaces--;
		}
	}
}