package lamp;

public class Lamp {
	private boolean isOn;
	public void turnOn() {
		isOn = true;
		System.out.println("The lamp is on.");
	}
	public void turnOff() {
		isOn = false;
		System.out.println("The lamp is off.");
	}
}
