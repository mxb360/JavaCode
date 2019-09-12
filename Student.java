public class Student {
	String name;
	int age;
	String adress;
	float score;
	long studentNumber;

	public void study() {
		System.out.println(name+"在学习");
	} 

	public void sayHello(String name) {
		System.out.println(this.name+"向"+name+"说：Hello!");
	}

	public static void main(String[] args) {
		Student man = new Student();
		Student man2 = new Student();
		man.name="马小波";
		man2.name="马士兵";
		man.study();
		man2.sayHello(man.name);
	}
}
