import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static long solution(int n, int k, int[] arr) {
		long sum = 0, answer = 0;
		for (int i = 0; i < k; i++)
			sum += arr[i];
		answer = sum;
		for (int i = k; i < n; i++) {
			sum += arr[i] - arr[i - k];
			answer = Math.max(answer, sum);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		System.out.println(Main.solution(n, k, arr));
	}
}