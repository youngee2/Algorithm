import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String nameA = br.readLine();
		String nameB = br.readLine();

		int[] Alphabet = { 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };
		for (int i = 0; i < nameA.length(); i++) {
			sb.append((Alphabet[nameA.charAt(i) - 65] + ""));
			sb.append((Alphabet[nameB.charAt(i) - 65] + ""));
		}
		while (sb.length() != 2) {
			String[] list = sb.toString().split("");
			sb.setLength(0);
			for (int i = 1; i < list.length; i++) {
				int n = Integer.parseInt(list[i - 1]) + Integer.parseInt(list[i]);
				if (n >= 10) {
					sb.append(Integer.toString(n % 10));
				} else {
					sb.append(Integer.toString(n));
				}
			}
		}
		System.out.println(sb.toString());
	}
}