import java.util.Scanner;
public class j1{
	public static void main(String[] args){
		Scanner inn=new Scanner(System.in);
		String sr;
		System.out.print("请输入成绩：");
		int score=inn.nextInt();
		//c=score>=60;
		if(score>=90&&score<=100){
			sr="优秀";
		}else if(score>=80){
			sr="良好";
		}else if(score>=60){
			sr="及格";
			
		}else{
			sr="不及格";
		}
		System.out.println(sr);
		
	}	
}
