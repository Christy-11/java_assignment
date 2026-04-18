import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int maxR = a[n-1];
        int[] res = new int[n];
        int k = 0;
        res[k++] = a[n-1];

        for(int i = n-2; i >= 0; i--){
            if(a[i] > maxR){
                res[k++] = a[i];
                maxR = a[i];
            }
        }

        System.out.print("Leaders: ");
        for(int i = k-1; i >= 0; i--) System.out.print(res[i] + " ");
        System.out.println();
        sc.close();
    }
}
