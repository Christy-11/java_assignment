import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String s = sc.next();

        String out = "";
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            int cnt = 1;
            while(i + cnt < s.length() && s.charAt(i + cnt) == ch) cnt++;
            out += ch + "" + cnt;
            i += cnt;
        }

        System.out.println(out);
        sc.close();
    }
}
