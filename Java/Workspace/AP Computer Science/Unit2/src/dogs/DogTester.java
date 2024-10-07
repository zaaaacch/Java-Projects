package dogs;

public class DogTester {
	public static void main(String[] args) {
		Dog Fido = new Dog(); 							// breed = null, sound = null, age = 0
		Dog Jerry = new Dog("lab", "bark", 7); 			// breed = "lab", sound = "bark", age = 7
		Dog Linda = new Dog("pug", 10); 				// breed = "pug", sound = "bark", age = 10
		Dog Princess = new Dog("chihuahua", "yap!");	// breed = "chihuahua", sound = "yap!", age = 0
		Dog Doggy = new Dog(19, "meow"); 				// breed = "dog", sound = "meow", age = 19
		
		System.out.println(Fido);
	}
}
