package guess_output;

public class Array_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	       	    int array_variable [] = new int[10];
		    for (int i = 0; i < 10; ++i) {
		    	System.out.println(i+" up");
		    
	                array_variable[i] = i/2;
	                array_variable[i]++;
	                System.out.println(array_variable[i] + " arr  ");
	                i++;
	                System.out.println(i+" down  ");
	            }
	

}}
