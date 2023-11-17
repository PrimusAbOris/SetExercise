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
		String[][] handStringArray = new String[44][2];

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Count the number of lines in the file to determine the array size
            int lineCount = br.lines().count();
            preHandStringArray = new String[(int) lineCount][];

            // Reset the BufferedReader to read from the beginning of the file
            br.close();
            br = new BufferedReader(new FileReader(filePath));

            String line;
            int row = 0;

            while ((line = br.readLine()) != null) {
                // Split the CSV line by commas
                String[] values = line.split(",");


		return null;
	}

}
