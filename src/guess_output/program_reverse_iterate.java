package guess_output;

public class program_reverse_iterate {
	public void output() {
        
            double a, b,c;
            a = 3.0/0; //Infinity
            b = 0/4.0; //0.0
            c=0/0.0; //NaN
 //EXPLANATION
            /* For floating point literals,
             *  we have constant value to represent (10/0.0) 
             *  infinity either positive or negative 
             *  and also have NaN 
             *  (not a number for undefined like 0/0.0),
             *   but for the integral type,
             *    we don’t have any constant that’s why 
             *    we get an arithmetic exception.
             */
	    System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } 
    
public static void main(String ar[])
{
	program_reverse_iterate obj=new program_reverse_iterate();
	obj.output();//we have two concept in one class 
	        
	            double num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
	            double result;
	            result = 0;
	            for (int i = 0; i < 6; ++i) {
	                result = result + num[i];
	              //  System.out.println(i);
	            }
		    System.out.print(result/6);
	 
	        } 
	  	

}
