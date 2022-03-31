import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class EditTemperaturePanel extends JPanel{
	private Drink inputDrink;
	private JTextArea temperatureRHS;
	private JTextArea temperatureLHS;
	private StretchIcon leftArrow;
	private StretchIcon rightArrow;
	private JButton decreaseTemp;
	private JButton increaseTemp;
	private EditFrame parentFrame;


	public EditTemperaturePanel(Drink inputDrink){
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

		leftArrow = new StretchIcon("resources/leftArrowAlpha.png");
		decreaseTemp = new JButton(leftArrow);
		decreaseTemp.addActionListener(new EditTemperaturePanelButtonPress());
		add(decreaseTemp);

		rightArrow = new StretchIcon("resources/rightArrowAlpha.png");
		increaseTemp = new JButton(rightArrow);
		increaseTemp.addActionListener(new EditTemperaturePanelButtonPress());
		add(increaseTemp);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(2,2));
	}
	public class EditTemperaturePanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == decreaseTemp){
				System.out.printf("The button to decrease the brewing temperature of the %s named %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				inputDrink.setTemperature(inputDrink.getTemperature() - 1);
				temperatureRHS.setText(String.format("%s\u00B0 C", inputDrink.getTemperature()));
				parentFrame.updateTemperaturePanel(inputDrink);
			}else if(event.getSource() == increaseTemp){
				System.out.printf("The button to increase the brewing temperature of the %s named %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				inputDrink.setTemperature(inputDrink.getTemperature() + 1);
				temperatureRHS.setText(String.format("%s\u00B0 C", inputDrink.getTemperature()));
				parentFrame.updateTemperaturePanel(inputDrink);
			}
		}
	}
	public void setParentFrame(EditFrame inputFrame){
		this.parentFrame = inputFrame;
	}
}