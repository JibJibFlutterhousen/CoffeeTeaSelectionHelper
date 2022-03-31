public class TeaBagEntry extends Drink{
	private String steepTime;
	private int temperature;
	private Double gramsWater;
	/*
		the following variables are inhereted from the Drink object:
			private int identifier;
			private int currentJar;
			private String name;
			private String manufacturer;
			private String description;
			private String drinkType;
			private boolean inStock;
	*/

	public TeaBagEntry(){
		this.setGramsWater(250.0);
	}
/*
	setters and getters for the double attributes
*/

	public void setGramsWater(String input){
		try{
			if(Double.parseDouble(input) > 0){
				this.gramsWater = Double.parseDouble(input);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void setGramsWater(Double input){
		this.setGramsWater(String.format("%s", input));
	}
	public Double getGramsWater(){
		return this.gramsWater;
	}
/*
	setters and getters for the int attributes
*/
	public void setTemperature(String input){
		try{
			if(Integer.parseInt(input) > 0){
				this.temperature = Integer.parseInt(input);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
/*
	setters and getters for the string attributes
*/
	public void setSteepTime(String input){
		if(input.length() > 0){
			this.steepTime = input;
		}
	}
	public String getSteepTime(){
		return this.steepTime;
	}
/*
	the methods that need to be overwritten from the Drink object
*/
	@Override
	public String toString(){
		return String.format("Identifier: %s%nCurrent Jar: %s%nName: %s%nManufacturer: %s%nTemperature: %s%nSteep Time: %s%nDescription: %s%n", getIdentifier(), getCurrentJar(), getName(), getManufacturer(), getTemperature(), getSteepTime(), getDescription());
	}
	@Override
	public String toCSV(){
		String output = String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"%s", getIdentifier(), getCurrentJar(), getName(), getManufacturer(), getTemperature(), getSteepTime(), getDescription(), System.lineSeparator());
		output = output.replaceAll("<html>", "");
		output = output.replaceAll("</html>", "");
		return output;
	}
	@Override
	public String getCSVHeadder(){
		return String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"%s", "identifier", "current jar", "name", "manufacturer", "temperature", "steep time", "description", System.lineSeparator());
	}
	@Override
	public Double getAmountWater(){
		return this.getGramsWater();
	}
	@Override
	public void setAmountWater(Double input){
		this.setGramsWater(input);
	}
	@Override
	public Double getAmountDrink(){
		return 1.0;
	}
	@Override
	public void setAmountDrink(Double input){
		System.out.printf("you did a dumb thing%n");
	}
	@Override
	public String getBrewMethod(){
		return String.format("Put the given number of sachets into the brewing vessel. Add the required amount of heated water and cover brewing vessel. Let steep for the denoted time. When time is done, remove the sachet, and enjoy.");
	}
	@Override
	public int getTemperature(){
		return this.temperature;
	}
	@Override
	public void setTemperature(int input){
		this.setTemperature(String.format("%s", input));
	}
}