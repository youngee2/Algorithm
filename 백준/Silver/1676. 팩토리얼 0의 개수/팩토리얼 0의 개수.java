import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = n; i > 1; i--) {
			if (n >= 5) {
				count += n / 5;
				n /= 5;
			} else {
				break;
			}
		}
		System.out.println(count);
		br.close();
	}
}