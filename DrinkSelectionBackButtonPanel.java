import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkSelectionBackButtonPanel extends JPanel{
	private JButton backButton = new JButton("Back");

	private BrewTypeSelectionFrame previousFrame;
	private DrinkSelectionFrame parentFrame;

	public DrinkSelectionBackButtonPanel(Drink[] inputDrink){
		backButton.addActionListener(new DrinkSelectionBackButtonPanelButtonPress());
		add(backButton);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,1));
	}
	public class DrinkSelectionBackButtonPanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == backButton){
				previousFrame.setVisible(true);
				parentFrame.setVisible(false);
			}
		}
	}

	public void setParentFrame(DrinkSelectionFrame inputFrame){
		this.parentFrame = inputFrame;
	}
	public void setPreviousFrame(BrewTypeSelectionFrame inputFrame){
		this.previousFrame = inputFrame;
	}
}