public class V60CoffeeEntry extends CoffeeEntry{

	public V60CoffeeEntry(){}
/*
	overrides for the Drink inheritance
*/
	@Override
	public Double getAmountWater(){
		return getGramsWaterV60();
	}
	@Override
	public void setAmountWater(Double input){
		setGramsWaterV60(input);
	}
	@Override
	public Double getAmountDrink(){
		return getGramsCoffeeV60();
	}
	@Override
	public void setAmountDrink(Double input){
		setGramsCoffeeV60(input);
	}
	@Override
	public String getBrewMethod(){
		return getMethodV60();
	}
	@Override
	public int getTemperature(){
		return getTemperatureV60();
	}
	@Override
	public void setTemperature(int input){
		setTemperatureV60(input);
	}
/*
	Overrides for the CoffeeEntry inheretance
*/
	public void setBrewMethod(String input){
		setMethodV60(input);
	}
	@Override
	public void setGrindSize(String input){
		setGrindSizeV60(input);
	}
	@Override
	public int getGrindSize(){
		return getGrindSizeV60();
	}
}