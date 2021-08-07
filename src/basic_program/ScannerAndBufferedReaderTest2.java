package basic_program;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class ScannerAndBufferedReaderTest2  {
public static void main(String[] args) throws IOException {
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int in1 = sc.nextInt();
       // sc.close(); // <-- If I erase this part, there will be no error.
        
        System.out.println("Your number : " + in1);
        
        
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("Enter number: ");
        bw.flush();
        int in2 = Integer.parseInt(br.readLine());
        br.close();
        
        bw.write("Your number : " + String.valueOf(in2));
        bw.flush();
        bw.close();
        
    }
}

