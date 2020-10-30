package abstract_factory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		Factory currentFactory = new VintageFactory();
		
		Vehicle currentVehicle = currentFactory.createTruck();
		currentVehicle.drive();
		
		currentVehicle = currentFactory.createMotorbike();
		currentVehicle.drive();
		
		currentFactory = new SportFactory();
		currentVehicle = currentFactory.createTruck();
		currentVehicle.drive();
		
		currentVehicle = currentFactory.createMotorbike();
		currentVehicle.drive();		
	}
}
