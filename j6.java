import java.util.Scanner;
public class j6{
	public static void main(String[] args){
		Scanner im=new Scanner(System.in);
		int people,a,ave,i=0,sum=0;
		System.out.print("请输入人数：");
		people=im.nextInt();
		while(i<people){
			i++;
			System.out.print("请输入第"+i+"个学生的成绩：");
			a=im.nextInt();
			sum=sum+a;
		}
		System.out.println("这"+people+"个学生的平均成绩为"+(sum*1./people));
		
	}
}