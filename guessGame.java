import java.util.Scanner;
public class guessGame{
	public static void main(String[] args){
		int gamer,computer,c;
		String win,quan_g,quan_c;
		String win1="ƽ��",quan1="ʯͷ";
		String win2="������˼������Ӯ",quan2="����";
		String win3="��ϲ����Ӯ�ˣ�",quan3="��";

		while(true){
		System.out.println("------**��ȭ��Ϸ**------");
		System.out.println("1."+quan1+"\t"+"2."+quan2+"\t"+"3."+quan3+"\t");
		System.out.print("���ȭ��");
		Scanner inn=new Scanner(System.in);
		computer=(int)(Math.random()*3+1);
		gamer=inn.nextInt();
		quan_g=quan_c=quan1;

		if(gamer==1) 
			quan_g=quan1;
		if(computer==1)
			quan_c=quan1;
		if(gamer==2) 
			quan_g=quan2;
		if(computer==2)
			quan_c=quan2;
		if(gamer==3) 
			quan_g=quan3;
		if(computer==3)
			quan_c=quan3;
		
		System.out.println("�����"+quan_g+" ���Գ���"+quan_c);

		if(gamer+computer==3||gamer+computer==5)
			if(gamer>computer)
				win=win2;
			else
				win=win3;
		else if(gamer+computer==4&&gamer!=computer)
			if(gamer>computer)
				win=win3;
			else
				win=win2;
		else
			win=win1;
		System.out.println("****** "+win+" ******\n");
		}
		
	}
}
