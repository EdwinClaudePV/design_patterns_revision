package factory_method;

public class TruckFactory implements Factory {

	@Override
	public Vehicle createVehicle() {
		Truck newTruck = new Truck(4);
		return newTruck;
	}

}
