import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int num = Integer.parseInt(br.readLine()); // 주어지는 명령의 수 입력받음.
		int m = 0, push_num = 0;
		for (int i = 0; i < num; i++) {
			String str = br.readLine(); // 다음줄 입력받음.
			if (str.contains("push")) {
				// 입력받은 문자열에 push가 포함되어 있다면 substring으로 push 이후의 문자열을 int타입으로
				// 변환한 후 push_num 변수에 대입한다.
				// 대입한 후 stack.push로 스택에 넣어준다.
				push_num = Integer.parseInt(str.substring(5));
				stack.push(push_num);
			}
			switch (str) {
			// 만약 push가 아닌 경우 입력받는 문자열을 switch문을 활용해 비교하여
			// 같은 문자열을 찾으면 해당하는 명령을 처리하게 한다.
			case "pop": // 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력. 스택에 정수가 없는 경우 -1 출력.
				if (stack.empty() == false) { // 만약 스택이 비어있지 않을 경우에
					m = stack.pop(); // stack.pop으로 스택에서 가장 위에 있는 정수를 빼고 그 수를 m변수에 대입한다.
					System.out.println(m); // m변수 출력.
				} else {
					System.out.println(-1); // 만약 스택이 비어있을 경우 -1 출력.
				}
				break;
			case "size": // 스택에 들어있는 정수의 개수 출력.
				System.out.println(stack.size());
				break;
			case "empty":// 스택이 비어있으면 1, 아니면 0출력.
				System.out.println(stack.empty() ? 1 : 0);
				break;
			case "top": // 스택의 가장 위에 있는 정수룰 츨력. 정수가 없는 경우에 -1출력.
				if(stack.empty()==false) {
					System.out.println(stack.peek());
				}else {
					System.out.println(-1);
				}
				break;
			}
		}

	}
}
