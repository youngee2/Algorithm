import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());// x값
		int count = 0; // 이어붙인 횟수
		int n = 64; // 막대기
		while (x > 0) {
			if (n > x) {
				n /= 2;
			} else {
				count++;
				x -= n;
			}
		}
		br.close();
		System.out.println(count);
	}
}