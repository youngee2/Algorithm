import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static ArrayList<String> solution(ArrayList<Integer> list) {
		ArrayList<String> answer = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			StringBuilder sb = new StringBuilder(list.get(i).toString());
			if (list.get(i).toString().equals(sb.reverse().toString())) {
				answer.add("yes");
			} else {
				answer.add("no");
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			list.add(Integer.parseInt(br.readLine()));
			if (list.get(list.size() - 1) == 0) {
				list.remove(list.size() - 1);
				break;
			}
		}
		for (String x : Main.solution(list))
			System.out.println(x);
	}
}