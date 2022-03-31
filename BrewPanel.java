import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class BrewPanel extends JPanel{
	private DrinkTemperaturePanel panel1;
	private DrinkAmountDrinkPanel panel2;
	private DrinkGrindSizePanel panel3;
	private DrinkAmountWaterPanel panel4;
	private DrinkSteepTimePanel panel5;
	private DrinkMethodPanel panel6;
	private DrinkTimerPanel panel7;
	private DrinkBrewButtonsPanel panel8;

	private EditFrame nextFrame;
	private DrinkDescriptionFrame previousFrame;
	private DrinkBrewFrame parentFrame;

	public BrewPanel(AeropressCoffeeEntry inputDrink){
		panel1 = new DrinkTemperaturePanel(inputDrink);
		add(panel1);

		panel2 = new DrinkAmountDrinkPanel(inputDrink);
		add(panel2);

		panel3 = new DrinkGrindSizePanel(inputDrink);
		add(panel3);

		panel4 = new DrinkAmountWaterPanel(inputDrink);
		add(panel4);

		panel6 = new DrinkMethodPanel(inputDrink);
		add(panel6);

		panel7 = new DrinkTimerPanel();
		add(panel7);

		panel8 = new DrinkBrewButtonsPanel(inputDrink);
		panel8.setParentFrame(parentFrame);
		panel8.setPreviousFrame(previousFrame);
		panel8.setNextFrame(nextFrame);
		add(panel8);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(7,1));
	}
	public BrewPanel(V60CoffeeEntry inputDrink){
		panel1 = new DrinkTemperaturePanel(inputDrink);
		add(panel1);

		panel2 = new DrinkAmountDrinkPanel(inputDrink);
		add(panel2);

		panel3 = new DrinkGrindSizePanel(inputDrink);
		add(panel3);

		panel4 = new DrinkAmountWaterPanel(inputDrink);
		add(panel4);

		panel6 = new DrinkMethodPanel(inputDrink);
		add(panel6);

		panel7 = new DrinkTimerPanel();
		add(panel7);

		panel8 = new DrinkBrewButtonsPanel(inputDrink);
		panel8.setParentFrame(parentFrame);
		panel8.setPreviousFrame(previousFrame);
		panel8.setNextFrame(nextFrame);
		add(panel8);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(7,1));
	}
	public BrewPanel(MoccamasterCoffeeEntry inputDrink){
		panel2 = new DrinkAmountDrinkPanel(inputDrink);
		add(panel2);

		panel3 = new DrinkGrindSizePanel(inputDrink);
		add(panel3);

		panel4 = new DrinkAmountWaterPanel(inputDrink);
		add(panel4);

		panel6 = new DrinkMethodPanel(inputDrink);
		add(panel6);

		panel7 = new DrinkTimerPanel();
		add(panel7);

		panel8 = new DrinkBrewButtonsPanel(inputDrink);
		panel8.setParentFrame(parentFrame);
		panel8.setPreviousFrame(previousFrame);
		panel8.setNextFrame(nextFrame);
		add(panel8);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(6,1));
	}
	public BrewPanel(TeaEntry inputDrink){
		panel1 = new DrinkTemperaturePanel(inputDrink);
		add(panel1);

		panel2 = new DrinkAmountDrinkPanel(inputDrink);
		add(panel2);

		panel4 = new DrinkAmountWaterPanel(inputDrink);
		add(panel4);

		panel5 = new DrinkSteepTimePanel(inputDrink);
		add(panel5);

		panel6 = new DrinkMethodPanel(inputDrink);
		add(panel6);

		panel7 = new DrinkTimerPanel();
		add(panel7);

		panel8 = new DrinkBrewButtonsPanel(inputDrink);
		panel8.setParentFrame(parentFrame);
		panel8.setPreviousFrame(previousFrame);
		panel8.setNextFrame(nextFrame);
		add(panel8);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(7,1));
	}
	public BrewPanel(TeaBagEntry inputDrink){
		panel1 = new DrinkTemperaturePanel(inputDrink);
		add(panel1);

		panel5 = new DrinkSteepTimePanel(inputDrink);
		add(panel5);

		panel6 = new DrinkMethodPanel(inputDrink);
		add(panel6);

		panel7 = new DrinkTimerPanel();
		add(panel7);

		panel8 = new DrinkBrewButtonsPanel(inputDrink);
		panel8.setParentFrame(parentFrame);
		panel8.setPreviousFrame(previousFrame);
		panel8.setNextFrame(nextFrame);
		add(panel8);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(5,1));
	}


	public void setParentFrame(DrinkBrewFrame inputFrame){
		this.parentFrame = inputFrame;
		panel8.setParentFrame(parentFrame);

	}
	public void setPreviousFrame(DrinkDescriptionFrame inputFrame){
		this.previousFrame = inputFrame;
		panel8.setPreviousFrame(previousFrame);
	}
	public void setNextFrame(EditFrame inputFrame){
		this.nextFrame = inputFrame;
		panel8.setNextFrame(nextFrame);
	}


	public void updateTemperaturePanel(Drink inputDrink){
		panel1.updateTemperaturePanel(inputDrink);
	}
	public void updateAmountDrinkPanel(Drink inputDrink){
		panel2.updateAmountDrinkPanel(inputDrink);
	}
	public void updateAmountWaterPanel(Drink inputDrink){
		panel4.updateAmountWaterPanel(inputDrink);
	}
	public void updateGrindSizePanel(CoffeeEntry inputDrink){
		panel3.updateGrindSizePanel(inputDrink);
	}
}