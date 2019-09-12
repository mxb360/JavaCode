import java.util.Random;
public class j5{
	public static void main(String[] args){
		int a;
		int b;
		Random xx=new Random();
		for(a=1;a<11;a++){
        		b=xx.nextInt(100);
			int c=(int)(Math.random()*100);
			System.out.println("随机数"+a+"  为"+b+"和"+c);	
		}
	}
}
