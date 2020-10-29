package factory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory[] tab = new Factory[2];
		tab[0] = new TruckFactory();
		tab[1] = new MotorbikeFactory();
		
		Vehicle[] tabVehicle = new Vehicle[2];
		
		tabVehicle[0] = tab[0].createVehicle();
		tabVehicle[1] = tab[1].createVehicle();
		
		for (Vehicle v : tabVehicle) {
			v.drive();
		}

	}

}
