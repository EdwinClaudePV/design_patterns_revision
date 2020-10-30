package factory_method;

public class MotorbikeFactory implements Factory{

	@Override
	public Vehicle createVehicle() {
		Motorbike newMotorbike = new Motorbike(2);
		return newMotorbike;
	}

}
