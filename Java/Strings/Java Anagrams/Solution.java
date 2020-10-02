import java.util.*;

public class Solution {

    static int no = 256;
    static boolean isAnagram(String a, String b) {
        // Complete the function
       
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        char [] A = a1.toCharArray();
        char [] B = b1.toCharArray();
        int count1[] = new int[no];
        int count2[] = new int[no];
        for(int c=0; c< no; c++){
            count1[c] = 0;
            count2[c] = 0;
        } 
        for(int i = 0;i< A.length && i < B.length;i++){
            count1[A[i]]++;
            count2[B[i]]++;
        }
        if(A.length != B.length)
            return false;
        for(int i = 0;i< no;i++){
            if(count1[i] != count2[i])
                return false;
        }
        return true;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
