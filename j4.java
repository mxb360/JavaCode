import java.util.*;
public class j4{
	public static void main(String[] args){
	int year;
	String b;
	Scanner inn=new Scanner(System.in);
	System.out.println("��������ݣ�");
	year=inn.nextInt();
	if(year%4==0&&year/100!=0||year/400==0)
		b="��������";
	else
		b="����ƽ��";
	System.out.println(year+b);
	}
}
