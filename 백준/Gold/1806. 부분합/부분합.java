import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()); // 수열 길이
		int s = Integer.parseInt(st.nextToken()); // 합이 되야하는 수

		int[] arr = new int[k];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int left = 0, right = 0, sum = 0, len = Integer.MAX_VALUE;

		while (true) {
			if (sum >= s) {
				len = Math.min(len, right - left);
				sum -= arr[left++];
			} else if (right == k) {
				break;
			} else {
				sum += arr[right++];
			}
		}

		if (len == Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(len);
		}
	}
}
