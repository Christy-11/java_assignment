import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int expected = (n-1) * n / 2;
        int actual = 0;
        for(int x : arr) actual += x;

        System.out.println("Duplicate: " + (actual - expected));
        sc.close();
    }
}
