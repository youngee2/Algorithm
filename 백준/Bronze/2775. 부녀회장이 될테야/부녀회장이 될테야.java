import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int i = 0; i < tc; i++) {
			int k = Integer.parseInt(br.readLine()); // 층수
			int n = Integer.parseInt(br.readLine()); // 호수
			int[][] arr = new int[k + 1][n + 1];
			for (int m = 1; m < n + 1; m++) {
				arr[0][m] = m;
			}

			for (int j = 1; j <= k; j++) { // 1층부터 k층까지
				for (int p = 1; p <= n; p++) { // 1호부터 n호까지
					arr[j][p] = arr[j][p - 1] + arr[j - 1][p];
				}
			}
			sb.append(arr[k][n]).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}