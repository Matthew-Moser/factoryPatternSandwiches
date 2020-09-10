package factoryPatternSandwiches;

public class ChickenSandwich implements Sandwich {

	@Override
	public void create() {
		System.out.println("Chicken sandwich has been created");

	}

}
