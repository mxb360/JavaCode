import java.util.Scanner;
public class j10_studentScore{
	public static void main(String[] args){
		int student,lesson,ave=0,suml=0,i,j,k;
	        Scanner in=new Scanner(System.in);

	/*
 	*�����ǲ��ֱ�������
 	*student ѧ������  ave ����ƽ���ɼ� 
 	*lesson  �γ���    suml �ܷ�ƽ���ɼ�
	*i,j,k   ��������
 	*/

		System.out.println("*****************  ѧ���ɼ�ͳ��ϵͳ  ****************");
		System.out.println("¼��ѧ���ɼ�");
		System.out.println("1.��������ѧ�������ܿγ���");
		student=in.nextInt();
		lesson=in.nextInt();
		String[] keCheng=new String[lesson];				/*�γ�����*/
		String[] name=new String[student];				/*ѧ������*/
		int[] sum=new int[student];
		int[][] score=new int[student][lesson];				/*����ѧ���ɼ�*/
		System.out.println("��"+student+"��ѧ������"+lesson+"�ſγ�");
		System.out.println("2.�붨����"+lesson+"�ſγ̵�����");
/******************************************  �ɼ�¼��  ********************************/
		for(i=0;i<lesson;i++)
			keCheng[i]=in.next();
		System.out.println("\n3.�������ڶ�Ӧλ�������ѧ���������ͳɼ���");
		System.out.print("  ����\t");		
		for(i=0;i<lesson;i++)
			System.out.print(keCheng[i]+"\t");
		System.out.println();

		for(i=0;i<student;i++){
			System.out.print((i+1)+":");
			name[i]=in.next();
			for(j=0;j<lesson;j++){
				score[i][j]=in.nextInt();
				sum[i]=sum[i]+score[i][j];
			}
		}
		System.out.println("\n�ɼ�¼����ɣ�\n4.��ʾͳ�ƽ����\n");	
		System.out.print("����\t");
		for(i=0;i<lesson;i++)
			System.out.print(keCheng[i]+"\t");
		System.out.println("�ܷ�\tλ��");
/********************************   ���ܷ�����   ******************************************/
		for(i=0;i<student;i++){
			int t=0,temp=0;
			for(j=0;j<student;j++)
				for(k=0;k<lesson;k++)
					if(sum[k]>temp){
						temp=sum[k];
						t=k;
					}					

			System.out.print(name[t]+"\t");
			for(k=0;k<lesson;k++)
				System.out.print(score[t][k]+"\t");
			System.out.println(sum[t]+"\t"+(i+1));
			suml+=sum[t];
			sum[t]=0;

		}
/*********************************************************************************/
		System.out.print("\nƽ���֣�");
		for(i=0;i<lesson;i++){
			for(j=0,ave=0;j<student;j++)
				ave+=score[i][j];
			System.out.print(ave/student+"\t");	
		}
		System.out.println(suml/student);

	}
}
