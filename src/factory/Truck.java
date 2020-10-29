package factory;

public class Truck implements Vehicle{
	
	public Truck(int nbWheel)
	{
		this.nbWheel = nbWheel;
	}

	@Override
	public void drive() {
		System.out.println("I am a Truck and I have " + this.nbWheel + " wheel(s). I drive !!!");
		
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
