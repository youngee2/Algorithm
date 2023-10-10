import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // n입력
		long[] dp = new long[n + 2];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			int s=1;
			for (int j = 0; j < i; j++) {
				dp[i] += dp[j] * dp[i - s];
				s++;
			}
		}
		System.out.println(dp[n]);

		br.close();
	}
}