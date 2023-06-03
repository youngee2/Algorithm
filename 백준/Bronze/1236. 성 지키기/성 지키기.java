import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken()); // 세로
		int w = Integer.parseInt(st.nextToken()); // 가로
		String[] arr = new String[h]; // 성의 상태 저장할 배열

		for (int i = 0; i < h; i++) {
			arr[i] = br.readLine(); // 성의 상태를 배열에 저장.
		}
		int rowcnt = 0, colcnt = 0;

		for (int i = 0; i < h; i++) { // 세로라인에 X(경비원)이 있는지 확인. 없으면 rowcnt+1
			if (!arr[i].contains("X")) {
				rowcnt++;
			}
		}

		for (int i = 0; i < w; i++) {
			// 가로라인마다 확인한다. 'X'가 발견되는 경우 tf 상태를 true로 변경 후 다음 줄로 이동하는데, 이동하기 전 tf 상태값이
			// false인 경우(X가 발견되지 않은 경우) 조건문에서 colcnt+1을 해준다.
			boolean tf = false;
			for (int j = 0; j < h; j++) {
				if (arr[j].charAt(i) == 'X') {
					tf = true;
					break;
				}
			}
			if (!tf)
				colcnt++;
		}

		System.out.println(colcnt > rowcnt ? colcnt : rowcnt);
		br.close();
	}
}