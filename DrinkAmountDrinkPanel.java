import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkAmountDrinkPanel extends JPanel{
	private Drink inputDrink;
	private JTextArea amountDrinkRHS;
	private JTextArea amountDrinkLHS;

	public DrinkAmountDrinkPanel(Drink inputDrink){
		this.inputDrink = inputDrink;

		amountDrinkLHS = new JTextArea(String.format("Amount of %s to use:", inputDrink.getDrinkType()));
		amountDrinkLHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		amountDrinkLHS.setLineWrap(true);
		amountDrinkLHS.setEditable(false);
		amountDrinkLHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(amountDrinkLHS);

		amountDrinkRHS = new JTextArea(String.format("%s grams", inputDrink.getAmountDrink()));
		amountDrinkRHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		amountDrinkRHS.setLineWrap(true);
		amountDrinkRHS.setEditable(false);
		amountDrinkRHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(amountDrinkRHS);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
	public void updateAmountDrinkPanel(Drink inputDrink){
		amountDrinkRHS.setText(String.format("%s grams", inputDrink.getAmountDrink()));
	}
}