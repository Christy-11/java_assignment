import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean[] done = new boolean[n];

        for(int i = 0; i < n; i++){
            if(done[i]) continue;
            int cnt = 1;
            for(int j = i+1; j < n; j++){
                if(arr[j] == arr[i]){
                    cnt++;
                    done[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + cnt);
        }
        sc.close();
    }
}
