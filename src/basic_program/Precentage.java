package basic_program;
import java.util.Scanner;
public class Precentage {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b;
        double perc;
        System.out.println("Enter value: ");
        a=sc.nextDouble();
        System.out.println("Out of: ");
        b=sc.nextDouble();
        sc.close();
        perc=((a/b)*100);
        System.out.println(a+" is " +perc+ " percent of " +b);
    }
}