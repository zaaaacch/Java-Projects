package dogs;

public class Dog {
	private String breed;
	private String sound;
	private int age;
	public Dog() {
		breed = null;
		sound = null;
		age = 0;
	}
	public Dog(String brd, String snd, int ag) {
		breed = brd;
		sound = snd;
		age = 0;
	}
	public Dog(String brd, int ag) {
		breed = brd;
		sound = "woof";
		age = ag;
	}
	public Dog(String brd, String snd) {
		breed = brd;
		sound = snd;
		age = 0;
	}
	public Dog(int ag, String snd) {
		breed = "dog";
		sound = snd;
		age = ag;
	}
	public String toString() {
		return "You have a " + age + " year old " + breed + " that says " + sound;
	}
}
