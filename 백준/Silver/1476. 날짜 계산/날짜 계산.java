import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder answer = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int e = Integer.parseInt(st.nextToken()); // 지구
		int s = Integer.parseInt(st.nextToken()); // 태양
		int m = Integer.parseInt(st.nextToken()); // 달

		int e2 = 1, s2 = 1, m2 = 1;
		// break 만날때까지 반복하면서 y증가
		for (int y = 1;; y++) {
			if (e == e2 && s == s2 && m == m2) { // 증가시키면서 지구,태양,달 모두 입력값과 일치할때 종료.
				System.out.println(y);
				break;
			}
			e2++;
			s2++;
			m2++;

			// 범위를 벗어날 시 1
			if (e2 == 16)
				e2 = 1;
			if (s2 == 29)
				s2 = 1;
			if (m2 == 20)
				m2 = 1;
		}
		br.close();
	}
}