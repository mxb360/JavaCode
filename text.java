import java.util.Scanner;
public class text{
        public static void main(String[] args){
        	Scanner inn=new Scanner(System.in);
		System.out.print("请输入名字：");
		String name=inn.next();
		System.out.print("请输入性别：");
		String sex=inn.next();
		System.out.print("请输入年龄：");
		int age=inn.nextInt();
		System.out.println("\n姓名："+name);
		System.out.println("性别："+sex);
		System.out.println("年龄："+age);
	
    }
}
