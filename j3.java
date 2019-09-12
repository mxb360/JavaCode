import java.util.Scanner;
public class j3{
	public static void main(String[] args){
		int a;
		String b="偶数";
		Scanner inn=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		a=inn.nextInt();
		if(a!=0)
			if(a%2!=0)
				b="奇数";
		System.out.println(a+"是"+b);
	}
}
