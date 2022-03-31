public class AeropressCoffeeEntry extends CoffeeEntry{

	public AeropressCoffeeEntry(){}
/*
	overrides for the Drink inheritance
*/
	@Override
	public Double getAmountWater(){
		return getGramsWaterAeropress();
	}
	@Override
	public void setAmountWater(Double input){
		setGramsWaterAeropress(input);
	}
	@Override
	public Double getAmountDrink(){
		return getGramsCoffeeAeropress();
	}
	@Override
	public void setAmountDrink(Double input){
		setGramsCoffeeAeropress(input);
	}
	@Override
	public String getBrewMethod(){
		return getMethodAeropress();
	}
	@Override
	public int getTemperature(){
		return getTemperatureAeropress();
	}
	@Override
	public void setTemperature(int input){
		setTemperatureAeropress(input);
	}
/*
	Overrides for the CoffeeEntry inheretance
*/
	public void setBrewMethod(String input){
		setMethodAeropress(input);
	}
	@Override
	public void setGrindSize(String input){
		setGrindSizeAeropress(input);
	}
	@Override
	public int getGrindSize(){
		return getGrindSizeAeropress();
	}
}