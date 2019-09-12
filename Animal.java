public class Animal {
	String name;
	char sex;

	public void akk() {
		System.out.println("say hello");
	}

	public void add(int a,int b) {
		System.out.println(a + b);
	}

	public int sub(int a,int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		Cat b = new Cat();
		b.sub(12,27);
		System.out.println(a.toString() + "  " + b.toString());
	}
}
class Cat extends Animal {
	int numb;

	public void sxx(){
		System.out.println("I am a cat");
	}
	public int sub(int a,int b) {
		System.out.println(a - b);
		return a - b;
	}
}
