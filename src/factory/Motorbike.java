package factory;

public class Motorbike implements Vehicle {
	
	public Motorbike(int nbWheel) {
		this.nbWheel = nbWheel;
	}

	@Override
	public void drive() {
		System.out.println("I am a Motorbike and I have " + this.nbWheel + " wheel(s). I drive !!!");
		
	}
	
	public int getNbWheel() {
		return nbWheel;
	}

	public void setNbWheel(int nbWheel) {
		this.nbWheel = nbWheel;
	}
	
	//Attributes
	private int nbWheel;

}
