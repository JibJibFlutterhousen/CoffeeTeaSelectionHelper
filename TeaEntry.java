public class TeaEntry extends Drink{
	private Double gramsTea;
	private Double gramsWater;
	private int temperature;
	private String steepTime;
	private String teaType;
	private String brewMethod;
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

	public TeaEntry(){
	}
/*
	setters and getters for the double attributes
*/
	public void setGramsTea(String input){
		try{
			if(Double.parseDouble(input) > 0){
				this.gramsTea = Double.parseDouble(input);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void setGramsTea(Double input){
		this.setGramsTea(String.format("%s", input));
	}
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
	public Double getGramsTea(){
		return this.gramsTea;
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
			this.steepTime = String.format("%s", input);
		}
	}
	public void setTeaType(String input){
		if(input.length() > 0){
			this.teaType = String.format("%s", input);
		}
	}
	public void setBrewMethod(String input){
		if(input.length() > 0){
			this.brewMethod = String.format("%s", input);
		}
	}
	public String getSteepTime(){
		return this.steepTime;
	}
	public String getTeaType(){
		return this.teaType;
	}
	@Override
	public String getBrewMethod(){
		return this.brewMethod;
	}
/*
	the methods that need to be overwritten from the Drink object
*/
	@Override
	public String toString(){
		return String.format("Drink Type: %s%nIdentifier: %s%nCurrent Jar: %s%nName: %s%nManufacturer: %s%nDescription: %s%nGrams of Tea Used: %s%nGrams of Water Used: %s%nBrewing Temperature: %s%nSteeping Time: %s%nBrewing Method: %s%nType of Tea: %s%nIn Stock: %s%n", getDrinkType(), getIdentifier(), getCurrentJar(), getName(), getManufacturer(), getDescription(), getGramsTea(), getGramsWater(), getTemperature(), getSteepTime(), getBrewMethod(), getTeaType(), getInStock());
	}
	@Override
	public String toCSV(){
		String output = String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"%s", getDrinkType(), getIdentifier(), getCurrentJar(), getName(), getManufacturer(), getDescription(), getGramsTea(), getGramsWater(), getTemperature(), getSteepTime(), getBrewMethod(), getTeaType(), getInStock(), System.lineSeparator());
		output = output.replaceAll("<html>", "");
		output = output.replaceAll("</html>", "");
		return output;
	}
	@Override
	public String getCSVHeadder(){
		return String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"%s", "drink type", "identifier", "current jar", "name", "manufacturer", "description", "grams of tea", "grams of water", "brewwing temperature", "steeping time", "brewing method", "type of tea", "in stock", System.lineSeparator());
	}
	@Override
	public Double getAmountWater(){
		return getGramsWater();
	}
	@Override
	public void setAmountWater(Double input){
		this.setGramsWater(input);
	}
	@Override
	public Double getAmountDrink(){
		return getGramsTea();
	}
	@Override
	public void setAmountDrink(Double input){
		this.setGramsTea(input);
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