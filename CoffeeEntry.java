public class CoffeeEntry extends Drink{
	private String roastLevel;
	private double gramsCoffeeV60;
	private double gramsWaterV60;
	private String methodV60;
	private int temperatureV60;
	private int grindSizeV60;
	private double gramsCoffeeAeropress;
	private double gramsWaterAeropress;
	private String methodAeropress;
	private int temperatureAeropress;
	private int grindSizeAeropress;
	private double gramsCoffeeMoccamaster;
	private double gramsWaterMoccamaster;
	private String methodMoccamaster;
	private int grindSizeMoccamaster;
	private int currentBrewMethod;
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

	public CoffeeEntry(){
	}
	/*
	private double gramsCoffeeMoccamaster;
	private double gramsWaterMoccamaster;
	private String methodMoccamaster;
	private int grindSizeMoccamaster;
	*/
	public CoffeeEntry(AeropressCoffeeEntry aeropressEntry, V60CoffeeEntry v60Entry, MoccamasterCoffeeEntry moccamasterEntry){
		this.setIdentifier(aeropressEntry.getIdentifier());
		this.setCurrentJar(aeropressEntry.getCurrentJar());
		this.setName(aeropressEntry.getName());
		this.setManufacturer(aeropressEntry.getManufacturer());
		this.setDescription(aeropressEntry.getDescription());
		this.setDrinkType("Coffee");
		this.setRoastLevel(aeropressEntry.getRoastLevel());

		this.setGramsCoffeeAeropress(aeropressEntry.getAmountDrink());
		this.setGramsWaterAeropress(aeropressEntry.getAmountWater());
		this.setMethodAeropress(aeropressEntry.getBrewMethod());
		this.setTemperatureAeropress(aeropressEntry.getTemperature());
		this.setGrindSizeAeropress(aeropressEntry.getGrindSize());

		this.setGramsCoffeeV60(v60Entry.getAmountDrink());
		this.setGramsWaterV60(v60Entry.getAmountWater());
		this.setMethodV60(v60Entry.getBrewMethod());
		this.setTemperatureV60(v60Entry.getTemperature());
		this.setGrindSizeV60(v60Entry.getGrindSize());

		this.setGramsCoffeeMoccamaster(moccamasterEntry.getAmountDrink());
		this.setGramsWaterMoccamaster(moccamasterEntry.getAmountWater());
		this.setMethodMoccamaster(moccamasterEntry.getBrewMethod());
		this.setGrindSizeMoccamaster(moccamasterEntry.getGrindSize());
	}
/*
	setters and getters for the double attributes
*/
	public void setGramsCoffeeV60(String input){
		try{
			if(Double.parseDouble(input) > 0){
				this.gramsCoffeeV60 = Double.parseDouble(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setGramsCoffeeV60(Double input){
		this.setGramsCoffeeV60(String.format("%s", input));
	}
	public void setGramsWaterV60(String input){
		try{
			if(Double.parseDouble(input) > 0){
				this.gramsWaterV60 = Double.parseDouble(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setGramsWaterV60(Double input){
		this.setGramsWaterV60(String.format("%s", input));
	}
	public void setGramsCoffeeAeropress(String input){
		try{
			if(Double.parseDouble(input) > 0){
				this.gramsCoffeeAeropress = Double.parseDouble(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setGramsCoffeeAeropress(Double input){
		this.setGramsCoffeeAeropress(String.format("%s", input));
	}
	public void setGramsWaterAeropress(String input){
		try{
			if(Double.parseDouble(input) > 0){
				this.gramsWaterAeropress = Double.parseDouble(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setGramsWaterAeropress(Double input){
		this.setGramsWaterAeropress(String.format("%s", input));
	}
	public void setGramsCoffeeMoccamaster(String input){
		try{
			if(Double.parseDouble(input) > 0){
				this.gramsCoffeeMoccamaster = Double.parseDouble(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setGramsCoffeeMoccamaster(Double input){
		this.setGramsCoffeeMoccamaster(String.format("%s", input));
	}
	public void setGramsWaterMoccamaster(String input){
		try{
			if(Double.parseDouble(input) > 0){
				this.gramsWaterMoccamaster = Double.parseDouble(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setGramsWaterMoccamaster(Double input){
		this.setGramsWaterMoccamaster(String.format("%s", input));
	}
	public double getGramsCoffeeV60(){
		return this.gramsCoffeeV60;
	}
	public double getGramsWaterV60(){
		return this.gramsWaterV60;
	}
	public double getGramsCoffeeAeropress(){
		return this.gramsCoffeeAeropress;
	}
	public double getGramsWaterAeropress(){
		return this.gramsWaterAeropress;
	}
	public double getGramsCoffeeMoccamaster(){
		return this.gramsCoffeeMoccamaster;
	}
	public double getGramsWaterMoccamaster(){
		return this.gramsWaterMoccamaster;
	}
/*
	setters and getters for the int attributes
*/
	public void setTemperatureV60(String input){
		try{
			if(Integer.parseInt(input) > 0){
				this.temperatureV60 = Integer.parseInt(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setTemperatureV60(int input){
		this.setTemperatureV60(String.format("%s", input));
	}
	public void setTemperatureAeropress(String input){
		try{
			if(Integer.parseInt(input) > 0){
				this.temperatureAeropress = Integer.parseInt(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setTemperatureAeropress(int input){
		this.setTemperatureAeropress(String.format("%s", input));
	}
	public void setGrindSizeV60(String input){
		try{
			if(Integer.parseInt(input) > 0){
				this.grindSizeV60 = Integer.parseInt(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setGrindSizeV60(int input){
		this.setGrindSizeV60(String.format("%s", input));
	}
	public void setGrindSizeAeropress(String input){
		try{
			if(Integer.parseInt(input) > 0){
				this.grindSizeAeropress = Integer.parseInt(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setGrindSizeAeropress(int input){
		this.setGrindSizeAeropress(String.format("%s", input));
	}
	public void setGrindSizeMoccamaster(String input){
		try{
			if(Integer.parseInt(input) > 0){
				this.grindSizeMoccamaster = Integer.parseInt(input);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setCurrentBrewMethod(int inputInt){
		/*
			the logic for this method, and the map is as follows:
			0 - v60 method
			1 - Aeropress method
			2 - Moccamaster method
		*/
		this.currentBrewMethod = inputInt;
	}
	public void setGrindSizeMoccamaster(int input){
		this.setGrindSizeMoccamaster(String.format("%s", input));
	}
	public int getTemperatureV60(){
		return this.temperatureV60;
	}
	public int getTemperatureAeropress(){
		return this.temperatureAeropress;
	}
	public int getGrindSizeV60(){
		return this.grindSizeV60;
	}
	public int getGrindSizeAeropress(){
		return this.grindSizeAeropress;
	}
	public int getGrindSizeMoccamaster(){
		return this.grindSizeMoccamaster;
	}
	public int getCurrentBrewMethod(){
		return this.currentBrewMethod;
	}
/*
	setters and getters for the string attributes
*/
	public void setRoastLevel(String input){
		if(input.length() > 0){
			this.roastLevel = input;
		}
	}
	public void setMethodV60(String input){
		if(input.length() > 0){
			this.methodV60 = input;
		}
	}
	public void setMethodAeropress(String input){
		if(input.length() > 0){
			this.methodAeropress = input;
		}
	}
	public void setMethodMoccamaster(String input){
		if(input.length() > 0){
			this.methodMoccamaster = input;
		}
	}
	public String getRoastLevel(){
		return this.roastLevel;
	}
	public String getMethodV60(){
		return this.methodV60;
	}
	public String getMethodAeropress(){
		return this.methodAeropress;
	}
	public String getMethodMoccamaster(){
		return this.methodMoccamaster;
	}
/*
	the methods that need to be overwritten from the Drink object
*/
	@Override
	public String toString(){
		return String.format("Identifier: %s%nCurrent Jar: %s%nName: %s%nManufacturer: %s%nRoast Level: %s%nDescription: %s%n\tGrams coffee v60: %s%n\tGrams water v60: %s%n\tv60 process: %s%n\tv60 temperature: %s%n\tv60 grind size: %s%n\tGrams coffee aeropress: %s%n\tGrams water aeropress: %s%n\taeropress process: %s%n\taeropress temperature: %s%n\taeropress grind size: %s%n\tGrams coffee Moccamaster: %s%n\tGrams water Moccamaster: %s%n\tMoccamaster process: %s%n\tmoccamaster grind size: %s%n", getIdentifier(), getCurrentJar(), getName(), getManufacturer(), getRoastLevel(), getDescription(), getGramsCoffeeV60(), getGramsWaterV60(), getMethodV60(), getTemperatureV60(), getGrindSizeV60(), getGramsCoffeeAeropress(), getGramsWaterAeropress(), getMethodAeropress(), getTemperatureAeropress(), getGrindSizeAeropress(), getGramsCoffeeMoccamaster(), getGramsWaterMoccamaster(), getMethodMoccamaster(), getGrindSizeMoccamaster());
	}
	@Override
	public String toCSV(){
		String output =  String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"%s", getIdentifier(), getCurrentJar(), getName(), getManufacturer(), getDescription(), getGramsCoffeeV60(), getGramsWaterV60(), getMethodV60(), getTemperatureV60(), getGrindSizeV60(), getGramsCoffeeAeropress(), getGramsWaterAeropress(), getMethodAeropress(), getTemperatureAeropress(), getGrindSizeAeropress(), getGramsCoffeeMoccamaster(), getGramsWaterMoccamaster(), getMethodMoccamaster(), getGrindSizeMoccamaster(), getRoastLevel(), System.lineSeparator());
		output = output.replaceAll("<html>", "");
		output = output.replaceAll("</html>", "");
		return output;
	}
	@Override
	public String getCSVHeadder(){
		return String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"%s", "identifier", "current jar", "name", "manufacturer", "description", "grams coffee v60", "grams water v60", "v60 process", "temperature v60", "grind size v60", "grams coffee aeropress", "grams water aeropress", "aeropress process", "temperature aeropress", "grind size aeropress", "grams coffee moccamaster", "grams water moccamaster", "process moccamaster", "grind size moccamaster", "roast level", System.lineSeparator());
	}
	@Override
	public Double getAmountWater(){
		switch(currentBrewMethod){
			case 0:
				return getGramsWaterV60();
			case 1:
				return getGramsWaterAeropress();
			case 2:
				return getGramsWaterMoccamaster();
			default:
				return -1.0;
		}
	}
	@Override
	public void setAmountWater(Double input){
		switch(currentBrewMethod){
			case 0:
				this.setGramsWaterV60(input);
			case 1:
				this.setGramsWaterAeropress(input);
			case 2:
				this.setGramsWaterMoccamaster(input);
			default:
		}
	}
	@Override
	public Double getAmountDrink(){
		switch(currentBrewMethod){
			case 0:
				return getGramsCoffeeV60();
			case 1:
				return getGramsCoffeeAeropress();
			case 2:
				return getGramsCoffeeMoccamaster();
			default:
				return -1.0;
		}
	}
	@Override
	public void setAmountDrink(Double input){
		switch(currentBrewMethod){
			case 0:
				this.setGramsCoffeeV60(input);
			case 1:
				this.setGramsCoffeeAeropress(input);
			case 2:
				this.setGramsCoffeeMoccamaster(input);
			default:
		}
	}
	@Override
	public String getBrewMethod(){
		switch(currentBrewMethod){
			case 0:
				return String.format("%s", getMethodV60());
			case 1:
				return String.format("%s", getMethodAeropress());
			case 2:
				return String.format("%s", getMethodMoccamaster());
			default:
				return "";
		}
	}
	@Override
	public int getTemperature(){
		switch(currentBrewMethod){
			case 0:
				return getTemperatureV60();
			case 1:
				return  getTemperatureAeropress();
			case 2:
				return -1;
			default:
				return -1;
		}
	}
	@Override
	public void setTemperature(int input){
		switch(currentBrewMethod){
			case 0:
				setTemperatureV60(input);
				break;
			case 1:
				setTemperatureAeropress(input);
				break;
			case 2:

				break;
			default:
				
		}
	}
/*
	and now some methods that do special things for coffee entries
*/
	public AeropressCoffeeEntry getAeropressEntry(){
		AeropressCoffeeEntry output = new AeropressCoffeeEntry();
		output.setIdentifier(this.getIdentifier());
		output.setCurrentJar(this.getCurrentJar());
		output.setName(this.getName());
		output.setManufacturer(this.getManufacturer());
		output.setDescription(this.getDescription());
		output.setDrinkType(String.format("%s", this.getDrinkType()));
		output.setRoastLevel(this.getRoastLevel());
		output.setAmountDrink(getGramsCoffeeAeropress());
		output.setAmountWater(getGramsWaterAeropress());
		output.setTemperature(getTemperatureAeropress());
		output.setGrindSize(getGrindSizeAeropress());
		output.setBrewMethod(getMethodAeropress());

		return output;
	}
	public V60CoffeeEntry getV60Entry(){
		V60CoffeeEntry output = new V60CoffeeEntry();
		output.setIdentifier(this.getIdentifier());
		output.setCurrentJar(this.getCurrentJar());
		output.setName(this.getName());
		output.setManufacturer(this.getManufacturer());
		output.setDescription(this.getDescription());
		output.setDrinkType(String.format("%s", this.getDrinkType()));
		output.setRoastLevel(this.getRoastLevel());
		output.setAmountDrink(this.getGramsCoffeeV60());
		output.setAmountWater(this.getGramsWaterV60());
		output.setTemperature(this.getTemperatureV60());
		output.setGrindSize(this.getGrindSizeV60());
		output.setBrewMethod(this.getMethodV60());

		return output;
	}
	public MoccamasterCoffeeEntry getMoccamasterEntry(){
		MoccamasterCoffeeEntry output = new MoccamasterCoffeeEntry();
		output.setIdentifier(this.getIdentifier());
		output.setCurrentJar(this.getCurrentJar());
		output.setName(this.getName());
		output.setManufacturer(this.getManufacturer());
		output.setDescription(this.getDescription());
		output.setDrinkType(String.format("%s", this.getDrinkType()));
		output.setRoastLevel(this.getRoastLevel());
		output.setAmountDrink(this.getGramsCoffeeMoccamaster());
		output.setAmountWater(this.getGramsWaterMoccamaster());
		output.setTemperature(-1);
		output.setGrindSize(this.getGrindSizeMoccamaster());
		output.setBrewMethod(this.getMethodMoccamaster());

		return output;
	}
	public int getGrindSize(){
		switch(currentBrewMethod){
			case 0:
				return getGrindSizeV60();
			case 1:
				return getGrindSizeAeropress();
			case 2:
				return getGrindSizeMoccamaster();
			default:
				return -1;
		}
	}
	public void setGrindSize(String input){
		switch(currentBrewMethod){
			case 0:
				setGrindSizeV60(input);
				break;
			case 1:
				setGrindSizeAeropress(input);
				break;
			case 2:
				setGrindSizeMoccamaster(input);
				break;
			default:
				
		}
	}
	public void setGrindSize(int input){
		this.setGrindSize(String.format("%s", input));
	}
	public String getGramsCoffee(){
		switch(currentBrewMethod){
			case 0:
				return String.format("%s", getGramsCoffeeV60());
			case 1:
				return String.format("%s", getGramsCoffeeAeropress());
			case 2:
				return String.format("%s", getGramsCoffeeMoccamaster());
			default:
				return "";
		}
	}
	public void setGramsCoffee(String input){
		switch(currentBrewMethod){
			case 0:
				setGramsCoffeeV60(input);
				break;
			case 1:
				setGramsCoffeeAeropress(input);
				break;
			case 2:
				setGramsCoffeeMoccamaster(input);
				break;
			default:
				
		}
	}
	public void setTemperature(String input){
		switch(currentBrewMethod){
			case 0:
				setTemperatureV60(input);
				break;
			case 1:
				setTemperatureAeropress(input);
				break;
			case 2:

				break;
			default:
				
		}
	}
	public void setGramsWater(String input){
		switch(currentBrewMethod){
			case 0:
				setGramsWaterV60(input);
				break;
			case 1:
				setGramsWaterAeropress(input);
				break;
			case 2:
				setGramsWaterMoccamaster(input);
				break;
			default:
				
		}
	}
}