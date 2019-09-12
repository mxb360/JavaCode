import java.util.Scanner;
public class j10_studentScore{
	public static void main(String[] args){
		int student,lesson,ave=0,suml=0,i,j,k;
	        Scanner in=new Scanner(System.in);

	/*
 	*以上是部分变量声明
 	*student 学生人数  ave 各科平均成绩 
 	*lesson  课程数    suml 总分平均成绩
	*i,j,k   计数变量
 	*/

		System.out.println("*****************  学生成绩统计系统  ****************");
		System.out.println("录入学生成绩");
		System.out.println("1.请输入总学生数和总课程数");
		student=in.nextInt();
		lesson=in.nextInt();
		String[] keCheng=new String[lesson];				/*课程名字*/
		String[] name=new String[student];				/*学生姓名*/
		int[] sum=new int[student];
		int[][] score=new int[student][lesson];				/*所有学生成绩*/
		System.out.println("共"+student+"个学生，共"+lesson+"门课程");
		System.out.println("2.请定义这"+lesson+"门课程的名字");
/******************************************  成绩录入  ********************************/
		for(i=0;i<lesson;i++)
			keCheng[i]=in.next();
		System.out.println("\n3.请依次在对应位置输入各学生的姓名和成绩：");
		System.out.print("  姓名\t");		
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
		System.out.println("\n成绩录入完成！\n4.显示统计结果：\n");	
		System.out.print("姓名\t");
		for(i=0;i<lesson;i++)
			System.out.print(keCheng[i]+"\t");
		System.out.println("总分\t位次");
/********************************   按总分排序   ******************************************/
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
		System.out.print("\n平均分：");
		for(i=0;i<lesson;i++){
			for(j=0,ave=0;j<student;j++)
				ave+=score[i][j];
			System.out.print(ave/student+"\t");	
		}
		System.out.println(suml/student);

	}
}
