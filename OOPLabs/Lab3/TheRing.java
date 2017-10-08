import java.util.Scanner;
class TheRing{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String a = "Frodo", b = "trash";

		while(true){
			String buff = scanner.nextLine();
			if(buff.equals(a)){
				System.out.println("You have found The Ring!");
				break;
			}

			b += buff;
			System.out.println(b);
		}
	}
}