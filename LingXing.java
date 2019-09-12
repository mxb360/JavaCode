public class LingXing{
	public static void main(String[] args){
		int x,y;
		for(y=0;y<=20;y++)
		{
			for(x=0;x<=60;x++)
				if((x+y==10||x+y==30||x-y==10||x-y==-10)
				 ||(x+y==50||x+y==70||x-y==50||x-y==30))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}	
	
	}
}
