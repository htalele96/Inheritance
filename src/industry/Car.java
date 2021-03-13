package industry;

public class Car extends Vechile {
//	public void getName() {
//		System.out.println("Car ");
//		
//	}
	
	public Car() {
		super();
		System.out.println("Car constructor");
	}
	
	public Car(String carName) {
		super();
		System.out.println("Car constructor " + carName);
	}
	
	public int showVersion() {
		return super.showVersion();
	}
	
	
	public void startVechile () {
		System.out.println("Auto Start");
	}

}
