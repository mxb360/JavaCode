import java.util.Scanner;
public class j3{
	public static void main(String[] args){
		int a;
		String b="ż��";
		Scanner inn=new Scanner(System.in);
		System.out.println("������һ��������");
		a=inn.nextInt();
		if(a!=0)
			if(a%2!=0)
				b="����";
		System.out.println(a+"��"+b);
	}
}
