package String_problem;
import java.util.*;
public class Find_String_Is_palidrome {
public static void main(String a[])
{
	
    String word,Reverse= " " ;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter a string");
     word=Sc.nextLine();
   
  int  n= word.length();
	for(int i=n-1;i>=0;i--)
	{
	Reverse=Reverse+word.charAt(i);

			}
	System.out.println(word);
	System.out.println(Reverse);
		if(word.equals(Reverse))
		System.out.println("the Sring is Palidrome");
		else
		
			System.out.println("not palidrome");
		




	/*	String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
*/

}
}
