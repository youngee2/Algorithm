import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		Deque<Integer> deque = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 명령의 수
		String str = "";
		int s = 0;
		while (n != 0) {
			str = br.readLine(); // 명령 입력받음.
			if (str.contains("push_back")) {
				deque.addLast(Integer.parseInt(str.substring(10))); // 정수 X를 덱의 뒤에 원소 추가.
			} else if (str.contains("push_front")) {
				deque.addFirst(Integer.parseInt(str.substring(11)));// 정수 X를 덱의 앞에 원소 추가
			} else { // 명령이 push가 아닐 경우.
				switch (str) {
				case "pop_front":
					s = deque.isEmpty() ? -1 : deque.removeFirst();
					sb.append(s).append('\n');
					// removeFirst() 메서드는 덱의 맨 앞쪽에서 원소를 제거하고 반환.
					// 덱이 비어있으면 예외가 발생하여 if문으로 비어있지 않을 경우 해당 메서드를 실행하도록 함.
					break;
				case "pop_back":
					s = deque.isEmpty() ? -1 : deque.removeLast();
					sb.append(s).append('\n');
					// removeLast() 메서드는 덱의 맨 뒤쪽에서 원소를 제거하고 반환.
					// 덱이 비어있으면 예외가 발생하여 if문으로 비어있지 않을 경우 해당 메서드를 실행하도록 함.
					break;
				case "size":
					s = deque.size();
					sb.append(s).append('\n');
					// 덱에 들어있는 원소의 개수를 반환.
					break;
				case "empty":
					s = deque.isEmpty() ? 1 : 0;
					sb.append(s).append('\n');
					// 덱이 비어있으면 1을, 아니면 0을 출력.
					break;
				case "front":
					s = deque.isEmpty() ? -1 : deque.getFirst();
					sb.append(s).append('\n');
					// getFirst() 메서드는 덱의 맨 앞에 있는 원소를 출력.
					break;
				case "back":
					s = deque.isEmpty() ? -1 : deque.getLast();
					sb.append(s).append('\n');
					// getLast() 메서드는 덱의 맨 뒤에 있는 원소를 출력.
					break;
				}
			}
			n--;
		}
		System.out.println(sb);
		br.close();
	}
}