import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			int testCaseNumber = Integer.parseInt(br.readLine());
			int[] dp = new int[testCaseNumber + 1];
			dp[0] = 1;
			dp[1] = 1;
			if (testCaseNumber >= 2) {
				dp[2] = 2;
			}

			if (testCaseNumber >= 3) {
				for (int i = 3; i <= testCaseNumber; i++) {
					dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
				}
			}
			System.out.println(dp[testCaseNumber]);
		}
		br.close();
	}
}