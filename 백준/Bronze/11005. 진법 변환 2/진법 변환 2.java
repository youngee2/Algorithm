import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); // 정수
		int b = Integer.parseInt(st.nextToken()); // 변환할 진법

		String str = Integer.toString(x, b); // 입력받은 정수를 b진법으로 변환한 후 str에 저장
		if (b > 10) { //만약 10진법보다 크다면 대문자로 변환하여 출력.
			System.out.println(str.toUpperCase());
		} else {
			System.out.println(str);
		}
		br.close();
	}
}