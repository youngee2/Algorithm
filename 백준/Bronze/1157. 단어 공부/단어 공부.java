import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] arr = new int[26];
		char en = '?';
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'A']++;
		}
		for (int i = 0; i < 26; i++) {
			if (max < arr[i]) {
				max = arr[i];
				en = (char) (i + 65);
			} else if (max == arr[i]) {
				en = '?';
			}
		}
		System.out.println(en);
	}
}