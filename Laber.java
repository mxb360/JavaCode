import java.util.Scanner;
public class Laber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		A: for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i/2;j++)
				if(i%j==0)
					continue A;
			System.out.print(i+"\t");
		}
	
		int m = 1;
		System.out.println();
		laber:while(true){

			m++;
			if(m<10)
				continue laber;
			if(m==20)
				break laber;
			System.out.print(m+" ");
		}	
	}	
}
