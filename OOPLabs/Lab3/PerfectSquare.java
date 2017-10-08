import java.util.Scanner;
class PerfectSquare{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter num: ");
		int n = scanner.nextInt();

		double sqrt = Math.sqrt(n);
		int x = (int) sqrt;
		if(Math.pow(sqrt, 2) == Math.pow(x, 2)){
			System.out.println("This number is perfect square!");
		}else{
			System.out.println("This number is NOT perfect square!");
		}
	}
}