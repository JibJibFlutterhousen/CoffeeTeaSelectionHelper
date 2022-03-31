public class MoccamasterCoffeeEntry extends CoffeeEntry{

	public MoccamasterCoffeeEntry(){}
/*
	overrides for the Drink inheritance
*/
	@Override
	public Double getAmountWater(){
		return getGramsWaterMoccamaster();
	}
	@Override
	public void setAmountWater(Double input){
		setGramsWaterMoccamaster(input);
	}
	@Override
	public Double getAmountDrink(){
		return getGramsCoffeeMoccamaster();
	}
	@Override
	public void setAmountDrink(Double input){
		setGramsCoffeeMoccamaster(input);
	}
	@Override
	public String getBrewMethod(){
		return getMethodMoccamaster();
	}
	@Override
	public int getTemperature(){
		return -1;
	}
	@Override
	public void setTemperature(int input){
	}
/*
	Overrides for the CoffeeEntry inheretance
*/
	public void setBrewMethod(String input){
		setMethodMoccamaster(input);
	}
	@Override
	public void setGrindSize(String input){
		setGrindSizeMoccamaster(input);
	}
	@Override
	public int getGrindSize(){
		return getGrindSizeMoccamaster();
	}
}
