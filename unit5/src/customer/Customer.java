package customer;

public class Customer {
	private static int nextAccNum = 1;
	private String name;
	private int currAccNum;
	
	public Customer(String n) {
		name = n;
		currAccNum = nextAccNum;
		nextAccNum++;
	}
	
	public String bill(double due) {
		return name + ", account number " + currAccNum + ", please pay $" + due;
	}
	
	public static int nextNum() {
		return nextAccNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
