import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 카드 개수
		int m = Integer.parseInt(st.nextToken()); // 이 수를 넘지 않아야하면서 가까워야 함.
		int[] arr = new int[n]; // 카드 수 저장
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int t = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k]; // 3개의 수 합

					if (sum == m) {
						System.out.println(sum); // 같다면 제일 큰 수. 종료 가능
						return;
					}

					if (sum < m && t < sum) {
						t = sum;
					}

				}
			}
		}
		System.out.println(t);
		br.close();
	}
}