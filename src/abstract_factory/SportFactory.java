package abstract_factory;

public class SportFactory implements Factory {

	@Override
	public Truck createTruck() {
		return new Truck("Sport");
	}

	@Override
	public Motorbike createMotorbike() {
		return new Motorbike("Sport");
	}
	
}
