import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] wine = new int[Math.max(3, n + 1)];
		int[] dp = new int[Math.max(3, n + 1)];

		for (int i = 1; i <= n; i++) { // 반복문을 통해 각 잔에 들어있는 포도주의 양을 입력받음.
			wine[i] = Integer.parseInt(br.readLine());
		}

		dp[1] = wine[1];
		dp[2] = dp[1] + wine[2];

		// 현재 잔을 안마실 경우. dp[i-1]
		// 현재 잔만 마시는 경우 dp[i-2]+wine[i]
		// 현재 잔과 바로 전 잔을 마시는 경우. dp[i-3]+wine[i-1]+wine[i]
		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(Math.max(dp[i - 1], dp[i - 2] + wine[i]), dp[i - 3] + wine[i - 1] + wine[i]);
		}

		System.out.println(dp[n]);

		br.close();
	}
}