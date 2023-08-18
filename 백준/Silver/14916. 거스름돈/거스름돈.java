import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 거스름돈 액수
		int count = 0;
		if (n % 5 == 0) { // 만약 5원으로 나뉜다면.
			count = n / 5;
		} else { // 5원으로만 나뉘어지지않는다면.
			count = n / 5;
			while (count >= 0) {
				if ((n - (count * 5)) % 2 == 0) {
					count += (n - (count * 5)) / 2;
					break;
				}
				count--;
			}
		}
		System.out.println(count < 0 ? -1 : count);
		br.close();
	}
}