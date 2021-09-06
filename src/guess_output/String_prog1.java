package guess_output;

import java.util.ArrayList;

public class String_prog1 {
	
        public static void main(String args[]) 
        {
            ArrayList obj = new ArrayList();
            obj.add("A");
            obj.add("D");
            obj.ensureCapacity(3);
            obj.trimToSize();
            System.out.println(obj.size());
            
            
            
            ArrayList bj = new ArrayList();
            bj.add("A");
            bj.add(0, "B");
            System.out.println(bj.size());
            
            
            ArrayList ob = new ArrayList();
            ob.add("A");
            ob.add("B");
            ob.add("C");
            ob.add(1, "D");
            System.out.println(ob);
         }      
    
}
