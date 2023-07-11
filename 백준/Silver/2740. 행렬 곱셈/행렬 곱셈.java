import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 행렬 A의 크기 n (y축)
		int m = Integer.parseInt(st.nextToken()); // 행렬 A의 크기 m (x축)
		int[][] arrA = new int[n][m];

		// 행렬 A 원소 저장
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arrA[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken()); // 행렬 B의 크기 h (y축)
		int k = Integer.parseInt(st.nextToken()); // 행렬 B의 크기 k (x축)
		int[][] arrB = new int[h][k];

		// 행렬 B 원소 저장
		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < k; j++) {
				arrB[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 행렬 A와 B를 곱한 행렬 저장
		int[][] answer = new int[n][k];

		for (int i = 0; i < n; i++) { // 행렬 A의 x축
			for (int j = 0; j < k; j++) { // 행렬 B의 x축
				answer[i][j] = 0;
				for (int p = 0; p < h; p++) { // 행렬 B의 y축
					answer[i][j] += arrA[i][p] * arrB[p][j];
				}
			}
		}

		//출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
		
		br.close();
	}
}