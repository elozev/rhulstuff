import java.util.Scanner;
class Year{
	public static void main(String[] args){
		Double generation = (Math.random()*(2000 - 1900)) + 1900.0;
		long year = generation.intValue();

		boolean leap;

		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0)
					leap = true;
				else
					leap = false;
			}else{
				leap = true;
			}
		}else
			leap = false;


		if(leap)
			System.out.println(year + " is leap.");
		else
			System.out.println(year + " is not leap.");
	}   	
}