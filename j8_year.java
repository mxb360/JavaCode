import java.util.Scanner;
public class j8_year{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int year,month,month0,day,day0,i,sum=0;
		String week="";
		System.out.println("*****����1900��1��1��Ŀ�����ڵ�����******");
		System.out.println("���������ڣ��磺2016 11 27");
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
			case 0:week="������";break;
			case 1:week="����һ";break;
			case 2:week="���ڶ�";break;
			case 3:week="������";break;
			case 4:week="������";break;
			case 5:week="������";break;
			case 6:week="������";
		}
		day--;
		System.out.println(year+"��"+month0+"��"+day0+"��\t"+week+"\n��1900��1��1�� "+day+"��");
	}
}