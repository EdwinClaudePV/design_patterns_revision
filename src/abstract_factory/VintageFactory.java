package abstract_factory;

public class VintageFactory implements Factory {

	@Override
	public Truck createTruck() {
		return new Truck("Vintage");
	}

	@Override
	public Motorbike createMotorbike() {
		return new Motorbike("Vintage");
	}

}
