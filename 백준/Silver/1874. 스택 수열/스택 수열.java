import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();	
		int num = Integer.parseInt(br.readLine()); // 정수 K값 입력받음.(입력받을 수)
		int n =0; //정수 입력받을 변수.
		int s = 0; // 1씩 증가하면서 스택 쌓을 정수를 구해주는 변수.


		while (num-->0) { //후위 증감 연산자를 사용하여(num--) 0보다 크면 반복한다.
			n = Integer.parseInt(br.readLine()); //다음 입력받은 정수 n에 저장.
			if (n > s) { // s가 n보다 작은경우 push.
				for(int i=s+1; i<=n; i++) {
					stack.push(i); // stack에 i를 push한다.
					sb.append('+').append('\n');	//push한 뒤 StringBuilder에 + \n을 저장.				
				}
				s=n; //s에 n을 저장한다. (비교하기 위해)
			} else if (stack.peek() != n) { //스택 맨 위에 있는 수가 n과 같지 않다면 
				System.out.println("NO"); //NO 출력하고 프로그램을 끝낸다.
				return;
			}
				stack.pop(); // 만약 stack 맨 위에 있는 수가 n과 일치하다면 stack에서 pop으로 꺼낸다.
				sb.append('-').append('\n');//pop한 뒤 StringBuilder에 - \n을 저장.
		}
		System.out.println(sb);
	}
}

//처음에 출력 예제 2번을 고려하지 않고 풀어서 다시 풀어봐야함! 