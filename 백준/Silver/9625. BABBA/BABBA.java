import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][] arrCount = new int[n + 1][2];
		arrCount[0][0] = 1;
		arrCount[0][1] = 0;

		for (int i = 1; i <= n; i++) {
			arrCount[i][0] = arrCount[i - 1][1]; // A의 값은 전 단계 B와 같다.
			arrCount[i][1] = arrCount[i - 1][0] + arrCount[i - 1][1]; // B의 값은 전 단계 A와 B를 더한 값과 같다.
		}

		System.out.println(arrCount[n][0] + " " + arrCount[n][1]);

		br.close();
	}
}