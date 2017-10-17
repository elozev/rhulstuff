public class PrintIntegersOpt{
	public static void main(String[] args){
		for(int i = 0;;i++){
			if(Math.pow(2, i) <= 1024)
				System.out.println(i);
			else
				break;
		}
	}
}