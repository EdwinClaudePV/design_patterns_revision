package factory;

public class MotorbikeFactory implements Factory{

	@Override
	public Vehicle createVehicle() {
		Motorbike newMotorbike = new Motorbike(2);
		return newMotorbike;
	}

}
