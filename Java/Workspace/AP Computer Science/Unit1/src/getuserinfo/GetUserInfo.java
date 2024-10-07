package getuserinfo;
import java.util.Scanner;
public class GetUserInfo
{
	public static void main(String[] args)
	{
		String name;
		int age;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your age >> ");
		age= keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Please enter your name >> ");
		name = keyboard.nextLine();
		System.out.println("Your name is " + name);
		System.out.print("and you are " + age + " years old.");
		keyboard.close();
	}
}
