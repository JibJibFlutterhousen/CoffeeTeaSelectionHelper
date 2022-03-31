import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.function.Supplier;
import java.io.FileWriter;
import java.io.File;

public class SupplimentalMethods{
/*
	these are the methods that involve specifically tea bag entries
*/
	public static void pushTeaBagEntry(TeaBagEntry[] teaBags, String saveFileLocation){
/*
	this pushes a teaBagEntry object array to a csv file

	this method needs import java.io.FileWriter;
	this method needs import java.io.File;
*/
		try{
			File saveFile = new File(saveFileLocation);
			saveFile.delete();
			File overwrittenSaveFile = new File(saveFileLocation);
			FileWriter newFile = new FileWriter(overwrittenSaveFile, false);
			newFile.write(teaBags[0].getCSVHeadder());
			for(int i = 0; i < teaBags.length; i++){
				newFile.write(teaBags[i].toCSV());
			}
			newFile.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static TeaBagEntry[] parseTeaBagFile(String input){
/*
	this is a parser that takes a file location, and splits out a teaBagEntry array that contains all valid tea bags and nothing mroe

*/
	try{
			Path inputPath = Paths.get(input);
			Scanner inputScanner = new Scanner(inputPath);
			List<String> inputList = new ArrayList<String>();
			while(inputScanner.hasNextLine()){
				inputList.add(processString(inputScanner.nextLine()));
			}
			/*
				We then take the input Array list and make it just an array
			*/
			String[] inputRowArray = new String[inputList.size()];
			inputList.toArray(inputRowArray);
			/*
				Now we create an array of teaEntry objects, with just enough of them to store the number of tea entries that we have
			*/
			TeaBagEntry[] teas = new TeaBagEntry[inputRowArray.length-1];
			for(int i = 0; i < teas.length; i++){
				teas[i] = new TeaBagEntry();
			}
			/*
				Now we take every entry (except the first entry) in the inputRowArray, and shove it into it's respective slot in the teaEntry object array
			*/
			for(int i = 1; i < inputRowArray.length; i++){
				String[] splitInputRow = inputRowArray[i].split("\",\"");
				if(splitInputRow.length != inputRowArray[0].split("\",\"").length){
					continue;
				}
				teas[i-1].setIdentifier(splitInputRow[0].replaceAll("\"", ""));
				teas[i-1].setCurrentJar(splitInputRow[1].replaceAll("\"", ""));
				teas[i-1].setName(splitInputRow[2].replaceAll("\"", ""));
				teas[i-1].setManufacturer(splitInputRow[3].replaceAll("\"", ""));
				teas[i-1].setTemperature(splitInputRow[4].replaceAll("\"", ""));
				teas[i-1].setSteepTime(splitInputRow[5].replaceAll("\"", ""));
				teas[i-1].setDescription(splitInputRow[6].replaceAll("\"", ""));
				teas[i-1].setDrinkType("Tea sachet");
			}
			/*
				now we loop through the possible teas, and only allocate space for the currently in stock teas
			*/
			int validTeas = 0;
			for(int i = 0; i < teas.length; i++){
				if(teas[i].getInStock()){
					validTeas++;
				}
			}
			System.out.printf("There are %s tea sachets in stock%n", validTeas);
			TeaBagEntry[] validTeaArray = new TeaBagEntry[validTeas];
			int validTeasCounter = 0;
			for(int i = 0; i < teas.length; i++){
				if(teas[i].getInStock()){
					validTeaArray[validTeasCounter++] = teas[i];
				}
			}
			return validTeaArray;
		}catch(Exception e){
			e.printStackTrace();
			return new TeaBagEntry[1];
		}
	}
/*
	these are the methods that involve specifically coffee entries
*/
	public static CoffeeEntry[] parseCoffeeFile(String input){
/*
	this is a parser that takes a file location, and spits out a coffeeEntry array that contains all valid coffees and nothing more	
*/
		try{
			Path inputPath = Paths.get(input);
			Scanner inputScanner = new Scanner(inputPath);
			List<String> inputList = new ArrayList<String>();
			while(inputScanner.hasNextLine()){
				inputList.add(processString(inputScanner.nextLine()));
			}
			/*
				We then take the input Array list and make it just an array
			*/
			String[] inputRowArray = new String[inputList.size()];
			inputList.toArray(inputRowArray);
			/*
				Now we create an array of coffeeEntry objects, with just enough of them to store the number of coffee entries that we have
			*/
			CoffeeEntry[] coffees = new CoffeeEntry[inputRowArray.length-1];
			for(int i = 0; i < coffees.length; i++){
				coffees[i] = new CoffeeEntry();
			}
			/*
				Now we take every entry (except the first entry) in the inputRowArray, and shove it into it's respective slot in the coffeeEntry object array
			*/
			for(int i = 1; i < inputRowArray.length; i++){
				String[] splitInputRow = inputRowArray[i].split("\",\"");
				if(splitInputRow.length != inputRowArray[0].split("\",\"").length){
					continue;
				}
				coffees[i-1].setIdentifier(splitInputRow[0].replaceAll("\"", ""));
				coffees[i-1].setCurrentJar(splitInputRow[1].replaceAll("\"", ""));
				coffees[i-1].setName(splitInputRow[2].replaceAll("\"", ""));
				coffees[i-1].setManufacturer(splitInputRow[3].replaceAll("\"", ""));
				coffees[i-1].setDescription(splitInputRow[4].replaceAll("\"", ""));
				coffees[i-1].setGramsCoffeeV60(splitInputRow[5].replaceAll("\"", ""));
				coffees[i-1].setGramsWaterV60(splitInputRow[6].replaceAll("\"", ""));
				coffees[i-1].setMethodV60(splitInputRow[7].replaceAll("\"", ""));
				coffees[i-1].setTemperatureV60(splitInputRow[8].replaceAll("\"", ""));
				coffees[i-1].setGrindSizeV60(splitInputRow[9].replaceAll("\"", ""));
				coffees[i-1].setGramsCoffeeAeropress(splitInputRow[10].replaceAll("\"", ""));
				coffees[i-1].setGramsWaterAeropress(splitInputRow[11].replaceAll("\"", ""));
				coffees[i-1].setMethodAeropress(splitInputRow[12].replaceAll("\"", ""));
				coffees[i-1].setTemperatureAeropress(splitInputRow[13].replaceAll("\"", ""));
				coffees[i-1].setGrindSizeAeropress(splitInputRow[14].replaceAll("\"", ""));
				coffees[i-1].setGramsCoffeeMoccamaster(splitInputRow[15].replaceAll("\"", ""));
				coffees[i-1].setGramsWaterMoccamaster(splitInputRow[16].replaceAll("\"", ""));
				coffees[i-1].setMethodMoccamaster(splitInputRow[17].replaceAll("\"", ""));
				coffees[i-1].setGrindSizeMoccamaster(splitInputRow[18].replaceAll("\"", ""));
				coffees[i-1].setRoastLevel(splitInputRow[19].replaceAll("\"", ""));
				coffees[i-1].setDrinkType("Whole bean coffee");
			}
			/*
				now we loop through the possible teas, and only allocate space for the currently in stock teas
			*/
			int validCoffees = 0;
			for(int i = 0; i < coffees.length; i++){
				if(coffees[i].getInStock()){
					validCoffees++;
				}
			}
			System.out.printf("There are %s coffees in stock%n", validCoffees);
			CoffeeEntry[] validCoffeeArray = new CoffeeEntry[validCoffees];
			int validCoffeesCounter = 0;
			for(int i = 0; i < coffees.length; i++){
				if(coffees[i].getInStock()){
					validCoffeeArray[validCoffeesCounter++] = coffees[i];
				}
			}
			return validCoffeeArray;
		}catch(Exception e){
			e.printStackTrace();
			return new CoffeeEntry[1];
		}
	}
	public static void pushCoffeeEntry(CoffeeEntry[] coffees, String saveFileLocation){
/*
	this pushes a teaEntry object array to a csv file

	this method needs import java.io.FileWriter;
	this method needs import java.io.File;
*/
		try{
			File saveFile = new File(saveFileLocation);
			saveFile.delete();
			File overwrittenSaveFile = new File(saveFileLocation);
			FileWriter newFile = new FileWriter(overwrittenSaveFile, false);
			newFile.write(coffees[0].getCSVHeadder());
			for(int i = 0; i < coffees.length; i++){
				newFile.write(coffees[i].toCSV());
			}
			newFile.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
/*
	these are the methods that involve specifically loose-leaf tea entries
*/
	public static TeaEntry[] parseTeaFile(String input){
/*
	This is a parser that takes a file location, and spits out a teaEntry array that contains all valid teas and nothing more
*/
		try{
			Path inputPath = Paths.get(input);
			Scanner inputScanner = new Scanner(inputPath);
			List<String> inputList = new ArrayList<String>();
			while(inputScanner.hasNextLine()){
				inputList.add(processString(inputScanner.nextLine()));
			}
			/*
				We then take the input Array list and make it just an array
			*/
			String[] inputRowArray = new String[inputList.size()];
			inputList.toArray(inputRowArray);
			/*
				Now we create an array of teaEntry objects, with just enough of them to store the number of tea entries that we have
			*/
			TeaEntry[] teas = new TeaEntry[inputRowArray.length-1];
			for(int i = 0; i < teas.length; i++){
				teas[i] = new TeaEntry();
			}
			/*
				Now we take every entry (except the first entry) in the inputRowArray, and shove it into it's respective slot in the teaEntry object array
			*/
			for(int i = 1; i < inputRowArray.length; i++){
				String[] splitInputRow = inputRowArray[i].split("\",\"");
				if(splitInputRow.length != inputRowArray[0].split("\",\"").length){
					continue;
				}
				teas[i-1].setDrinkType(splitInputRow[0].replaceAll("\"", ""));
				teas[i-1].setIdentifier(splitInputRow[1].replaceAll("\"", ""));
				teas[i-1].setCurrentJar(splitInputRow[2].replaceAll("\"", ""));
				teas[i-1].setName(splitInputRow[3].replaceAll("\"", ""));
				teas[i-1].setManufacturer(splitInputRow[4].replaceAll("\"", ""));
				teas[i-1].setDescription(splitInputRow[5].replaceAll("\"", ""));
				teas[i-1].setGramsTea(splitInputRow[6].replaceAll("\"", ""));
				teas[i-1].setGramsWater(splitInputRow[7].replaceAll("\"", ""));
				teas[i-1].setTemperature(splitInputRow[8].replaceAll("\"", ""));
				teas[i-1].setSteepTime(splitInputRow[9].replaceAll("\"", ""));
				teas[i-1].setBrewMethod(splitInputRow[10].replaceAll("\"", ""));
				teas[i-1].setTeaType(splitInputRow[11].replaceAll("\"", ""));
			}
			/*
				now we loop through the possible teas, and only allocate space for the currently in stock teas
			*/
			int validTeas = 0;
			for(int i = 0; i < teas.length; i++){
				if(teas[i].getInStock()){
					validTeas++;
				}
			}
			System.out.printf("There are %s teas in stock%n", validTeas);
			TeaEntry[] validTeaArray = new TeaEntry[validTeas];
			int validTeasCounter = 0;
			for(int i = 0; i < teas.length; i++){
				if(teas[i].getInStock()){
					validTeaArray[validTeasCounter++] = teas[i];
				}
			}
			return validTeaArray;
		}catch(Exception e){
			e.printStackTrace();
			return new TeaEntry[1];
		}
	}
	public static void pushTeaEntry(TeaEntry[] teas, String saveFileLocation){
/*
	this pushes a teaEntry object array to a csv file

	this method needs import java.io.FileWriter;
	this method needs import java.io.File;
*/
		try{
			File saveFile = new File(saveFileLocation);
			saveFile.delete();
			File overwrittenSaveFile = new File(saveFileLocation);
			FileWriter newFile = new FileWriter(overwrittenSaveFile, false);
			newFile.write(teas[0].getCSVHeadder());
			for(int i = 0; i < teas.length; i++){
				newFile.write(teas[i].toCSV());
			}
			newFile.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}



	public static String processString(String input){
/*
	This is some wacky shit man. So, the idea of this is to replace ONLY the variable definining commas with a valid flag character. 

	To do this, we first find that valid flag character, and stick that at the beginning of the output string
	We then take the output, and split it on a comma
		note, this gives us some erroneous splits, that we will have to take care of later
	We then start out loop on the number of strings we just made
		note, the startint point is 0, but the ending point is the number-1, since we have to compare two strings
	Then we "peek" ahead at the next string in the split
		if the next string starts with a white space, we know that this was an erroneous split, so we add back in the comma and the string to the end of the output
		if the next string doesn't start with a white space, we know we've reached a new variable, so we append a flag character, then add the first string we're looking at to the output
	then BOOM, MAGIC, FANCY SHIT, we've processed out string
*/
		String output = "";
		String flagCharacter = "\",\"";
		String firstPass = "";
		firstPass += firstPass.copyValueOf(input.toCharArray(), 0, input.length());
		String[] parsedFirstPass = firstPass.split(",");
		for(int i = 0; i < parsedFirstPass.length-1; i++){
			char[] possibleMatch = parsedFirstPass[i].toCharArray();
			char[] nextPossibleMatch = parsedFirstPass[i+1].toCharArray();
			if(nextPossibleMatch.length == 0){
				continue;
			}
			if(Character.isWhitespace(nextPossibleMatch[0])){
				output += String.format("%s,", String.valueOf(possibleMatch));
			}else if(!Character.isWhitespace(nextPossibleMatch[0])){
				output += String.format("%s%s", String.valueOf(possibleMatch), flagCharacter);
			}
		}
		if(parsedFirstPass.length > 0){
			output += String.valueOf(parsedFirstPass[parsedFirstPass.length - 1 ]);
		}
		return output;
	}
}