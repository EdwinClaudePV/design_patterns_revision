package abstract_factory;

public class Truck implements Vehicle{

	public Truck(String style) {
		this.style = style;
		this.nbWheel = 4;
	}
	
	@Override
	public void drive() {
		System.out.println("Truck : {Wheel = " + this.nbWheel + ", Style = " + this.style + "}");
	}
	
	//Attributes
	private int nbWheel;
	private String style;

}
