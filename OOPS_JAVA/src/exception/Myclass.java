package exception;

public class Myclass {
	public static void main(String[] args) {
		int a = -1;
		try {
			if (a < 0) {
				System.exit(0);
			}
		} finally {
			System.out.println("out");
		}
	}
}
