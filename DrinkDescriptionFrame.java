import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkDescriptionFrame extends JFrame{
	private DrinkDescriptionPanel thePanel;
	private DrinkBrewFrame nextFrame;
	private DrinkSelectionFrame previousFrame;

	public DrinkDescriptionFrame(AeropressCoffeeEntry inputDrink){
		System.out.printf("Making an Description frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new DrinkBrewFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new DrinkDescriptionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Describing the %s named %s in jar #%s", inputDrink.getDrinkType(), inputDrink.getName(), inputDrink.getCurrentJar()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkDescriptionFrame(V60CoffeeEntry inputDrink){
		System.out.printf("Making an Description frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new DrinkBrewFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new DrinkDescriptionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Describing the %s named %s in jar #%s", inputDrink.getDrinkType(), inputDrink.getName(), inputDrink.getCurrentJar()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkDescriptionFrame(MoccamasterCoffeeEntry inputDrink){
		System.out.printf("Making an Description frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new DrinkBrewFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new DrinkDescriptionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Describing the %s named %s in jar #%s", inputDrink.getDrinkType(), inputDrink.getName(), inputDrink.getCurrentJar()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkDescriptionFrame(TeaBagEntry inputDrink){
		System.out.printf("Making an Description frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new DrinkBrewFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new DrinkDescriptionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Describing the %s named %s in jar #%s", inputDrink.getDrinkType(), inputDrink.getName(), inputDrink.getCurrentJar()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}
	public DrinkDescriptionFrame(TeaEntry inputDrink){
		System.out.printf("Making an Description frame for a %s named %s%n", inputDrink.getDrinkType(), inputDrink.getName());
		nextFrame = new DrinkBrewFrame(inputDrink);
		nextFrame.setPreviousFrame(this);
		thePanel = new DrinkDescriptionPanel(inputDrink);
		thePanel.setNextFrame(nextFrame);
		thePanel.setParentFrame(this);
		add(thePanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(String.format("Describing the %s named %s in jar #%s", inputDrink.getDrinkType(), inputDrink.getName(), inputDrink.getCurrentJar()));
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(false);
	}


	public void setPreviousFrame(DrinkSelectionFrame inputFrame){
		this.previousFrame = inputFrame;
		thePanel.setPreviousFrame(previousFrame);
	}
}