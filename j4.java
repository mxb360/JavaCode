import java.util.*;
public class j4{
	public static void main(String[] args){
	int year;
	String b;
	Scanner inn=new Scanner(System.in);
	System.out.println("请输入年份：");
	year=inn.nextInt();
	if(year%4==0&&year/100!=0||year/400==0)
		b="年是闰年";
	else
		b="年是平年";
	System.out.println(year+b);
	}
}
