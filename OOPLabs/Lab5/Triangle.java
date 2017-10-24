import java.util.Scanner;

public class Triangle{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter height of the triangle: ");
		int h = scanner.nextInt();

		int lastLine = h*2 - 1;

		int spaces = h - 1;
		
		final int middle = lastLine / 2;
		int dots = 1;
		for(int i = 0; i < h; i++){
			String line = "";
			char[] lineArr = new char[lastLine];

			for(int z = 0; z < lastLine; z++){
				lineArr[z] = '-';
			}

			lineArr[middle] = 'o';
			int dotsToLineUp = dots - 1;
			if(dots != 1){
				int middleToLeft = middle - 1;
				int middleToRight = middle + 1;
				while(dotsToLineUp > 0){
					dotsToLineUp -= 2;
						lineArr[middleToLeft--] = 'o';
						lineArr[middleToRight++] = 'o';
				}
			}

			for(int y = 0; y < lastLine; y++){
				System.out.print(lineArr[y]);
			}
			System.out.println();
				dots += 2;
		}
	}
}