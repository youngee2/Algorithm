import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 설탕 무게
		int fiveCount = n / 5;
		int threeCount = 0;
		while (fiveCount >= 0) {
			if ((n - (fiveCount * 5)) % 3 == 0) {
				threeCount = (n - (fiveCount * 5)) / 3;
				break;
			}
			fiveCount--;
		}

		System.out.println(fiveCount >= 0 ? fiveCount + threeCount : -1);

		br.close();
	}
}