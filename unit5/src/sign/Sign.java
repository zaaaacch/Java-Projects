package sign;

public class Sign {
	
	private String mess;
	private int wid;
	
	public Sign(String m, int w) {
		mess = m;
		wid = w;
	}
	
	public int numberOfLines() {
		int len = mess.length();
		int lines = len / wid;
		if(len % wid != 0) {
			lines++;
		}
		return lines;
	}
	
	public String getLines() {
		String result = "";
		if (mess.length() == 0) {
			return null;
		}
		int i;
		for (i = 0; i < numberOfLines() - 1; i++) {
			result += mess.substring(i * (wid), (i+1) * wid) + ";";
		}
		result += mess.substring(i * wid);
		return result;
	}
	
	
	public static void main(String[] args) {
		Sign s1 = new Sign("Everything on sale, please come in", 15);
		System.out.println(s1.getLines());
	}
}

