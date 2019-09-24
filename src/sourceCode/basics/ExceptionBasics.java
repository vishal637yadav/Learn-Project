package sourceCode.basics;

public class ExceptionBasics {

	public static void main(String[] args) {
		System.out.println("Before ");
		forLoopMethod();
		System.out.println("After ");

	}

	public static void forLoopMethod() {

		for (int i = 0; i < 10; i++) {
			try {

				System.out.println("forLoopMethod value i = " + i);
				raiseException(i);
			} catch (Exception e) {
				System.out.println("forLoopMethod Exception = " + e);
			}

		}
	}

	public static void raiseException(int i) {
		System.out.println("raiseExceptions value i = " + i);
		if (i == 5) {
			System.out.println("i/0 = " + i / 0);
		}

	}
}
