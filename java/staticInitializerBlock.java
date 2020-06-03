package java;
import java.util.*;

public class staticInitializerBlock {
    
    static boolean flag = true;
    static int B, H;

    static {
        
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        in.close();

        if(B > 0 && H > 0) {
            flag = false;
        }else if((B <= 0 && H >= 0) || (B >= 0 && H > 0)) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) { }
}