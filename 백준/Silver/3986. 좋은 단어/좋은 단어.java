import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static int solution(String str) {
		Stack<Character> stack = new Stack<>();
		stack.push(str.charAt(0));
		for (int j = 1; j < str.length(); j++) {
			if (!stack.isEmpty() && stack.peek().equals(str.charAt(j))) {
				stack.pop();
			} else {
				stack.push(str.charAt(j));
			}
		}
		if (stack.empty()) return 1;
		else return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		for (int i = 0; i < n; i++) {
			answer += solution(br.readLine());
		}
		System.out.println(answer);
	}
}