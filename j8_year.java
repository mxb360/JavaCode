import java.util.Scanner;
public class j8_year{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int year,month,month0,day,day0,i,sum=0;
		String week="";
		System.out.println("*****计算1900年1月1到目标日期的天数******");
		System.out.println("请输入日期，如：2016 11 27");
		year=in.nextInt();
		month0=month=in.nextInt();
		day0=day=in.nextInt();



		while((--month)>0)
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day=day+31;
				break;
			case 4:	
			case 6:
			case 9:
                	case 11:
				day=day+30;
				break;
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
			case 0:week="星期日";break;
			case 1:week="星期一";break;
			case 2:week="星期二";break;
			case 3:week="星期三";break;
			case 4:week="星期四";break;
			case 5:week="星期五";break;
			case 6:week="星期六";
		}
		day--;
		System.out.println(year+"年"+month0+"月"+day0+"日\t"+week+"\n距1900年1月1日 "+day+"天");
	}
}