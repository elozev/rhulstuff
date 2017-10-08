class HarmoSum{
	public static void main(String[] args){
		double leftToRightSum = 0;
		for(int i = 1; i <= 50000 ; i++){
			leftToRightSum += (1/i);
		}

		System.out.println("Sum Left to Right: " + leftToRightSum);

		double rightToLeftSum = 0;
		for(int i = 50000; i >= 1 ; i--){
			rightToLeftSum += (1/i);
		}
		System.out.println("Sum Right to Left: " + rightToLeftSum);
	}   	
}