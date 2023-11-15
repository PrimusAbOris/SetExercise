package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;


public class SetExerciseApplication {
	
	Set<String> PokerSet = new HashSet<>();

	public static void main(String[] args) {
		
		// extract the data from the CSV
		BufferedReader br = new BufferedReader(new FileReader("PokerHands.csv"));
		br.readLine();
		
		
		// remove ACE HIGH and QUEEN HIGH
		
		
		// Update PAIR to DEUCES
		
	}
	
	public static void printToConsole() {

	}
	
	public static Set<String> extractDataFromCSV(String fileName) {

		return null;
	}

}
