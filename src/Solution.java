import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0; i<n; i++ ){
            s[i] = sc.next();
        }
        String a = s[n-1];
        for(int i= n-1; i>0; i--)
            s[i] = s[i-1];
        s[0] = a;
        for(String str : s)
            System.out.print(str +" ");
    }
}