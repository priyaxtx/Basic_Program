package basic_program;

import java.util.Scanner;

public class addition_series {
	int a,b,c,d;
	
	
	public void addition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
	a= sc.nextInt();
	b= sc.nextInt();
	System.out.println("Enter limit number");
	d= sc.nextInt();
		c=a+b;
    System.out.println(a+"+"+b+"="+c);
    int i=1;
	while(i!=d)
    {
a=c;
b=c;
c=a+b;

System.out.println(a+"+"+b+"="+c);
i++;

	
    }
	}
public static void main( String arg[])
{
	addition_series obj=new addition_series();
	obj.addition();
}
}
