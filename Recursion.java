
public class Recursion {

	public static void main(String[] args) {
		int res = findFactorial(0);
		System.out.println("Result " + res);
	}

	public static int findFactorial(int argNum) {
		return argNum == 0 ? 1 : argNum * (findFactorial(argNum - 1));
	}
}
