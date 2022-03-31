import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkDescriptionTextPanel extends JPanel{
	private Drink inputDrink;
	private JTextArea drinkDescriptionText;
	private JScrollPane scroll;

	public DrinkDescriptionTextPanel(Drink inputDrink){
		this.inputDrink = inputDrink;

		drinkDescriptionText = new JTextArea(String.format("Description: %s", String.valueOf(inputDrink.getDescription())));
		drinkDescriptionText.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		drinkDescriptionText.setLineWrap(true);
		drinkDescriptionText.setEditable(false);
		drinkDescriptionText.setFont(new Font("Areal", Font.PLAIN, 25));

		scroll = new JScrollPane(drinkDescriptionText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}
}