package factory;

public class TruckFactory implements Factory {

	@Override
	public Vehicle createVehicle() {
		Truck newTruck = new Truck(4);
		return newTruck;
	}

}
