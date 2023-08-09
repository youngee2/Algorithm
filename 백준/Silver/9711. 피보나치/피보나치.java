import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 피보나치 개수
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			long f0 = 0, f1 = 1, f = 0;
			if (p < 2) { // 피보나치가 1이면 1. 2번째도 1이기 때문에 2이하의 수는 1를 반환.
				f = f1 % q;
			} else {
				for (int j = 2; j <= p; j++) {
					f = (f0 + f1) % q;
					f0 = f1;
					f1 = f;
				}
			}
			sb.append("Case #" + (i + 1) + ": " + f).append("\n");
		}
		System.out.println(sb.toString());
	}
}