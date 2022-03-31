import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkBrewButtonsPanel extends JPanel{
	private Drink inputDrink;
	private EditFrame nextFrame;
	private DrinkDescriptionFrame previousFrame;
	private DrinkBrewFrame parentFrame;
	private JButton backButton;
	private JButton editButton;

	public DrinkBrewButtonsPanel(Drink inputDrink){
		this.inputDrink = inputDrink;

		editButton = new JButton("Edit");
		editButton.addActionListener(new DrinkBrewButtonsPanelButtonPress());
		add(editButton);

		backButton = new JButton("Back");
		backButton.addActionListener(new DrinkBrewButtonsPanelButtonPress());
		add(backButton);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
	public class DrinkBrewButtonsPanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == backButton){
				System.out.printf("The button to return from brewing the %s brew named %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				previousFrame.setVisible(true);
				parentFrame.setVisible(false);
			}else if(event.getSource() == editButton){
				System.out.printf("The button to edit the %s named %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				nextFrame.setVisible(true);
				parentFrame.setVisible(false);
			}
		}
	}
	public void setParentFrame(DrinkBrewFrame inputFrame){
		this.parentFrame = inputFrame;
	}
	public void setPreviousFrame(DrinkDescriptionFrame inputFrame){
		this.previousFrame = inputFrame;
	}
	public void setNextFrame(EditFrame inputFrame){
		this.nextFrame = inputFrame;
	}
}