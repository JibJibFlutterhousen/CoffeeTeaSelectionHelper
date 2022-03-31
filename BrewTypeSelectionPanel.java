import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class BrewTypeSelectionPanel extends JPanel{
	private TeaEntry[] teaEntries;
	private TeaBagEntry[] teaBagEntries;
	private AeropressCoffeeEntry[] aeropressCoffeeEntries;
	private V60CoffeeEntry[] v60CoffeeEntries;
	private MoccamasterCoffeeEntry[] moccamasterCoffeeEntries;

	private JButton selectTea;
	private JButton selectTeaBag;
	private JButton selectAeropressCoffee;
	private JButton selectV60Coffee;
	private JButton selectMoccamasterCoffee;
	private JButton saveAndClose;

	private BrewTypeSelectionFrame parentFrame;
	private DrinkSelectionFrame[] nextFrame;

	private String coffeeFileLocation;
	private String teaFileLocation;
	private String teaBagFileLocation;

	public BrewTypeSelectionPanel(TeaEntry[] teaEntries, TeaBagEntry[] teaBagEntries, AeropressCoffeeEntry[] aeropressCoffeeEntries, V60CoffeeEntry[] v60CoffeeEntries, MoccamasterCoffeeEntry[] moccamasterCoffeeEntries){
		this.teaEntries = teaEntries;
		this.teaBagEntries = teaBagEntries;
		this.aeropressCoffeeEntries = aeropressCoffeeEntries;
		this.v60CoffeeEntries = v60CoffeeEntries;
		this.moccamasterCoffeeEntries = moccamasterCoffeeEntries;

		selectTea = new JButton("Loose-leaf Tea");
		selectTea.addActionListener(new BrewTypeSelectionPanelButtonPress());
		add(selectTea);

		selectTeaBag = new JButton("Tea sachet");
		selectTeaBag.addActionListener(new BrewTypeSelectionPanelButtonPress());
		add(selectTeaBag);

		selectAeropressCoffee = new JButton("<html>Coffee-<br>Aeropress</html>");
		selectAeropressCoffee.addActionListener(new BrewTypeSelectionPanelButtonPress());
		add(selectAeropressCoffee);

		selectV60Coffee = new JButton("<html>Coffee-<br>v60</html>");
		selectV60Coffee.addActionListener(new BrewTypeSelectionPanelButtonPress());
		add(selectV60Coffee);

		selectMoccamasterCoffee = new JButton("<html>Coffee-<br>Moccamaster</html>");
		selectMoccamasterCoffee.addActionListener(new BrewTypeSelectionPanelButtonPress());
		add(selectMoccamasterCoffee);

		saveAndClose = new JButton("Save and close");
		saveAndClose.addActionListener(new BrewTypeSelectionPanelButtonPress());
		add(saveAndClose);

		setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		setLayout(new GridLayout(2,3));
	}
	public class BrewTypeSelectionPanelButtonPress implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == selectTea){
				System.out.printf("The button to brew a %s has been pressed%n", teaEntries[0].getDrinkType());
				nextFrame[0].setVisible(true);
				parentFrame.setVisible(false);
			}else if(event.getSource() == selectTeaBag){
				System.out.printf("The button to brew a %s has been pressed%n", teaBagEntries[0].getDrinkType());
				nextFrame[1].setVisible(true);
				parentFrame.setVisible(false);
			}else if(event.getSource() == selectAeropressCoffee){
				System.out.printf("The button to brew a %s has been pressed%n", aeropressCoffeeEntries[0].getDrinkType());
				nextFrame[2].setVisible(true);
				parentFrame.setVisible(false);
			}else if(event.getSource() == selectV60Coffee){
				System.out.printf("The button to brew a %s has been pressed%n", v60CoffeeEntries[0].getDrinkType());
				nextFrame[3].setVisible(true);
				parentFrame.setVisible(false);
			}else if(event.getSource() == selectMoccamasterCoffee){
				System.out.printf("The button to brew a %s has been pressed%n", moccamasterCoffeeEntries[0].getDrinkType());
				nextFrame[4].setVisible(true);
				parentFrame.setVisible(false);
			}else if(event.getSource() == saveAndClose){
				System.out.printf("The button to save and close has been pressed%n");
				SupplimentalMethods.pushTeaEntry(teaEntries, teaFileLocation);
				CoffeeEntry[] coffees = new CoffeeEntry[aeropressCoffeeEntries.length];
				for(int i = 0; i < coffees.length; i++){
					coffees[i] = new CoffeeEntry(aeropressCoffeeEntries[i], v60CoffeeEntries[i], moccamasterCoffeeEntries[i]);
				}
				SupplimentalMethods.pushCoffeeEntry(coffees, coffeeFileLocation);
				SupplimentalMethods.pushTeaBagEntry(teaBagEntries, teaBagFileLocation);
				parentFrame.dispose();
				System.exit(0);
			}
		}
	}


	public void setParentFrame(BrewTypeSelectionFrame inputFrame){
		this.parentFrame = inputFrame;
	}
	public void setNextFrame(DrinkSelectionFrame[] inputFrame){
		this.nextFrame = new DrinkSelectionFrame[inputFrame.length];
		for(int i = 0; i < nextFrame.length; i++){
			nextFrame[i] = inputFrame[i];
		}
	}
	public void setCoffeeFileLocation(String input){
		this.coffeeFileLocation = input;
	}
	public void setTeaFileLocation(String input){
		this.teaFileLocation = input;
	}
	public void setTeaBagFileLocation(String input){
		this.teaBagFileLocation = input;
	}
}