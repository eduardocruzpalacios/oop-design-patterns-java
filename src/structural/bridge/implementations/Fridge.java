package structural.bridge.implementations;

public class Fridge implements Device {

	private float temperature;

	public Fridge() {
	}

	public Fridge(float temperature) {
		this.temperature = temperature;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Fridge [temperature=" + temperature + "]";
	}

	@Override
	public void execute(String command) {
		switch (command) {
		case "increase":
			this.setTemperature((float) (this.getTemperature() + .5));
			break;
		case "decrease":
			this.setTemperature((float) (this.getTemperature() - .5));
			break;
		default:
			System.out.println("Unknown command");
			break;
		}
	}

}
