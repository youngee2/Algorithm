import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) { // 1부터 n까지의 번호 카드
			queue.add(i);
		}

		while (queue.size() > 1) {
			queue.remove();
			queue.add(queue.remove());

		}
		System.out.println(queue.peek());
		br.close();
	}
}