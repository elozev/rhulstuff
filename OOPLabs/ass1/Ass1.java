import java.io.*;
import java.util.Scanner;

public class Ass1{

	private static void printLettersAtTheBottom(){
		for(int k = 0; k < 26; k++){
				System.out.print((char)(k + 65) + " | ");
			}
		System.out.println("");
	}

	private static void printHistogram(int mostEcounteredLetter, int[] counters){
		for(int j = mostEcounteredLetter; j > 0; j--){
			for(int k = 0; k < 26; k++){
				if(counters[k] >= j)
					System.out.print("* | ");
				else
					System.out.print("  | ");
			}
			System.out.println(j);
		}		
	}

	private static void printLettersWithCount(int[] counters){
		for(int i = 0; i < 26; i++){
				char letter = (char)(i + 65);
				System.out.println(letter + ": " + counters[i]);
		}
	}

	private static int findMostEcounteredLetter(int[] counters){
		int mostEcounteredLetterCounter = 0;			
		for(int i = 0; i < 26; i++)
			if(mostEcounteredLetterCounter < counters[i])
				mostEcounteredLetterCounter = counters[i];
	
		return mostEcounteredLetterCounter;
	}

	public static void main(String[] args){
		String filename = "jc.txt";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter path to file: ");
		filename = scanner.nextLine();

		File file = new File(filename); 
		int[] counters = new int[27];

		Scanner inputFile;
		try{
			inputFile = new Scanner(file);	
			int lineCounter = 0;
			
			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				lineCounter++;

				char[] splitLine = line.toCharArray();
				for(int i = 0; i < splitLine.length - 1; i++){
					if((splitLine[i] >= 65) && (splitLine[i] <= 90)){
						counters[splitLine[i] - 65]++;
					}else if((splitLine[i] >= 97) && (splitLine[i] <= 122)){
						counters[splitLine[i] - 97]++;
					}
				}
			}

			


			printLettersWithCount(counters);
			printHistogram(findMostEcounteredLetter(counters), counters);
			printLettersAtTheBottom();
			
			System.out.println(filename + " has " + lineCounter + " lines");
			inputFile.close();
		} catch (FileNotFoundException e){
			System.out.println("File Found Exception!");
			e.printStackTrace();
		}
	}
}