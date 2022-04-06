

public class Motorcycle extends Vehicle implements IVehicleMotorcycle {

	public Motorcycle(String color, String year, double engine) {
		super(color, year, engine);
		configureVehicle(color, year, engine);
		
	}

	@Override
	public void configureVehicle(String color, String year, double engine) {
		System.out.println("Criando um carro com Interface: " + color + " " + engine);
		super.startVehicle();
	}

	@Override
	public void startVehicle() {
		// TODO Auto-generated method stub

	}

}
