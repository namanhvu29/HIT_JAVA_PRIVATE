import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int left = 0, right = n - 1;
        boolean found = false;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == k) {
                System.out.println(mid);
                found = true;
                break;
            } else if (a[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("-1");
        }
    scanner.close();
    }
}
