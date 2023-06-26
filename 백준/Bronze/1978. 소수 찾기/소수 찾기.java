import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(st.nextToken());
			if (m == 1)
				continue;
			boolean isNum = true;
			for (int j = 2; j * j <= m; j++) {
				if (m % j == 0) {
					isNum = false;
					break;
				}
			}
			if (isNum)
				count++;
		}
		System.out.println(count);
		br.close();
	}
}