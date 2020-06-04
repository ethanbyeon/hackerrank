package java;

import java.util.*;

public class stringsIntro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        
        System.out.println(A.length() + B.length());

        int compare = A.compareTo(B);
        if(compare < 0) System.out.println("No");
        if(compare > 0) System.out.println("Yes");

        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}