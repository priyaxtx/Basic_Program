package basic_program;

import java.util.Scanner;

public class Armstrong {
public static void main(String a[])
{
	int num,r,tem,sum=0;
	System.out.println("enter num");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	tem=num;
	while(tem>0)
	{
		r=tem%10;
		sum=sum+r*r*r;
		tem=tem/10;
	}
	System.out.println(sum);
	if(sum==num)
	{
		System.out.println("number is armstrong");
	}
	else
	{
		System.out.println("number is not an armstrong");
	}
}
}
