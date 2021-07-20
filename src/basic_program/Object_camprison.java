package basic_program;

public class Object_camprison {
	public void func()
	{
		String s="priya";
		String s1="priya";
		

	//	System.out.println(s.equals(s1));
	//	System.out.println(s==s1);
	}
	
	
	
	public void func1()
	{
		String s=new String("priyaa");
		String s1=new String("priya");
		String s3=new String("priya");
		

		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s.compareTo(s1));
		System.out.println(s.hashCode());
		
	}
	
	
	
public static void main(String a[])
{
	Object_camprison obj=new Object_camprison();
	obj.func();
	obj.func1();
}
		
}
