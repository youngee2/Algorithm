import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 테스트 케이스의 개수
		int k = Integer.parseInt(st.nextToken()); // 목표 금액
		int answer = 0; // k원을 만드는데 필요한 동전 개수
		int m = n - 1;
		int[] coin = new int[n]; // 동전의 가치

		for (int i = 0; i < n; i++) { // 동전들의 가치를 저장
			coin[i] = Integer.parseInt(br.readLine());
		}
		while (k > 0) {
			if (k >= coin[m]) { // 목표 금액보다 동전의 가치가 같거나 작을 경우
				k -= coin[m]; // 해당 동전의 가치만큼 빼고 카운트+1.
				answer++;
			} else { //목표금액이 해당 동전의 가치보다 클 경우 다음 동전 비교를 위해 카운트 -1
				m--;
			}
		}
		System.out.println(answer); //k원을 만드는데 필요한 동전 개수 출력
		br.close();
	}
}