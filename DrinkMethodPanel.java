import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkMethodPanel extends JPanel{
	private Drink inputDrink;
	private JTextArea methodText;
	private JScrollPane scroll;

	public DrinkMethodPanel(Drink inputDrink){
		this.inputDrink = inputDrink;

		methodText = new JTextArea(String.format("Method: %s", String.valueOf(inputDrink.getBrewMethod())));
		methodText.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		methodText.setLineWrap(true);
		methodText.setEditable(false);
		methodText.setFont(new Font("Areal", Font.PLAIN, 25));

		scroll = new JScrollPane(methodText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}
}