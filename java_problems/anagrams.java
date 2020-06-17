package java_problems;

import java.util.*;

public class anagrams {

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()) return false;
        int first[] = new int[26], second[] = new int[26];
        a = a.toUpperCase();
        b = b.toUpperCase();

        for(int i = 0; i < a.length(); i++) {
            first[a.charAt(i) - 'A']++;
            second[b.charAt(i) - 'A']++;
        }

        for(int i = 0; i < 26; i++) if(first[i] != second[i]) return false;

        return true;
    }
}