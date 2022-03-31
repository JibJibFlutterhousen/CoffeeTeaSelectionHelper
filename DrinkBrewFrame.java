import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkBrewFrame extends JFrame{
	public BrewPanel thePanel;
	public EditFrame nextFrame;
	public DrinkDescriptionFrame previousFrame;

	public DrinkBrewFrame(AeropressCoffeeEntry inputDrink){
		System.out.printf("Making an brew frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new EditFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new BrewPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Brewing the %s named %s", inputDrink.getDrinkType(), inputDrink.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkBrewFrame(V60CoffeeEntry inputDrink){
		System.out.printf("Making an brew frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new EditFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new BrewPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Brewing the %s named %s", inputDrink.getDrinkType(), inputDrink.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkBrewFrame(MoccamasterCoffeeEntry inputDrink){
		System.out.printf("Making an brew frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new EditFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new BrewPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Brewing the %s named %s", inputDrink.getDrinkType(), inputDrink.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkBrewFrame(TeaEntry inputDrink){
		System.out.printf("Making an brew frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new EditFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new BrewPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Brewing the %s named %s", inputDrink.getDrinkType(), inputDrink.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkBrewFrame(TeaBagEntry inputDrink){
		System.out.printf("Making an brew frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new EditFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new BrewPanel(inputDrink);
		thePanel.setParentFrame(this);
		thePanel.setNextFrame(nextFrame);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Brewing the %s named %s", inputDrink.getDrinkType(), inputDrink.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}


	public void setPreviousFrame(DrinkDescriptionFrame inputFrame){
		this.previousFrame = inputFrame;
		thePanel.setPreviousFrame(previousFrame);
	}


	public void updateTemperaturePanel(Drink inputDrink){
		thePanel.updateTemperaturePanel(inputDrink);
	}
	public void updateAmountDrinkPanel(Drink inputDrink){
		thePanel.updateAmountDrinkPanel(inputDrink);
	}
	public void updateAmountWaterPanel(Drink inputDrink){
		thePanel.updateAmountWaterPanel(inputDrink);
	}
	public void updateGrindSizePanel(CoffeeEntry inputDrink){
		thePanel.updateGrindSizePanel(inputDrink);
	}
}