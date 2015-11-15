package google.leet;

/**
 * Created by ann on 10/31/15.
 */
public class paintFence {
//    There is a fence with n posts, each post can be painted with one of the k colors.
//
//    You have to paint all the posts such that no more than two adjacent fence posts have the same color.
//
//    Return the total number of ways you can paint the fence.

    public static int numWays(int n, int k) {
        // 1 2   3 4 5 6 7 8 ----- n
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return k * k;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = k;
        dp[2] = k * k;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] * (k - 1) + dp[i - 2] * (k - 1);
            System.out.println(dp[i]);
        }
        return dp[n];

    }
    public static void main(String [ ] args) {
        System.out.println(numWays(6, 3));
    }
}
