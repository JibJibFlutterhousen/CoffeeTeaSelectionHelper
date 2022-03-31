import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class EditPanelButtons extends JPanel{
	private Drink inputDrink;
	private EditFrame parentFrame;
	private DrinkBrewFrame previousFrame;
	private JButton backButton;

	public EditPanelButtons(Drink inputDrink){
		this.inputDrink = inputDrink;

		backButton = new JButton("Back");
		backButton.addActionListener(new EditPanelButtonsButtonPress());
		add(backButton);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}
	public class EditPanelButtonsButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == backButton){
				System.out.printf("The button to return from editing the %s brew named %s has been pressed%n", inputDrink.getDrinkType(), inputDrink.getName());
				previousFrame.setVisible(true);
				parentFrame.setVisible(false);
			}
		}
	}
	public void setParentFrame(EditFrame inputFrame){
		this.parentFrame = inputFrame;
	}
	public void setPreviousFrame(DrinkBrewFrame inputFrame){
		this.previousFrame = inputFrame;
	}
}