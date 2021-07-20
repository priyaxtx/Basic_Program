package basic_program;

import java.util.Scanner;

public class palidrome {
public static void main(String a[])
{
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int r,sum=0;
	int tempt=number;
	while(tempt>0)
	{
		r=tempt%10;
		sum=(sum*10)+r;
		tempt=tempt/10;
	}
	if(number==sum)
	{
		System.out.println("number is palindrome!!");
	}
	else
	{
		System.out.println("number is not a palindrome!!");
	}
}
}
