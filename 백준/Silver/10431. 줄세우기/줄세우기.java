import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int p = Integer.parseInt(br.readLine()); // 테스트 케이스

		int[] tc = new int[p];
		int count = 0;
		int t = 0;

		// 입력받는 부분
		for (int i = 0; i < p; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t = Integer.parseInt(st.nextToken());
			int[] arr = new int[20];

			for (int j = 0; j < 20; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			count = 0; // 카운트 초기화
			// 비교
			for (int j = 0; j < 20; j++) {
				for (int k = j + 1; k < 20; k++) {
					if (arr[j] > arr[k]) {
						count++;
					}
				}
			}
			tc[i] = count;
		}
		//출력
		for (int i = 0; i < p; i++) {
			System.out.println((i + 1) + " " + tc[i]);
		}

		br.close();
	}
}
