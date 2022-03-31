import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkSelectionPanelButtons extends JPanel{
	private Drink[] inputDrinks;
	private JButton[] theButtons;
	private DrinkSelectionBackButtonPanel backButton;

	private DrinkDescriptionFrame[] descriptionFrames;
	private BrewTypeSelectionFrame previousFrame;
	private DrinkSelectionFrame parentFrame;

	public DrinkSelectionPanelButtons(Drink[] inputDrinks){
		this.inputDrinks = inputDrinks;

		theButtons = new JButton[inputDrinks.length];
		for(int i = 0; i < theButtons.length; i++){
			theButtons[i] = new JButton(String.format("<html>Jar #%s: <br>%s</html>", i+1, inputDrinks[i].getName()));
			theButtons[i].addActionListener(new DrinkSelectionPanelButtonsButtonPress());
			add(theButtons[i]);
		}

		backButton = new DrinkSelectionBackButtonPanel(inputDrinks);
		backButton.setParentFrame(parentFrame);
		backButton.setPreviousFrame(previousFrame);
		add(backButton);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(3,1));
	}
	public class DrinkSelectionPanelButtonsButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			for(int i = 0; i < theButtons.length; i++){
				if(event.getSource() == theButtons[i]){
					System.out.printf("The button to view the description of the %s named %s has been pressed%n", inputDrinks[i].getDrinkType(), inputDrinks[i].getName());
					descriptionFrames[i].setVisible(true);
					parentFrame.setVisible(false);
				}
			}
		}
	}

	public void setParentFrame(DrinkSelectionFrame inputFrame){
		this.parentFrame = inputFrame;
		backButton.setParentFrame(parentFrame);
	}
	public void setPreviousFrame(BrewTypeSelectionFrame inputFrame){
		this.previousFrame = inputFrame;
		backButton.setPreviousFrame(previousFrame);
	}
	public void setNextFrame(DrinkDescriptionFrame[] inputFrame){
		this.descriptionFrames = new DrinkDescriptionFrame[inputFrame.length];
		for(int i = 0; i < descriptionFrames.length; i++){
			descriptionFrames[i] = inputFrame[i];
		}
	}
}