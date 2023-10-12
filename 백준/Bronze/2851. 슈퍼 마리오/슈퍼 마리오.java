import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int nextsum = 0;
		int num = 0;
		for (int i = 0; i < 10; i++) {
			num = Integer.parseInt(br.readLine());
			if (sum + num <= 100) {
				sum += num;
				nextsum=sum;
			} else {
				nextsum+= num;
				break;
			}
		}

		if (100 - sum < nextsum - 100) {
			System.out.println(sum);
		} else {
			System.out.println(nextsum);
		}

		br.close();
	}
}