import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        int t = n, total = 0;
        while(t > 0){
            int d = t % 10;
            int f = 1;
            for(int i = 1; i <= d; i++) f *= i;
            total += f;
            t /= 10;
        }

        System.out.println(total == n ? "Strong" : "Not Strong");
        sc.close();
    }
}
