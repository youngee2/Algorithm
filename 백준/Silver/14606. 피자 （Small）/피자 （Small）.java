import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 피자판의 개수
		int[] dp = new int[n + 1]; // 점화식을 활용하여 구한 값을 저장하기 위한 배열 생성
		dp[1] = 0;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + (i - 1);
		}
		System.out.println(dp[n]);
		br.close();
	}
}