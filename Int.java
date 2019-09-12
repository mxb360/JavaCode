public class Int{
	public static void main(String[] args) {
		int a = 15;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));

		long b = 123456781255559L;
		int c = (int)b;
		System.out.println(c);


		char ch;
		ch = 58;
		System.out.println(ch);

		int d = 2;
		long e = 7;
		int f = d + 7;
		int g = 0b00011001110000_0100_011101;
		int h = 1_458_44778;
		System.out.println(g);
		final int PI;
		PI = 25;
	//	PI = 25;
		
		int j = 1 + (int)(Math.random() * 6);
		System.out.println(j);
	}
}
