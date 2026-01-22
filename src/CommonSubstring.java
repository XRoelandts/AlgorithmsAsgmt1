public class CommonSubstring {

    public static void main(String[] args) {
        String s1 = "gears of war";
        String s2 = "History of warriors";


    }

    public static String longestCommonSubstring(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int maxLength = 0;
        int endIndex = 0;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        if (maxLength == 0) {
            return "";
        }

        char[] result = new char[maxLength];
        int startIndex = endIndex - maxLength;
        for (int i = 0; i < maxLength; i++) {
            result[i] = text1.charAt(startIndex + i);
        }

        return new String(result);
    }

}
