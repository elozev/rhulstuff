class Rounding{
	public static void main(String [] args){
		double x = (Math.random() * 10) + 0	;
		int r = Math.toIntExact(Math.round(x));
		System.out.println(x + "\n" + r);
	}
}
