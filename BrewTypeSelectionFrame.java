import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class BrewTypeSelectionFrame extends JFrame{
	private BrewTypeSelectionPanel thePanel;
	private DrinkSelectionFrame[] nextFrame;

	public BrewTypeSelectionFrame(TeaEntry[] teaEntries, TeaBagEntry[] teaBagEntries, AeropressCoffeeEntry[] aeropressCoffeeEntries, V60CoffeeEntry[] v60CoffeeEntries, MoccamasterCoffeeEntry[] moccamasterCoffeeEntries){
		nextFrame = new DrinkSelectionFrame[5];
		nextFrame[0] = new DrinkSelectionFrame(teaEntries);
		nextFrame[0].setPreviousFrame(this);

		nextFrame[1] = new DrinkSelectionFrame(teaBagEntries);
		nextFrame[1].setPreviousFrame(this);
		
		nextFrame[2] = new DrinkSelectionFrame(aeropressCoffeeEntries);
		nextFrame[2].setPreviousFrame(this);
		
		nextFrame[3] = new DrinkSelectionFrame(v60CoffeeEntries);
		nextFrame[3].setPreviousFrame(this);
		
		nextFrame[4] = new DrinkSelectionFrame(moccamasterCoffeeEntries);
		nextFrame[4].setPreviousFrame(this);
		
		thePanel = new BrewTypeSelectionPanel(teaEntries, teaBagEntries, aeropressCoffeeEntries, v60CoffeeEntries, moccamasterCoffeeEntries);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Select a method to brew"));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	public BrewTypeSelectionFrame(TeaEntry[] teaEntries, TeaBagEntry[] teaBagEntries, CoffeeEntry[] coffeeEntries){
		AeropressCoffeeEntry[] aeropressCoffeeEntries = new AeropressCoffeeEntry[coffeeEntries.length];
		V60CoffeeEntry[] v60CoffeeEntries = new V60CoffeeEntry[coffeeEntries.length];
		MoccamasterCoffeeEntry[] moccamasterCoffeeEntries = new MoccamasterCoffeeEntry[coffeeEntries.length];
		for(int i = 0; i < coffeeEntries.length; i++){
			aeropressCoffeeEntries[i] = coffeeEntries[i].getAeropressEntry();
			v60CoffeeEntries[i] = coffeeEntries[i].getV60Entry();
			moccamasterCoffeeEntries[i] = coffeeEntries[i].getMoccamasterEntry();
		}

		nextFrame = new DrinkSelectionFrame[5];
		nextFrame[0] = new DrinkSelectionFrame(teaEntries);
		nextFrame[0].setPreviousFrame(this);

		nextFrame[1] = new DrinkSelectionFrame(teaBagEntries);
		nextFrame[1].setPreviousFrame(this);
		
		nextFrame[2] = new DrinkSelectionFrame(aeropressCoffeeEntries);
		nextFrame[2].setPreviousFrame(this);
		
		nextFrame[3] = new DrinkSelectionFrame(v60CoffeeEntries);
		nextFrame[3].setPreviousFrame(this);
		
		nextFrame[4] = new DrinkSelectionFrame(moccamasterCoffeeEntries);
		nextFrame[4].setPreviousFrame(this);
		
		thePanel = new BrewTypeSelectionPanel(teaEntries, teaBagEntries, aeropressCoffeeEntries, v60CoffeeEntries, moccamasterCoffeeEntries);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Select a method to brew"));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	public void setCoffeeFileLocation(String input){
		thePanel.setCoffeeFileLocation(input);
	}
	public void setTeaFileLocation(String input){
		thePanel.setTeaFileLocation(input);
	}
	public void setTeaBagFileLocation(String input){
		thePanel.setTeaBagFileLocation(input);
	}
}