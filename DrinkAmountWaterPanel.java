import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkAmountWaterPanel extends JPanel{
	private Drink inputDrink;
	private JTextArea amountWaterRHS;
	private JTextArea amountWaterLHS;

	public DrinkAmountWaterPanel(Drink inputDrink){
		this.inputDrink = inputDrink;

		amountWaterLHS = new JTextArea(String.format("Amount of water to use:", inputDrink.getDrinkType()));
		amountWaterLHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		amountWaterLHS.setLineWrap(true);
		amountWaterLHS.setEditable(false);
		amountWaterLHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(amountWaterLHS);

		amountWaterRHS = new JTextArea(String.format("%s grams", inputDrink.getAmountWater()));
		amountWaterRHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		amountWaterRHS.setLineWrap(true);
		amountWaterRHS.setEditable(false);
		amountWaterRHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(amountWaterRHS);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
	public void updateAmountWaterPanel(Drink inputDrink){
		amountWaterRHS.setText(String.format("%s grams", inputDrink.getAmountWater()));
	}
}