public class Student {
	String name;
	int age;
	String adress;
	float score;
	long studentNumber;

	public void study() {
		System.out.println(name+"��ѧϰ");
	} 

	public void sayHello(String name) {
		System.out.println(this.name+"��"+name+"˵��Hello!");
	}

	public static void main(String[] args) {
		Student man = new Student();
		Student man2 = new Student();
		man.name="��С��";
		man2.name="��ʿ��";
		man.study();
		man2.sayHello(man.name);
	}
}
