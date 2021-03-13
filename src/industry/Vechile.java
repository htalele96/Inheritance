package industry;

public class Vechile {
	
	
	private int version = 1;
	
	public Vechile() {
		System.out.println("Vechile Constructor");
	}
	
	public void getName() {
		System.out.println("Vechical ");
		
	}
	
	public void startVechile () {
		System.out.println("Manual Start");
	}
	
	public int showVersion() {
		return version;
	}
}
