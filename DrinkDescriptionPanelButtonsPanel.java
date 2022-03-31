import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkDescriptionPanelButtonsPanel extends JPanel{
	private Drink inputDrink;
	private JButton brewButton;
	private JButton backButton;
	private JFrame previousFrame;
	private DrinkBrewFrame nextFrame;
	private DrinkDescriptionFrame parentFrame;

	public DrinkDescriptionPanelButtonsPanel(Drink inputDrink){
		this.inputDrink = inputDrink;

		brewButton = new JButton("Brew");
		brewButton.addActionListener(new DrinkDescriptionPanelButtonsPanelButtonPress());
		add(brewButton);

		backButton = new JButton("Back");
		backButton.addActionListener(new DrinkDescriptionPanelButtonsPanelButtonPress());
		add(backButton);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
	public class DrinkDescriptionPanelButtonsPanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == brewButton){
				System.out.printf("The button to brew the %s named %s has been pressed", inputDrink.getDrinkType(), inputDrink.getName());
				nextFrame.setVisible(true);
				parentFrame.setVisible(false);
			}else if(event.getSource() == backButton){
				System.out.printf("The button to return from the window describing the %s named %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				previousFrame.setVisible(true);
				parentFrame.setVisible(false);
			}
		}
	}

	public void setParentFrame(DrinkDescriptionFrame inputFrame){
		this.parentFrame = inputFrame;
	}
	public void setPreviousFrame(JFrame inputFrame){
		this.previousFrame = inputFrame;
	}
	public void setNextFrame(DrinkBrewFrame inputFrame){
		this.nextFrame = inputFrame;
	}
}