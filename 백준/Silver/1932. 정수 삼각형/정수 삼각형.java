import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// 이 문제는 바텀업방식으로 풀이함.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n][n];
		int[][] arr = new int[n][n];

		arr[0][0] = Integer.parseInt(br.readLine());
		for (int i = 1; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				if (st.hasMoreTokens()) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		dp[0][0] = arr[0][0];
		int max = dp[0][0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					dp[i][j] = dp[i - 1][j] + arr[i][j];
				} else if (j == i) {
					dp[i][j] = dp[i - 1][j - 1] + arr[i][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
				}
				max = Math.max(dp[i][j], max);
			}
		}

		System.out.println(max);

		br.close();
	}
}