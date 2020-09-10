package factoryPatternSandwiches;

public class SFPDemo {

	public static void main(String[] args) {
		SandwichFactory sandwichFactory = new SandwichFactory();
		//BLT Sandwich
		Sandwich sandwich1 =sandwichFactory.getFood("BLT Sandwich");
		sandwich1.create();
		//Egg Sandwich
		Sandwich sandwich2 = sandwichFactory.getFood("Egg Sandwich");
		sandwich2.create();
		//Fish Sandwich
		Sandwich sandwich3 = sandwichFactory.getFood("Fish Sandwich");
		sandwich3.create();
		//Chicken Sandwich
		Sandwich sandwich4 = sandwichFactory.getFood("Chicken Sandwich");
		sandwich4.create();
	}

}
