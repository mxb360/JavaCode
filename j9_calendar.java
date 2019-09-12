import java.util.Scanner;
public class j9_calendar{
	public static void main(String[] args){
		int year,month,day=1,i,t=0,yue=0,sum;
		Scanner in=new Scanner(System.in);

		System.out.println("***********日历***********");
		System.out.println("请输入年份(1900- )和月份(1-12)，如：2016 11");
		year=in.nextInt();
		month=in.nextInt();
		System.out.println(year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");

		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:yue=31;break;
			case 4:
			case 6:
			case 9:
			case 11:yue=30;break;
			case 2:
				if(year%4==0&&year%100!=0||year%400==0)
					yue=29;
				else
					yue=28;
		}
		while((--month)>0)
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:day=day+31;break;

			case 4:	
			case 6:
			case 9:
                	case 11:day=day+30;break;

			case 2:
				if(year%4==0&&year%100!=0||year%400==0)
					day=day+29;
				else
					day=day+28;
		}
		for(i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0)
				day=day+366;
			else
				day=day+365;
		}

		switch(day%7){
			case 0:t=0;break;
			case 1:t=1;break;
			case 2:t=2;break;
			case 3:t=3;break;
			case 4:t=4;break;
			case 5:t=5;break;
			case 6:t=6; 
		}
		
		day=1;
		for(i=0;i<yue+t;i++){
			if(i<t)
				System.out.print(" \t");
			else
				System.out.print((day++)+"\t");
			if((i+1)%7==0)
				System.out.println("\n");
			
		}	
		System.out.println("\n");

	}
}