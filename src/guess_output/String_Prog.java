package guess_output;

public class String_Prog {
	
        public static void main(String args[])
        { 
           String c = "Hello i love java";
           int start = 2;
           int end = 9;
           char s[]=new char[end-start];//blank space will be counted
           c.getChars(start,end,s,0);//end-1 chars will be fetch so till l the chars are fetch
           System.out.println(s);//llo i l
           System.out.println(c.charAt(5));//o
           System.out.println( c.charAt(start));//l
          // System.out.println( c.charAt(s));
        }
    
}
