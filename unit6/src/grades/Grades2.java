package grades;

public class Grades2 {
	public static void main(String[] args) {
		Grade[] list = new Grade[8];
		for (int i = 0; i < list.length; i++) {
			list[i] = new Grade(Math.random() * 50 + 50);
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getLetter());
		}
		for (Grade elem: list) {
			System.out.println(elem);
		}
		for (Grade elem: list) {
			elem.setGrade(Math.random() * 50 + 50);
		}
		System.out.println(' ');
		for (Grade elem: list) {
			System.out.println(elem);
		}
	}
}
