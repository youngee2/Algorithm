import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // 명령의 수 n
		Queue<String> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		String str = "";
		String last = "";
		while (t-- > 0) { // 명령의 수 입력받은 게 하나씩 줄면서 0보다 클때까지 반복.
			str = br.readLine(); // 명령 입력받아서 str에 대입.
			if (str.contains("push")) {
				last = str.substring(5);
				queue.add(last);
			}
			switch (str) {
			case "pop": // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력. 정수가 없는 경우 -1 출력.
				sb.append(queue.isEmpty() ? Integer.valueOf(-1) : queue.poll()).append("\n");

				// poll() 메서드는 첫번째 값을 반환하고 제거.
				break;
			case "size":
				sb.append(queue.size()).append("\n"); // 큐에 들어있는 정수의 개수 출력.
				break;
			case "empty":
				sb.append(queue.isEmpty() ? Integer.valueOf(1) : Integer.valueOf(0)).append("\n");
				// 큐가 비어있으면 1, 아니면 0 출력
				break;
			case "front":
				sb.append(queue.isEmpty() ? Integer.valueOf(-1) : queue.peek()).append("\n");
				break;
			case "back":
				sb.append(queue.isEmpty() ? -1 : last).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
}