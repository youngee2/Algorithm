import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static long solution(long n) {
		long answer = 0, sum = 0;
		for (int i = 1;; i++) {
			if (n < sum) break;
			sum += i;
			answer++;
		}
		return answer - 1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(Main.solution(n));
	}
}