package abstract_factory;

public class Motorbike implements Vehicle {
	
	public Motorbike(String style) {
		this.style = style;
		this.nbWheel = 2;
	}

	@Override
	public void drive() {
		System.out.println("Motorbike : {Wheel = " + this.nbWheel + ", Style = " + this.style + "}");
	}
	
	//Attributes
	private int nbWheel;
	private String style;

}
