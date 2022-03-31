import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class EditAmountWaterPanel extends JPanel{
	private Drink inputDrink;
	private JTextArea amountWaterRHS;
	private JTextArea amountWaterLHS;
	private StretchIcon leftArrow;
	private StretchIcon rightArrow;
	private JButton decreaseAmountWater;
	private JButton increaseAmountWater;
	private EditFrame parentFrame;

	public EditAmountWaterPanel(Drink inputDrink){
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

		leftArrow = new StretchIcon("resources/leftArrowAlpha.png");
		decreaseAmountWater = new JButton(leftArrow);
		decreaseAmountWater.addActionListener(new EditAmountWaterPanelButtonPress());
		add(decreaseAmountWater);

		rightArrow = new StretchIcon("resources/rightArrowAlpha.png");
		increaseAmountWater = new JButton(rightArrow);
		increaseAmountWater.addActionListener(new EditAmountWaterPanelButtonPress());
		add(increaseAmountWater);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(2,2));
	}
	public class EditAmountWaterPanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == decreaseAmountWater){
				System.out.printf("The button to increase the amount of water when brewing the %s named %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				inputDrink.setAmountWater(inputDrink.getAmountWater() - 1);
				amountWaterRHS.setText(String.format("%s grams", inputDrink.getAmountWater()));
				parentFrame.updateAmountWaterPanel(inputDrink);
			}else if(event.getSource() == increaseAmountWater){
				System.out.printf("The button to increase the amount of water when brewing the %s named %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				inputDrink.setAmountWater(inputDrink.getAmountWater() + 1);
				amountWaterRHS.setText(String.format("%s grams", inputDrink.getAmountWater()));
				parentFrame.updateAmountWaterPanel(inputDrink);
			}
		}
	}
	public void setParentFrame(EditFrame inputFrame){
		this.parentFrame = inputFrame;
	}
}