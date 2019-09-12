public class j13{
	public static void main(String[] args){
 		int x=0;
		while(x!='q'){
			try{
				 x=System.in.read();
			}catch(Exception e){};
		
			System.out.println((char)x);
		}
	}
}
