import java.util.Scanner;

public class SubarrayWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("target: ");
        int target = sc.nextInt();

        int l = 0, curSum = 0;
        boolean found = false;

        for(int r = 0; r < n; r++){
            curSum += arr[r];
            while(curSum > target && l <= r) curSum -= arr[l++];
            if(curSum == target){
                System.out.println("Yes (" + l + " to " + r + ")");
                found = true;
                break;
            }
        }

        if(!found) System.out.println("No");
        sc.close();
    }
}
