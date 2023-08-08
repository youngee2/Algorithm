import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String phoneNumberA = br.readLine();
		String phoneNumberB = br.readLine();
		for (int i = 0; i < 8; i++) {
			sb.append(phoneNumberA.charAt(i)).append(phoneNumberB.charAt(i));
		}
		String twoPhoneNumber = sb.toString();
		while (twoPhoneNumber.length() > 2) {
			sb.setLength(0); // StringBuilder 초기화.
			for (int i = 1; i < twoPhoneNumber.length(); i++) {
				int sum = Integer.parseInt(String.valueOf(twoPhoneNumber.charAt(i - 1)))
						+ Integer.parseInt(String.valueOf(twoPhoneNumber.charAt(i)));

				String sumString = String.valueOf(sum);

				if (sum >= 10) {
					sb.append(sumString.charAt(1));
				} else {
					sb.append(sumString);
				}
			}
			twoPhoneNumber = sb.toString();

		}
		System.out.println(twoPhoneNumber);
	}
}