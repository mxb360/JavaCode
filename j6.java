import java.util.Scanner;
public class j6{
	public static void main(String[] args){
		Scanner im=new Scanner(System.in);
		int people,a,ave,i=0,sum=0;
		System.out.print("������������");
		people=im.nextInt();
		while(i<people){
			i++;
			System.out.print("�������"+i+"��ѧ���ĳɼ���");
			a=im.nextInt();
			sum=sum+a;
		}
		System.out.println("��"+people+"��ѧ����ƽ���ɼ�Ϊ"+(sum*1./people));
		
	}
}