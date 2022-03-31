import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkSelectionFrame extends JFrame{
	private DrinkSelectionPanel thePanel;
	private DrinkDescriptionFrame[] nextFrame;
	private BrewTypeSelectionFrame previousFrame;

	public DrinkSelectionFrame(AeropressCoffeeEntry[] inputDrink){
		System.out.printf("Making an selction frame for the %ss%n", inputDrink[0].getDrinkType());
		nextFrame = new DrinkDescriptionFrame[inputDrink.length];
		for(int i = 0; i < nextFrame.length; i++){
			nextFrame[i] = new DrinkDescriptionFrame(inputDrink[i]);
			nextFrame[i].setPreviousFrame(this);
		}
		thePanel = new DrinkSelectionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Select a %s", inputDrink[0].getDrinkType()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkSelectionFrame(V60CoffeeEntry[] inputDrink){
		System.out.printf("Making an selction frame for the %ss%n", inputDrink[0].getDrinkType());
		nextFrame = new DrinkDescriptionFrame[inputDrink.length];
		for(int i = 0; i < nextFrame.length; i++){
			nextFrame[i] = new DrinkDescriptionFrame(inputDrink[i]);
			nextFrame[i].setPreviousFrame(this);
		}
		thePanel = new DrinkSelectionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Select a %s", inputDrink[0].getDrinkType()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkSelectionFrame(MoccamasterCoffeeEntry[] inputDrink){
		System.out.printf("Making an selction frame for the %ss%n", inputDrink[0].getDrinkType());
		nextFrame = new DrinkDescriptionFrame[inputDrink.length];
		for(int i = 0; i < nextFrame.length; i++){
			nextFrame[i] = new DrinkDescriptionFrame(inputDrink[i]);
			nextFrame[i].setPreviousFrame(this);
		}
		thePanel = new DrinkSelectionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Select a %s", inputDrink[0].getDrinkType()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkSelectionFrame(TeaEntry[] inputDrink){
		System.out.printf("Making an selction frame for the %ss%n", inputDrink[0].getDrinkType());
		nextFrame = new DrinkDescriptionFrame[inputDrink.length];
		for(int i = 0; i < nextFrame.length; i++){
			nextFrame[i] = new DrinkDescriptionFrame(inputDrink[i]);
			nextFrame[i].setPreviousFrame(this);
		}
		thePanel = new DrinkSelectionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Select a %s", inputDrink[0].getDrinkType()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkSelectionFrame(TeaBagEntry[] inputDrink){
		System.out.printf("Making an selction frame for the %ss%n", inputDrink[0].getDrinkType());
		nextFrame = new DrinkDescriptionFrame[inputDrink.length];
		for(int i = 0; i < nextFrame.length; i++){
			nextFrame[i] = new DrinkDescriptionFrame(inputDrink[i]);
			nextFrame[i].setPreviousFrame(this);
		}
		thePanel = new DrinkSelectionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Select a %s", inputDrink[0].getDrinkType()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}


	public void setPreviousFrame(BrewTypeSelectionFrame inputFrame){
		this.previousFrame = inputFrame;
		thePanel.setPreviousFrame(previousFrame);
	}
}