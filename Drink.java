abstract class Drink{
	private int identifier;
	private int currentJar;
	private String name;
	private String manufacturer;
	private String description;
	private String drinkType;
	private boolean inStock;
	/*
		for some reason we can't overwrite the toString() function inhereted from the object class, weird...
	*/
	//abstract String toString();
	abstract String toCSV();
	abstract String getCSVHeadder();

	abstract Double getAmountWater();
	abstract void setAmountWater(Double input);


	abstract Double getAmountDrink();
	abstract void setAmountDrink(Double input);

	abstract String getBrewMethod();

	abstract int getTemperature();
	abstract void setTemperature(int input);
/*
	setters and getters for the int attributes
*/
	public void setIdentifier(String input){
		try{
			if(Integer.parseInt(input) > 0){
				this.identifier = Integer.parseInt(input);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void setIdentifier(int input){
		this.setIdentifier(String.format("%s", input));
	}
	public void setCurrentJar(String input){
		try{
			if(Integer.parseInt(input) > 0){
				this.currentJar = Integer.parseInt(input);
				this.inStock = true;
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void setCurrentJar(int input){
		this.setCurrentJar(String.format("%s", input));
	}
	public int getIdentifier(){
		return this.identifier;
	}
	public int getCurrentJar(){
		return this.currentJar;
	}
/*
	setters and getters for the string attributes
*/
	public void setName(String input){
		if(input.length() > 0){
			this.name = String.format("%s", input);
		}
	}
	public void setManufacturer(String input){
		if(input.length() > 0){
			this.manufacturer = String.format("%s", input);
		}
	}
	public void setDescription(String input){
		if(input.length() > 0){
			this.description = String.format("%s", input);
		}
	}
	public void setDrinkType(String input){
		if(input.length() > 0){
			this.drinkType = String.format("%s", input);
		}
	}
	public String getName(){
		return this.name;
	}
	public String getManufacturer(){
		return this.manufacturer;
	}
	public String getDescription(){
		return this.description;
	}
	public String getDrinkType(){
		return this.drinkType;
	}
/*
	setters and getters for boolean attributes
*/
	public boolean getInStock(){
		return this.inStock;
	}
}