package basic_program;

import java.util.Scanner;

public class fibonacci_series {
	public void fibo()
	{
		int a=1,b=1;
		int c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter limit value:");
		d=sc.nextInt();
		
		System.out.print(a+" "+b);
		for(int i=1;i<=d;i++)
		{
		
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			
		}
	}
public static void main(String args[])
{
	fibonacci_series obj=new fibonacci_series();
	obj.fibo();
}
}
