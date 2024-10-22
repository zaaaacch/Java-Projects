package house;
public class House {
	private String color;
	private String location;
	
	public House(String col, String loc) 
	{
		color = col;
		location = loc;
	}

	public void changeColor(String col)
	{
		color = col;
	}
	
	public String toString()
	{
		String str = "This house is " + color + " and it is located on " + location;
		return str;
	}
}
