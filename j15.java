import java.util.Scanner;
public class j15{
	public static void main(String[] args){
		Scanner inn=new Scanner(System.in);
		Fun nn=new Fun();
		int n,result=0;

		System.out.println("please input a number:");
		n=inn.nextInt();
		for(int i=1;i<=n;i++)
			result+=nn.fun(i);
		System.out.println(result);	
	}
}

class Fun{
	 int n;
	 private int fun2(int n){
		if(n==1||n==2)
			return 1;
		else
			return fun2(n-1)+fun2(n-2);	
	}
	int fun(int n){
		return fun2(n);
	}
}


/*

#include <stdio.h>
int main(){
	int n,result=0;
	int fun(int);

	printf("please input a number:\n");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
		result+=fun(i);
	printf("%d\n",result);
	return 0;
}
int fun(int n){
	if(n==1||n==2)
		return 1;
	else
		return fun(n-1)+fun(n-2);
}
 
*/