import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = 0, b = 0, c = 0;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if (a != 0 || b != 0 || c != 0) {
				sb.append(Main.angle(a, b, c)).append("\n");
			} else {
				break;
			}
		}
		System.out.println(sb.toString());
	}

	static String angle(int a, int b, int c) {
		int max = Math.max(Math.max(a, b), c);
		if (c == max && (c * c) == ((a * a) + (b * b))) {
			return "right";
		} else if (b == max && (b * b) == ((c * c) + (a * a))) {
			return "right";
		} else if (a == max && (a * a) == ((c * c) + (b * b))) {
			return "right";
		} else {
			return "wrong";
		}
	}
}