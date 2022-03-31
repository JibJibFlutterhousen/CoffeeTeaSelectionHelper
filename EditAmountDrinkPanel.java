import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class EditAmountDrinkPanel extends JPanel{
	private Drink inputDrink;
	private JTextArea amountDrinkRHS;
	private JTextArea amountDrinkLHS;
	private StretchIcon leftArrow;
	private StretchIcon rightArrow;
	private JButton decreaseAmountDrink;
	private JButton increaseAmountDrink;
	private EditFrame parentFrame;

	public EditAmountDrinkPanel(Drink inputDrink){
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

		leftArrow = new StretchIcon("resources/leftArrowAlpha.png");
		decreaseAmountDrink = new JButton(leftArrow);
		decreaseAmountDrink.addActionListener(new EditAmountDrinkPanelButtonPress());
		add(decreaseAmountDrink);

		rightArrow = new StretchIcon("resources/rightArrowAlpha.png");
		increaseAmountDrink = new JButton(rightArrow);
		increaseAmountDrink.addActionListener(new EditAmountDrinkPanelButtonPress());
		add(increaseAmountDrink);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(2,2));
	}
	public class EditAmountDrinkPanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == decreaseAmountDrink){
				System.out.printf("The button to decrease the amount of %s used to brew %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				inputDrink.setAmountDrink(inputDrink.getAmountDrink() - 0.1);
				amountDrinkRHS.setText(String.format("%s grams", inputDrink.getAmountDrink()));
				parentFrame.updateAmountDrinkPanel(inputDrink);
			}else if(event.getSource() == increaseAmountDrink){
				System.out.printf("The button to increase the amount of %s used to brew %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				inputDrink.setAmountDrink(inputDrink.getAmountDrink() + 0.1);
				amountDrinkRHS.setText(String.format("%s grams", inputDrink.getAmountDrink()));
				parentFrame.updateAmountDrinkPanel(inputDrink);
			}
		}
	}
	public void setParentFrame(EditFrame inputFrame){
		this.parentFrame = inputFrame;
	}
}