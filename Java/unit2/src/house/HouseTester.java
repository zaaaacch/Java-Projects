package house;

public class HouseTester {
	public static void main(String[] args)
	{
		House Rob = new House("orange", "Elm St");
		System.out.println("Rob\'s house " + Rob.toString());
		House Sage = new House("green", "Main St");
		System.out.println("Sage\'s house " + Sage);
		House Jill = new House("tan", "Rocky Rd");
		System.out.println("Jill\'s house " + Jill.toString());
		House Jack = Jill;
		Jack.changeColor("blue");
		System.out.println("Jill\'s house " + Jill.toString());
	}
}
