package thing;

public class Thing {
	
	private String myName;
	
	public Thing(String myName) {
		this.myName = myName;
	}
	
	public String getName() {
		return myName;
	}
	
	public void setName(String newName) {
		this.myName = newName;
	}
	
	public void printMessage() {
		System.out.println(myName + "_is_great");
	}
	
}
