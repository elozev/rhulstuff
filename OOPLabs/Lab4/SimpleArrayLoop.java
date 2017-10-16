public class SimpleArrayLoop{
	public static void main(String[] args){
		String [] a = new String[5];

		for(int i = 0; i < 5; i++){
			a[i] = "Lab " + i;
		}
		for(int i = 0; i < 5; i++){
			System.out.println(a[i]);
		}
	}
}