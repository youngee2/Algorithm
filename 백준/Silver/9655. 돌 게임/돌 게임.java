import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String answer = "SK";
		if (n % 2 == 0) {
			// 2를 생각해보면 상근 1개, 창영이는 마지막 돌을 가져간다.
			// 3을 예로 들어보면 상근 1개, 창영 1개, 상근이가 마지막 돌을 가져간다.
			// 4를 생각해보면 상근 3개, 창영이가 마지막 돌을 가져간다.
			// 4를 다르게 생각해보면 상근 1개, 창영 3개
			// 또 다르게 생각하면 상근1, 창영 1, 상근1, 창영 1.
			// 이를 통해 2의 배수는 창영이가 이긴다.
			answer = "CY";
		}
		System.out.println(answer);
	}
}