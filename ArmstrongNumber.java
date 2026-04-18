import java.util.Scanner;

public class ArmstrongNumber {

    static int pow(int a, int b){
        int p = 1;
        for(int i = 0; i < b; i++) p *= a;
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        int temp = n, digits = 0;
        while(temp > 0){ digits++; temp /= 10; }

        temp = n;
        int s = 0;
        while(temp > 0){
            s += pow(temp % 10, digits);
            temp /= 10;
        }

        if(s == n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

        in.close();
    }
}
