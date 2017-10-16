public class PrintIntegersE{
	public static void main(String[] args){
		int i = 0;
		while(true){
			if(Math.sqrt(i) < 4.321)
				System.out.println(i);
			else
				break;
			++i;
		}
	}
}