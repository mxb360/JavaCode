public class ThisText {
	String name;
	byte age;
	static int number;

	public static void student() {
		number = 100012;
	}

	public ThisText() {
		this.age = 12;
		System.out.println("我是构造方法。");
	}

	public ThisText(int a,int b) {
		this();
		System.out.println(a + b);
	}
	public int add(int a,int b) {
		return a + b + age;
	}

	public static void main(String[] args) {
		ThisText sum = new ThisText(11,145);
		System.out.println(sum.add(1254,7745));
	}
}
