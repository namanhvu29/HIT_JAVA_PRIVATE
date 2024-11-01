import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] a = new int[n + 1];
        int[] prefixSum = new int[n + 1];
        
        prefixSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        while (k <= n) {
            for (int i = 0; i <= n - k; i++) {
                int currentSum = prefixSum[i + k] - prefixSum[i];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
            k++;
        }
        System.out.println(maxSum);
        scanner.close();
    }
}
