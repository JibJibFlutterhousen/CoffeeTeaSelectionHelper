import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkGrindSizePanel extends JPanel{
	private CoffeeEntry inputCoffee;
	private JTextArea grindZizeRHS;
	private JTextArea grindZizeLHS;

	public DrinkGrindSizePanel(CoffeeEntry inputCoffee){
		this.inputCoffee = inputCoffee;

		grindZizeLHS = new JTextArea("Grind setting:");
		grindZizeLHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		grindZizeLHS.setLineWrap(true);
		grindZizeLHS.setEditable(false);
		grindZizeLHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(grindZizeLHS);

		grindZizeRHS = new JTextArea(String.format("%s clicks", inputCoffee.getGrindSize()));
		grindZizeRHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		grindZizeRHS.setLineWrap(true);
		grindZizeRHS.setEditable(false);
		grindZizeRHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(grindZizeRHS);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
	public void updateGrindSizePanel(CoffeeEntry inputDrink){
		grindZizeRHS.setText(String.format("%s clicks", inputCoffee.getGrindSize()));
	}
}