import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class DrinkSteepTimePanel extends JPanel{
	private Drink inputDrink;
	private JTextArea steepTimeLHS;
	private JTextArea steepTimeRHS;

	public DrinkSteepTimePanel(TeaEntry inputDrink){
		this.inputDrink = inputDrink;

		steepTimeLHS = new JTextArea(String.format("Steep time:"));
		steepTimeLHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		steepTimeLHS.setLineWrap(true);
		steepTimeLHS.setEditable(false);
		steepTimeLHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(steepTimeLHS);

		steepTimeRHS = new JTextArea(String.format("%s minutes", inputDrink.getSteepTime()));
		steepTimeRHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		steepTimeRHS.setLineWrap(true);
		steepTimeRHS.setEditable(false);
		steepTimeRHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(steepTimeRHS);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
	public DrinkSteepTimePanel(TeaBagEntry inputDrink){
		this.inputDrink = inputDrink;

		steepTimeLHS = new JTextArea(String.format("Steep time:"));
		steepTimeLHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		steepTimeLHS.setLineWrap(true);
		steepTimeLHS.setEditable(false);
		steepTimeLHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(steepTimeLHS);

		steepTimeRHS = new JTextArea(String.format("%s minutes", inputDrink.getSteepTime()));
		steepTimeRHS.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		steepTimeRHS.setLineWrap(true);
		steepTimeRHS.setEditable(false);
		steepTimeRHS.setFont(new Font("Areal", Font.PLAIN, 25));
		add(steepTimeRHS);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(1,2));
	}
}