import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // TestCase
		int count = 0;
		int n, m = 0;
		while (t-- > 0) {// TestCase 만큼 반복
			count = 0;
			n = 0;
			m = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			for (int j = n; j <= m; j++) {
				String numb = Integer.toString(j);
				for (int k = 0; k < numb.length(); k++) {
					count += numb.charAt(k) == '0' ? 1 : 0;
				}
			}
			sb.append(count).append("\n");
		}

		System.out.println(sb.toString());
		br.close();
	}
}