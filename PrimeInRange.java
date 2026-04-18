import java.util.Scanner;

public class PrimeInRange {

    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int cnt = 0;
        for(int i = 2; i <= N; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println("Count: " + cnt);
        sc.close();
    }
}
