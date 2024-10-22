package numbers;

public class Numbers {
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("b >= a = " + (b >= a));
		System.out.println("b <= a = " + (b <= a));
		boolean test1 = 1 < 2;
		boolean test2 = 1 > 2;
		boolean test3 = 3.5 != 1;
		boolean test4 = 17*3.5 >= 67.0 - 42;
		boolean test5 = 9.8*54 <= 654;
		boolean test6 = 6*4 == 3*8;
		boolean test7 = 6*4 <= 3*8;
		boolean test8 = 6*4 < 3*8;
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		System.out.println(test6);
		System.out.println(test7);
		System.out.println(test8);
	}
}
