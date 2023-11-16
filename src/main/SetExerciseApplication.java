package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class SetExerciseApplication {
	
	Set<String> PokerSet = new HashSet<>();

	public static void main(String[] args) throws IOException {
		
		// extract the data from the CSV
		BufferedReader br = new BufferedReader(new FileReader("PokerHands.csv"));
		
		String currentLine = new String();
		
		while (br.readLine() != null) {
			currentLine = br.readLine();
			PokerSet.add(currentLine.split(",")[0]); //why is this asking for a static set??
		}
		br.close();
		
		
		// remove ACE HIGH and QUEEN HIGH
		for (String handType : PokerSet) {
			if (handType == "ACE HIGH" || handType == "QUEEN HIGH") {
				
			}
			
		}
		
		
		// Update PAIR to DEUCES
		
	}
	
	public static void printToConsole() {

	}
	
	public static Set<String> extractDataFromCSV(String fileName) {

		return null;
	}

}
