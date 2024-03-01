package semester1;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i<m; i++) {
            a[i] = sc.nextInt();
        }
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if (a[j] > 0) {
                    sum += a[j];
                    a[j]--;
                }
            }
            max += sum * i;
            int curMin = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                while (a[j] > 0) {
                    sum--;
                    a[j]--;
                }
                curMin = Math.min(curMin, sum * (n - i - 1));
                while (a[j] < m) {
                    sum++;
                    a[j]++;
                }
            }
            min += curMin;
            for (int j = 0; j < m; j++) {
                while (a[j] < m) {
                    sum++;
                    a[j]++;
                }
            }
        }
        System.out.println(min + " " + max);
    }
}