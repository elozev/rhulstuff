public class Parentheses {
	public static void main(String[] args){
		int x = 4-3*5+6;
		int y = 4-(3*5)+6;
		int z = (4 - 3) * 5 + 6;
		int b = 4 - (3 * 5 + 6);

		System.out.println("4 − 3 ∗ 5 + 6 = " + x);
		System.out.println("4 − (3 ∗ 5) + 6 = " + y);
		System.out.println("(4 − 3) ∗ 5 + 6 = " + z);
		System.out.println("4 − (3 ∗ 5 + 6) = " + b);
	}
}
