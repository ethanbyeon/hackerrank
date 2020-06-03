package java;
import java.util.*;

public class eof {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int count = 1;
        while(in.hasNext()) {
            String line = in.nextLine();
            System.out.println(count + " " + line);
            count++;
        }
        
        in.close();
    }
}