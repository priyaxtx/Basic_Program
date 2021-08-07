package String_problem;
import java.util.Scanner;
public class Count_Palidrome_Word {
	public  boolean check_Every_Single_Word_func(String word_temp)
	{
		
		int word_temps_length=word_temp.length();
		for(int i=0;i<=word_temps_length;i++,word_temps_length--)
		{
			if(word_temp.charAt(word_temps_length-1)!=(word_temp.charAt(i)))
				return false;
		}
		return true;
		}
	
	
	
	public  void Taking_String_from_User()
	{
		int count=0;
		String str=" ";
		String word,word_temp=" ";
		int i=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the sentence to check the number of words are palidrome: ");
		word=sc.nextLine();
		int length_of_word=word.length();
		for( i=length_of_word-1;i>=0;i++)
		{
			 str=str+word.charAt(i);
			
			
		if(str!=" ")
		{
			word_temp=word_temp+word.charAt(i);
			
		}
		else 
			if(check_Every_Single_Word_func(word_temp))
			{
			 	count++;
			 	word=" ";
				}
		}}
	
	
	
public static void main(String a[])
{
	Count_Palidrome_Word obj=new Count_Palidrome_Word();
	obj.Taking_String_from_User();
	//obj.check_Every_Single_Word_func();
	
}
}




