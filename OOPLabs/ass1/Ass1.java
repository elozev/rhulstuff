import java.io.*;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

public class Ass1{
	public static void main(String[] args){
		String filename = "jc.txt";
		File file = new File(filename); 
		Scanner inputFile;
		int[] counters = new int[27];

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

			for(int i = 0; i < 26; i++){
				char letter = (char)(i + 65);
				System.out.println(letter + ": " + counters[i]);
			}
			for(int i = 0; i < 26; i++){
				char letter = (char)(i + 65);

				System.out.print(letter + ": ");
				for(int j = 0; j < counters[i]; j++){
					System.out.print('*');
				}
				System.out.println();
			}

			System.out.println(filename + " has " + lineCounter + " lines");
			inputFile.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}