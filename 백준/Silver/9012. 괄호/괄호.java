import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static String solution(String s) {
		Stack<Character> stack = new Stack<>();
		String answer = "YES";
		for (char x : s.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			} else if (stack.isEmpty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		if (!stack.isEmpty())
			return "NO";
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str = "";
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			System.out.println(Main.solution(str));
		}
		br.close();
	}
}