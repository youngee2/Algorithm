import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 입력받을 수의 개수
		int[] list = new int[n]; // 입력받은 수를 저장할 배열
		while (n-- > 0) { // 입력받을 수의 개수를 하나씩 줄여가면서 수를 입력받음.
			list[n] = Integer.parseInt(br.readLine()); //입력받은 수를 배열에 저장.
		}

		Arrays.sort(list); // 배열 오름차순 정렬.
		for (int i = 0; i < list.length; i++) { //StringBuilder append로 문자 결합.
			sb.append(list[i]).append('\n');
		}
		System.out.println(sb); //결합한 문자들을 출력.
		br.close();
	}
}