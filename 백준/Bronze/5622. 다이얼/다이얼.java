import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// switch문은 가독성이 좋지만 코드가 너무 길어진다.
	// 배열을 사용하면 비교적 코드가 짧아지며, 모든 문자를 비교할 필요없이 인덱스로 해당 값을 바로 조회할 수 있다.
	// 아래 코드는 알파벳별로 걸리는 시간을 정의한 배열을 사용하여, 아스키코드로 해당 배열인덱스를 구해봤다.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dial = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };
		int sum = 0;
		String word = br.readLine();

		for (int i = 0; i < word.length(); i++) {
			sum += dial[word.charAt(i) - 65];
		}

		System.out.println(sum);

		br.close();
	}
}