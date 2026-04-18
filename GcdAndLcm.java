import java.util.Scanner;

public class GcdAndLcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        int x = a, y = b;
        while(y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
