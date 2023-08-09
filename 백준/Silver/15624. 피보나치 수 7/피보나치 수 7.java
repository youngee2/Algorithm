import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); // n값
		int f = 0, f0 = 0, f1 = 1; // 문제에서 0번째 피보나치 수, 1번째 피보나치수를 정해줬음.
		for (int i = 2; i <= n; i++) {
			f = f0 + f1; // 피보나치 공식은 fn = fn-1 + fn-2이 된다.
			// 반복문이라 계속 i가 1씩 더해지겠지만 예시로 2라고 생각해보자
			// 현재 2번째이고 -1번째인 첫번째와 -2번째인 두번째 수를 더한다.
			f0 = f1;
			// 반복해야하니 f0을 (현재 수-1)번째 수로 초기화하고
			f1 = f;
			// f1 또한 위에서 더한 값으로 초기화를 한다.
		}
		System.out.println(f);
	}
}