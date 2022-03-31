import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class EditPanel extends JPanel{
	private DrinkBrewFrame previousFrame;
	private EditFrame parentFrame;

	private EditGrindSizePanel panel1;
	private EditAmountDrinkPanel panel2;
	private EditAmountWaterPanel panel3;
	private EditTemperaturePanel panel4;
	private EditPanelButtons panel5;

	public EditPanel(AeropressCoffeeEntry inputCoffee){
		panel1 = new EditGrindSizePanel(inputCoffee);
		panel1.setParentFrame(parentFrame);
		add(panel1);
		panel2 = new EditAmountDrinkPanel(inputCoffee);
		panel2.setParentFrame(parentFrame);
		add(panel2);
		panel3 = new EditAmountWaterPanel(inputCoffee);
		panel3.setParentFrame(parentFrame);
		add(panel3);
		panel4 = new EditTemperaturePanel(inputCoffee);
		panel4.setParentFrame(parentFrame);
		add(panel4);
		panel5 = new EditPanelButtons(inputCoffee);
		panel5.setParentFrame(parentFrame);
		panel5.setPreviousFrame(previousFrame);
		add(panel5);
		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(5,1));
	}
	public EditPanel(V60CoffeeEntry inputCoffee){
		panel1 = new EditGrindSizePanel(inputCoffee);
		panel1.setParentFrame(parentFrame);
		add(panel1);
		panel2 = new EditAmountDrinkPanel(inputCoffee);
		panel2.setParentFrame(parentFrame);
		add(panel2);
		panel3 = new EditAmountWaterPanel(inputCoffee);
		panel3.setParentFrame(parentFrame);
		add(panel3);
		panel4 = new EditTemperaturePanel(inputCoffee);
		panel4.setParentFrame(parentFrame);
		add(panel4);
		panel5 = new EditPanelButtons(inputCoffee);
		panel5.setParentFrame(parentFrame);
		panel5.setPreviousFrame(previousFrame);
		add(panel5);
		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(5,1));
	}
	public EditPanel(MoccamasterCoffeeEntry inputCoffee){
		panel1 = new EditGrindSizePanel(inputCoffee);
		panel1.setParentFrame(parentFrame);
		add(panel1);
		panel2 = new EditAmountDrinkPanel(inputCoffee);
		panel2.setParentFrame(parentFrame);
		add(panel2);
		panel3 = new EditAmountWaterPanel(inputCoffee);
		panel3.setParentFrame(parentFrame);
		add(panel3);
		panel5 = new EditPanelButtons(inputCoffee);
		panel5.setParentFrame(parentFrame);
		panel5.setPreviousFrame(previousFrame);
		add(panel5);
		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(4,1));
	}
	public EditPanel(TeaEntry inputTea){
		panel2 = new EditAmountDrinkPanel(inputTea);
		panel2.setParentFrame(parentFrame);
		add(panel2);
		panel3 = new EditAmountWaterPanel(inputTea);
		panel3.setParentFrame(parentFrame);
		add(panel3);
		panel4 = new EditTemperaturePanel(inputTea);
		panel4.setParentFrame(parentFrame);
		add(panel4);
		panel5 = new EditPanelButtons(inputTea);
		panel5.setParentFrame(parentFrame);
		panel5.setPreviousFrame(previousFrame);
		add(panel5);
		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(4,1));
	}
	public EditPanel(TeaBagEntry inputTeaBag){
		panel4 = new EditTemperaturePanel(inputTeaBag);
		panel4.setParentFrame(parentFrame);
		add(panel4);
		panel5 = new EditPanelButtons(inputTeaBag);
		panel5.setParentFrame(parentFrame);
		panel5.setPreviousFrame(previousFrame);
		add(panel5);
		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(2,1));
	}
	public void setPreviousFrame(DrinkBrewFrame inputFrame){
		this.previousFrame = inputFrame;
		panel5.setPreviousFrame(previousFrame);
	}
	public void setParentFrame(EditFrame inputFrame){
		this.parentFrame = inputFrame;
		if(panel1 != null){
			panel1.setParentFrame(parentFrame);
		}
		if(panel2 != null){
			panel2.setParentFrame(parentFrame);
		}
		if(panel3 != null){
			panel3.setParentFrame(parentFrame);
		}
		if(panel4 != null){
			panel4.setParentFrame(parentFrame);
		}
		if(panel5 != null){
			panel5.setParentFrame(parentFrame);
		}
	}
}