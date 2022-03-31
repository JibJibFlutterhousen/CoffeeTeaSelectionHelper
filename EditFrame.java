import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class EditFrame extends JFrame{
	private DrinkBrewFrame previousFrame;
	private EditPanel thePanel;

	public EditFrame(AeropressCoffeeEntry inputCoffee){
		System.out.printf("Making an edit frame for a %s named %s%n", inputCoffee.getDrinkType(), inputCoffee.getName());
		thePanel = new EditPanel(inputCoffee);
		thePanel.setParentFrame(this);
		thePanel.setPreviousFrame(previousFrame);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Editing the %s named %s", inputCoffee.getDrinkType(), inputCoffee.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public EditFrame(V60CoffeeEntry inputCoffee){
		System.out.printf("Making an edit frame for a %s named %s%n", inputCoffee.getDrinkType(), inputCoffee.getName());
		thePanel = new EditPanel(inputCoffee);
		thePanel.setParentFrame(this);
		thePanel.setPreviousFrame(previousFrame);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Editing the %s named %s", inputCoffee.getDrinkType(), inputCoffee.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public EditFrame(MoccamasterCoffeeEntry inputCoffee){
		System.out.printf("Making an edit frame for a %s named %s%n", inputCoffee.getDrinkType(), inputCoffee.getName());
		thePanel = new EditPanel(inputCoffee);
		thePanel.setParentFrame(this);
		thePanel.setPreviousFrame(previousFrame);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Editing the %s named %s", inputCoffee.getDrinkType(), inputCoffee.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public EditFrame(TeaEntry inputTea){
		System.out.printf("Making an edit frame for a %s named %s%n", inputTea.getDrinkType(), inputTea.getName());
		thePanel = new EditPanel(inputTea);
		thePanel.setParentFrame(this);
		thePanel.setPreviousFrame(previousFrame);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Editing the %s named %s", inputTea.getDrinkType(), inputTea.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public EditFrame(TeaBagEntry inputTeaBag){
		System.out.printf("Making an edit frame for a %s named %s%n", inputTeaBag.getDrinkType(), inputTeaBag.getName());
		thePanel = new EditPanel(inputTeaBag);
		thePanel.setParentFrame(this);
		thePanel.setPreviousFrame(previousFrame);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Editing the %s named %s", inputTeaBag.getDrinkType(), inputTeaBag.getName()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}


	public void setPreviousFrame(DrinkBrewFrame inputFrame){
		this.previousFrame = inputFrame;
		thePanel.setPreviousFrame(previousFrame);
	}


	public void updateTemperaturePanel(Drink inputDrink){
		previousFrame.updateTemperaturePanel(inputDrink);
	}
	public void updateAmountDrinkPanel(Drink inputDrink){
		previousFrame.updateAmountDrinkPanel(inputDrink);
	}
	public void updateAmountWaterPanel(Drink inputDrink){
		previousFrame.updateAmountWaterPanel(inputDrink);
	}
	public void updateGrindSizePanel(CoffeeEntry inputDrink){
		previousFrame.updateGrindSizePanel(inputDrink);
	}
}