import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
/*
	this is the file with main()
*/
public class MainJava{

	public static void main(String args[]){
		String teaFileLocation = "resources/Loose leaf tea slave.csv";
		String coffeeFileLocation = "resources/Coffee slave.csv";
		String teaBagFileLocation = "resources/Tea sachets slave.csv";
		//CoffeeEntry[] coffees = SupplimentalMethods.parseCoffeeFile(coffeeFileLocation);
		//AeropressCoffeeEntry[] aeropresses = new AeropressCoffeeEntry[coffees.length];
		//for(int i = 0; i < coffees.length; i++){
		//	aeropresses[i] = coffees[i].getAeropressEntry();
		//	System.out.printf("%s%n%s", coffees[i].toString(), aeropresses[i].toString());
		//}
	
		BrewTypeSelectionFrame testFrame = new BrewTypeSelectionFrame(SupplimentalMethods.parseTeaFile(teaFileLocation), SupplimentalMethods.parseTeaBagFile(teaBagFileLocation), SupplimentalMethods.parseCoffeeFile(coffeeFileLocation));
		testFrame.setCoffeeFileLocation(coffeeFileLocation);
		testFrame.setTeaFileLocation(teaFileLocation);
		testFrame.setTeaBagFileLocation(teaBagFileLocation);
	
	}
}