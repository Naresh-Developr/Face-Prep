import java.util.*;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println(arr[0]);f
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        sc.close();
    }
}
