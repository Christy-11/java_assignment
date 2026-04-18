import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String s = sc.next();

        int[] last = new int[256];
        for(int i = 0; i < 256; i++) last[i] = -1;

        int start = 0, maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(last[c] >= start) start = last[c] + 1;
            last[c] = i;
            if(i - start + 1 > maxLen) maxLen = i - start + 1;
        }

        System.out.println(maxLen);
        sc.close();
    }
}
