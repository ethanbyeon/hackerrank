package java_problems;

import java.util.*;

public class isPalindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        int count = 0;
        for(int i = 0; i < A.length() / 2; i++) {
            if(A.charAt(i) == A.charAt(A.length() - i - 1)) count++;
        }
        System.out.println((count == A.length() / 2) ? "Yes" : "No");
    }
}