import java.util.*;
public class dice {
    public static int countways(int n, int m, int x) {
        int[][] dp = new int[n + 1][x + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                dp[i][j] = 0;
                for (int k = 1; k <= m; k++) {
                    if (j >= k) {
                        dp[i][j] += dp[i - 1][j - k];
                    }
                }
            }
        }
        return dp[n][x];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(countways(n,m,x));
    }
}


