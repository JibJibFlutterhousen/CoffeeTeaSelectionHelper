import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.function.Supplier;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrinkTimerPanel extends JPanel{
	private JLabel time = new JLabel("00:00:000", JLabel.CENTER);
	private Timer timer;
	private JButton pause = new JButton("Pause");
	private JButton start = new JButton("Start");
	private JButton reset = new JButton("Reset");

	public DrinkTimerPanel(){
		add(time);

		timer = new Timer(this);

		start.addActionListener(new DrinkTimerPanelButtonPress());
		add(start);

		pause.addActionListener(new DrinkTimerPanelButtonPress());
		add(pause);

		reset.addActionListener(new DrinkTimerPanelButtonPress());
		add(reset);

		setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
		setLayout(new GridLayout(1,4));
	}
	public class DrinkTimerPanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == start){
				timer.startTimer();
			}else if(event.getSource() == pause){
				timer.pauseTimer();
			}else if(event.getSource() == reset){
				timer.resetTimer();
			}
		}
	}
	public void update(long input){
		long milliseconds = input % 1000;
		long newNumber = input / 1000;
		long seconds = newNumber % 60;
		newNumber /= 60;
		long minutes = newNumber % 60;
		time.setText(String.format("%2d:%2d:%3d", minutes, seconds, milliseconds));
	}
}