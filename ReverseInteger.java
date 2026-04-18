import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        long rev = 0;
        int num = n;
        if(num < 0) num = -num;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if(n < 0) rev = -rev;

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            System.out.println(0);
        } else {
            System.out.println(rev);
        }
        sc.close();
    }
}
