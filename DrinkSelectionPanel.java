import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkSelectionPanel extends JPanel{
	private DrinkSelectionPanelButtons panel1;

	private DrinkSelectionFrame parentFrame;
	private DrinkDescriptionFrame[] nextFrame;
	private BrewTypeSelectionFrame previousFrame;

	public DrinkSelectionPanel(AeropressCoffeeEntry[] inputDrinks){
		panel1 = new DrinkSelectionPanelButtons(inputDrinks);
		add(panel1);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}
	public DrinkSelectionPanel(V60CoffeeEntry[] inputDrinks){
		panel1 = new DrinkSelectionPanelButtons(inputDrinks);
		add(panel1);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}
	public DrinkSelectionPanel(MoccamasterCoffeeEntry[] inputDrinks){
		panel1 = new DrinkSelectionPanelButtons(inputDrinks);
		add(panel1);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}
	public DrinkSelectionPanel(TeaEntry[] inputDrinks){
		panel1 = new DrinkSelectionPanelButtons(inputDrinks);
		add(panel1);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}
	public DrinkSelectionPanel(TeaBagEntry[] inputDrinks){
		panel1 = new DrinkSelectionPanelButtons(inputDrinks);
		add(panel1);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}

	public void setParentFrame(DrinkSelectionFrame inputFrame){
		this.parentFrame = inputFrame;
		panel1.setParentFrame(parentFrame);
	}
	public void setPreviousFrame(BrewTypeSelectionFrame inputFrame){
		this.previousFrame = inputFrame;
		panel1.setPreviousFrame(previousFrame);
	}
	public void setNextFrame(DrinkDescriptionFrame[] inputFrame){
		this.nextFrame = inputFrame;
		panel1.setNextFrame(inputFrame);
	}
}