package factoryPatternSandwiches;

public class SandwichFactory {
	public Sandwich getFood (String foodType) {
		if(foodType == null) {
			return null;
		}
		if(foodType.equalsIgnoreCase("BLT Sandwich")) {
			return new BLTSandwich();
		}
		if(foodType.equalsIgnoreCase("Egg Sandwich")) {
			return new EggSandwich();
		}
		if(foodType.equalsIgnoreCase("Fish Sandwich")) {
			return new FishSandwich();
		}
		if(foodType.equalsIgnoreCase("Chicken Sandwich")) {
			return new ChickenSandwich();
		}
		return null;
	}
}
