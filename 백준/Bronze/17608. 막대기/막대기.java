import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine()); // 막대기의 개수 대입.
		int count = 0;
		int top = 0;
		for (int i = 0; i < n; i++) { // 스택에 데이터 삽입
			stack.push(Integer.parseInt(br.readLine()));
		}

		for (int i = n - 1; i >= 0; i--) { // 마지막 막대기부터 검사.

			if (stack.peek() < stack.get(i) && top < stack.get(i)) {
				// 맨 오른쪽 막대기부터 맨 오른쪽 막대기보다 크고, 제일 큰것 뒤로는 안보이니 비교.
				top = stack.get(i);
				count++;
			}
		}
		System.out.println(count + 1); // 맨 오른쪽 막대기때문에 +1
		br.close();
	}
}