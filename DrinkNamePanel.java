import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkNamePanel extends JPanel{
	private Drink inputDrink;
	private JTextArea drinkNameLHS;
	private JTextArea drinkNameRHS;

	public DrinkNamePanel(Drink inputDrink){
		this.inputDrink = inputDrink;

		drinkNameLHS = new JTextArea(String.format("Name:"));
		drinkNameLHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		drinkNameLHS.setLineWrap(true);
		drinkNameLHS.setEditable(false);
		drinkNameLHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(drinkNameLHS);

		drinkNameRHS = new JTextArea(String.format("%s", inputDrink.getName()));
		drinkNameRHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		drinkNameRHS.setLineWrap(true);
		drinkNameRHS.setEditable(false);
		drinkNameRHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(drinkNameRHS);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
}