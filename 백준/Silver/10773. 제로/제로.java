import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int num = Integer.parseInt(br.readLine()); // 정수 K값 입력받음.(입력받을 수)
		int n = 0, sum = 0;
		for (int i = 0; i < num; i++) {
			n = Integer.parseInt(br.readLine()); //입력 받은 수를 n에 입력.
			if (n != 0) { //n이 0이 아닐경우 stack에 넣고 sum에 n을 더해준다.
				stack.push(n);
				sum += n;
			} else { //n이 0일때 sum에서 최근 넣은 수를 빼고, 스택에서 pop으로 빼줌.
				sum -= stack.get(stack.size()-1);
				stack.pop();
			}
		}
		System.out.println(sum);
	}
}