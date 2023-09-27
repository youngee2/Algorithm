import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

		while (n-- > 0) {
			int t = 1;

			int g = Integer.parseInt(br.readLine());
			arr = new int[g];
			for (int i = 0; i < g; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			while (true) {
				HashSet<Integer> set = new HashSet<>();
				boolean unique = true;

				for (int i = 0; i < g; i++) {
					if (!set.add(arr[i] % t)) {
						unique = false;
						break;
					}
				}
				if (unique) {
					break;
				}
				t++;
			}
			System.out.println(t);
		}
	}
}
