import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 자연수 n
		int sum=0;
		for (int i = 1; i < n; i++) {
			sum = i;
			int m = i;

			while (m != 0) {
				sum += m % 10; // 각 자리수 더함
				m /= 10; // 다음 자리수
			}
			if (sum == n) { // 부분합과 n이 같은 경우 종료.
				System.out.println(i);
				break;
			}
		}
		if(sum!=n) {
			System.out.println(0);
		}
		br.close();
	}
}