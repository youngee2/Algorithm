import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();

		while (true) {
			String str = br.readLine();
			if (str.equals(".")) { //입력의 종료 조건으로 온점 하나가 들어옴.
				break;
			}
			char bracket = 0;

			for (int i = 0; i < str.length(); i++) {
				bracket = str.charAt(i);

				if (bracket == '(' || bracket == '[') {
					stack.push(bracket);
				} else if (bracket == ')') {
					if (stack.empty() || stack.peek() != '(') {
						// 제일 최근에 스택에 넣은 괄호와 맞지 않거나 스택이 비어있을 경우
						// 반복문 나감.
						break;
					} else {
						// 만약 괄호가 매칭되는 경우 pop으로 해당 스택 꺼냄.
						stack.pop();
					}

				} else if (bracket == ']') {
					if (stack.empty() || stack.peek() != '[') {
						// 소괄호와 같은 방법.
						break;
					} else {
						stack.pop();
					}
				}
			}
			System.out.println(stack.empty() && bracket == '.' ? "yes" : "no");
			//스택이 비어있고 bracket에 마지막 문자가 들어가있는데 그 문자가 .일 경우 
			//yes를 출력하고 마지막 문자가 .이 아니거나 스택이 비어있지 않을 경우 no 출력.
			stack.clear(); //반복하기 전 스택 비워주기.
		}
		br.close();
	}
}