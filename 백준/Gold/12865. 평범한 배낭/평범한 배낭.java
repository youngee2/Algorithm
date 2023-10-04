import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 물품의 수 n
		int k = Integer.parseInt(st.nextToken()); // 준서가 버틸 수 있는 무게 k

		int[] w = new int[n + 1];
		int[] v = new int[n + 1];
		int[] dp = new int[k + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken()); // 물건의 무게
			v[i] = Integer.parseInt(st.nextToken()); // 물건의 가치
		}

		for (int i = 1; i <= n; i++) {
			for (int j = k; j >= w[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
			}
		}
		System.out.println(dp[k]);
		br.close();
	}
}