import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class EditGrindSizePanel extends JPanel{
	private CoffeeEntry inputCoffee;
	private JTextArea grindZizeRHS;
	private JTextArea grindZizeLHS;
	private StretchIcon leftArrow;
	private StretchIcon rightArrow;
	private JButton decreaseGrindSize;
	private JButton increaseGrindSize;
	private EditFrame parentFrame;

	public EditGrindSizePanel(CoffeeEntry inputCoffee){
		this.inputCoffee = inputCoffee;

		grindZizeLHS = new JTextArea("Grind setting:");
		grindZizeLHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		grindZizeLHS.setLineWrap(true);
		grindZizeLHS.setEditable(false);
		grindZizeLHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(grindZizeLHS);

		grindZizeRHS = new JTextArea(String.format("%s clicks", inputCoffee.getGrindSize()));
		grindZizeRHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		grindZizeRHS.setLineWrap(true);
		grindZizeRHS.setEditable(false);
		grindZizeRHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(grindZizeRHS);

		leftArrow = new StretchIcon("resources/leftArrowAlpha.png");
		decreaseGrindSize = new JButton(leftArrow);
		decreaseGrindSize.addActionListener(new EditGrindSizePanelButtonPress());
		add(decreaseGrindSize);

		rightArrow = new StretchIcon("resources/rightArrowAlpha.png");
		increaseGrindSize = new JButton(rightArrow);
		increaseGrindSize.addActionListener(new EditGrindSizePanelButtonPress());
		add(increaseGrindSize);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(2,2));
	}
	public class EditGrindSizePanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == decreaseGrindSize){
				System.out.printf("The button to decrease the brewing temperature of the %s named %s has been pressed%n", inputCoffee.getDrinkType(), inputCoffee.getName());
				inputCoffee.setGrindSize(inputCoffee.getGrindSize() - 1);
				grindZizeRHS.setText(String.format("%s clicks", inputCoffee.getGrindSize()));
				parentFrame.updateGrindSizePanel(inputCoffee);
			}else if(event.getSource() == increaseGrindSize){
				System.out.printf("The button to increase the brewing temperature of the %s named %s has been pressed%n", inputCoffee.getDrinkType(), inputCoffee.getName());
				inputCoffee.setGrindSize(inputCoffee.getGrindSize() + 1);
				grindZizeRHS.setText(String.format("%s clicks", inputCoffee.getGrindSize()));
				parentFrame.updateGrindSizePanel(inputCoffee);
			}
		}
	}
	public void setParentFrame(EditFrame inputFrame){
		this.parentFrame = inputFrame;
	}
}