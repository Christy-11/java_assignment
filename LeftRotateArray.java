import java.util.Scanner;

public class LeftRotateArray {

    static void rev(int[] a, int l, int r){
        while(l < r){
            int t = a[l]; a[l] = a[r]; a[r] = t;
            l++; r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("k: ");
        int k = sc.nextInt() % n;

        rev(arr, 0, k-1);
        rev(arr, k, n-1);
        rev(arr, 0, n-1);

        for(int x : arr) System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}
