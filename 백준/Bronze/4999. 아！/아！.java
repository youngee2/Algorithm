import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 재환이가 가장 길게 낼 수 있는 길이.
		String str2 = br.readLine(); // 의사가 듣기를 원하는 길이.
		if (str.length() >= str2.length()) { // 재환이가 더 길게 얘기하거나 같으면 go 출력. 아니면 no출력
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
}