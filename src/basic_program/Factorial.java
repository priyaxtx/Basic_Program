package basic_program;

import java.util.Scanner;

public class Factorial {
public static void main(String a[])
{
	int number,sum=1;
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
			number=sc.nextInt();
	for(int i=1;i<=number;i++)
	{
		 sum=i*sum;
	}
	System.out.println("the factorial of the number is:"+sum);
}
}
