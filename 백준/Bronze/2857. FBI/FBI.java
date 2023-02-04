import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[5];
		String answer = "";
		String regex = "[0-9A-Z-\\d]*$";
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("FBI") && Pattern.matches(regex, str[i])&&str[i].length()<=10) {
				answer += i + 1 + " ";
			}
		}
		if (answer == "") {
			System.out.println("HE GOT AWAY!");
		}
		System.out.println(answer);
	}
}