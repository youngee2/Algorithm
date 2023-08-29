class Solution {
    public int solution(int[][] triangle) {
        int arrLength = triangle.length;
		int[][] dp = new int[arrLength][arrLength];

		// 초기 값 설정
		dp[0][0] = triangle[0][0];

		for (int i = 1; i < arrLength; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				if (j == 0) {
					dp[i][0] = dp[i - 1][0] + triangle[i][0];
				} else if (j == triangle[i].length) {
					dp[i][j] = dp[i - 1][j] + triangle[i][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
				}
			}
		}
		int max = 0;
		for (int i = 0; i < arrLength; i++) {
			max = Math.max(max, dp[arrLength - 1][i]);
		}
        return max;
    }
}