import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[] answer(String str) {
		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();// a 문자열 대입
		String b = br.readLine();// b 문자열 대입
		int count = 0, c2 = 0;
		int[] arr = answer(a);
		int[] arr1 = answer(b);

		// 이제 비교를 하여 카운트하면 됨.
		// 26번을 반복하는데 c2 변수에 arr 배열의 해당 인덱스 값에서 arr1 배열의 해당 인덱스 값을 뺀 후 절대값으로 저장한다.
		// count++하면 되는데 Math.abs(arr[i]-arr1[i])를 한 이유는 문자열에 해당 알파벳이 하나가 아니라 여러 개 일 수
		for (int i = 0; i < 26; i++) {
			count += Math.abs(arr[i] - arr1[i]);
		}
		br.close();
		System.out.println(count);
	}
}