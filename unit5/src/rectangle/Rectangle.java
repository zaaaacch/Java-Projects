package rectangle;

public class Rectangle {
	
	// Instance variables
	private int length;
	private int width;
	
	// Constructors
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	public Rectangle(int len, int w)
	{
		length = len;
		width = w;
	}
	
	// Accessor (getter) methods
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	public int getPerimeter()
	{
		return 2 * (length + width);
	}
	public int getArea()
	{
		return length * width;
	}
	
	// Mutator (setter) methods
	public void setLength(int len)
	{
		length = len;
	}
	public void setWidth(int w)
	{
		width = w;
	}
	public void setDims(int len, int w)
	{
		length = len;
		width = w;
	}
	
	// toString()
	public String toString()
	{
		String str = "Length: " + length + "\nWidth: " + width;
		return str;
	}
	
}
