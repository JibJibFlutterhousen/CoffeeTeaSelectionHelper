import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkDescriptionPanel extends JPanel{
	private DrinkNamePanel panel1;
	private DrinkDescriptionTextPanel panel2;
	private DrinkDescriptionPanelButtonsPanel panel3;

	private DrinkDescriptionFrame parentFrame;
	private DrinkSelectionFrame previousFrame;
	private DrinkBrewFrame nextFrame;


	public DrinkDescriptionPanel(AeropressCoffeeEntry inputDrink){
		panel1 = new DrinkNamePanel(inputDrink);
		add(panel1);

		panel2 = new DrinkDescriptionTextPanel(inputDrink);
		add(panel2);

		panel3 = new DrinkDescriptionPanelButtonsPanel(inputDrink);
		panel3.setParentFrame(parentFrame);
		panel3.setPreviousFrame(previousFrame);
		panel3.setNextFrame(nextFrame);
		add(panel3);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(3,1));
	}
	public DrinkDescriptionPanel(V60CoffeeEntry inputDrink){
		panel1 = new DrinkNamePanel(inputDrink);
		add(panel1);

		panel2 = new DrinkDescriptionTextPanel(inputDrink);
		add(panel2);

		panel3 = new DrinkDescriptionPanelButtonsPanel(inputDrink);
		panel3.setParentFrame(parentFrame);
		panel3.setPreviousFrame(previousFrame);
		panel3.setNextFrame(nextFrame);
		add(panel3);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(3,1));
	}
	public DrinkDescriptionPanel(MoccamasterCoffeeEntry inputDrink){
		panel1 = new DrinkNamePanel(inputDrink);
		add(panel1);

		panel2 = new DrinkDescriptionTextPanel(inputDrink);
		add(panel2);

		panel3 = new DrinkDescriptionPanelButtonsPanel(inputDrink);
		panel3.setParentFrame(parentFrame);
		panel3.setPreviousFrame(previousFrame);
		panel3.setNextFrame(nextFrame);
		add(panel3);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(3,1));
	}
	public DrinkDescriptionPanel(TeaEntry inputDrink){
		panel1 = new DrinkNamePanel(inputDrink);
		add(panel1);

		panel2 = new DrinkDescriptionTextPanel(inputDrink);
		add(panel2);

		panel3 = new DrinkDescriptionPanelButtonsPanel(inputDrink);
		panel3.setParentFrame(parentFrame);
		panel3.setPreviousFrame(previousFrame);
		panel3.setNextFrame(nextFrame);
		add(panel3);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(3,1));
	}
	public DrinkDescriptionPanel(TeaBagEntry inputDrink){
		panel1 = new DrinkNamePanel(inputDrink);
		add(panel1);

		panel2 = new DrinkDescriptionTextPanel(inputDrink);
		add(panel2);

		panel3 = new DrinkDescriptionPanelButtonsPanel(inputDrink);
		panel3.setParentFrame(parentFrame);
		panel3.setPreviousFrame(previousFrame);
		panel3.setNextFrame(nextFrame);
		add(panel3);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(3,1));
	}


	public void setParentFrame(DrinkDescriptionFrame inputFrame){
		this.parentFrame = inputFrame;
		panel3.setParentFrame(parentFrame);

	}
	public void setPreviousFrame(DrinkSelectionFrame inputFrame){
		this.previousFrame = inputFrame;
		panel3.setPreviousFrame(previousFrame);
	}
	public void setNextFrame(DrinkBrewFrame inputFrame){
		this.nextFrame = inputFrame;
		panel3.setNextFrame(nextFrame);
	}
}