import java.util.Scanner;

/**
 * Created by ZacksSun on 24/02/2018.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int d = scan.nextInt();
        long[][] max = new long[k][n];
        long[][] min = new long[k][n];
        for (int i = 0; i < k; i++)
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    min[i][j] = nums[j];
                    max[i][j] = nums[j];
                    //初始化0行矩阵为所输入数据
                }
            }

        for (int i = 1; i < k; i++)
            for (int j = i; j < n; j++)
                for (int m = 1; m <= d && j - m >= 0; m++) {

                    if (nums[j] > 0) {
                        min[i][j] = Math.min(min[i][j], min[i - 1][j - m] * nums[j]);
                        max[i][j] = Math.max(max[i][j], max[i - 1][j - m] * nums[j]);
                    } else {
                        min[i][j] = Math.min(min[i][j], max[i - 1][j - m] * nums[j]);
                        max[i][j] = Math.max(max[i][j], min[i - 1][j - m] * nums[j]);
                    }

                }
        for (int i = 0; i < k; i++)
            for (int j = 0; j < n; j++) {
                System.out.println(" ! " +min[i][j]);
                System.out.println(" @ " +max[i][j]);
            }
        long Max = 0;
        for (int i = 0; i < n; i++)
            Max = Math.max(Max, max[k - 1][i]);
        System.out.println(Max);

    }
}
