public class CommonSubsequence {

    public static void main(String[] args) {

        String text1 = "bond";
        String text2 = "bond";
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: " + longestCommonSubsequence(text1, text2));
        System.out.println();

    }

    public static int longestCommonSubsequence(String text1, String text2){
        char[] A = text1.toCharArray();
        char[] B = text2.toCharArray();

        int m = A.length;
        int n = B.length;

        int [][] dp = new int[m +1][n +1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    if (dp[i - 1][j] > dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                }

            }
        }

        return dp[m][n];
    }

}
