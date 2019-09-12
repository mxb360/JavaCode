public class Test {
	public static void main(String[] args) {
		System.out.println(575.4%44.3 + "\n" + fun(575.4,44.3));
	}
	public static double fun(double a,double b) {
		while(a >= b)
			a = a - b;
		return a;
	}
}
