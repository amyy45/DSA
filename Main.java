import java.util.*;
public class Main {

    // Recursive function
    static long f(int index, long sum_b, long[] arr, int n, long tot_sum) {
        if (index == n) {
            long sum_c = tot_sum - sum_b;
            return Math.abs(sum_b * sum_b - sum_c * sum_c);
        }

        long res1 = f(index + 1, sum_b + arr[index], arr, n, tot_sum);
        long res2 = f(index + 1, sum_b, arr, n, tot_sum);

        return Math.min(res1, res2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long tot_sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                tot_sum += arr[i];
            }

            System.out.println(f(0, 0, arr, n, tot_sum));
        }

        sc.close();
    }
}

