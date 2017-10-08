class GenerateEven{
	public static void main(String [] args){
		double x;
		int r;
		int i = 0;
		do{
			x = ((Math.random() * 100) + 0);
			r = Math.toIntExact(Math.floor(x));
			System.out.println("iterations =" + i++);
		}while(r % 2 != 0);
		System.out.println(r);
	}
}
