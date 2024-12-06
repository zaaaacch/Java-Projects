package bus;

public class Bus {
	private int stops, currentStop;
	private boolean reverse;
	
	public Bus(int s) {
		stops = s;
		currentStop = 1;
		reverse = false;
	}
	public int getCurrentStop() {
		return currentStop;
	}
	
	public void move() {
		if (reverse && (currentStop > 1)) {
			currentStop--;
			if (currentStop == 1) {
				reverse = false;
			}
		}
		else {
			currentStop++;
			if (currentStop == stops) {
				reverse = true;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Bus bus1 = new Bus(10);
		System.out.println(bus1.getCurrentStop());
		for(int i = 1; i < 20; i++) {
			bus1.move();
			System.out.println(bus1.getCurrentStop());
		}
	}
}
