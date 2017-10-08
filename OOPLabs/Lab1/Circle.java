class Circle{
	public static void main(String [] args){
		double radius = Math.random();
		System.out.println("radius = " + radius + ", circumference = " + (radius * 2 * Math.PI) + ",area = " + (Math.pow(radius, 2) * Math.PI));
	}
}