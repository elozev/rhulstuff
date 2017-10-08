class GenerateOdd{
	public static void main(String [] args){
		double x;
		int r;
		int i = 0;
		do{
			x = (Math.random() * 100) + 1;
			r = Math.toIntExact(Math.round(x));
			System.out.println("iterations =" + i++);
		}while(r % 2 == 0);
		System.out.println(r);
	}
}
