import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkTemperaturePanel extends JPanel{
	private Drink inputDrink;
	private JTextArea temperatureRHS;
	private JTextArea temperatureLHS;

	public DrinkTemperaturePanel(Drink inputDrink){
		this.inputDrink = inputDrink;

		temperatureLHS = new JTextArea("Temperature:");
		temperatureLHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		temperatureLHS.setLineWrap(true);
		temperatureLHS.setEditable(false);
		temperatureLHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(temperatureLHS);

		temperatureRHS = new JTextArea(String.format("%s\u00B0 C", inputDrink.getTemperature()));
		temperatureRHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		temperatureRHS.setLineWrap(true);
		temperatureRHS.setEditable(false);
		temperatureRHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(temperatureRHS);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
	public void updateTemperaturePanel(Drink inputDrink){
		temperatureRHS.setText(String.format("%s\u00B0 C", inputDrink.getTemperature()));
	}
}