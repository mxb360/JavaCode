import java.util.Scanner;
public class j1{
	public static void main(String[] args){
		Scanner inn=new Scanner(System.in);
		String sr;
		System.out.print("������ɼ���");
		int score=inn.nextInt();
		//c=score>=60;
		if(score>=90&&score<=100){
			sr="����";
		}else if(score>=80){
			sr="����";
		}else if(score>=60){
			sr="����";
			
		}else{
			sr="������";
		}
		System.out.println(sr);
		
	}	
}
