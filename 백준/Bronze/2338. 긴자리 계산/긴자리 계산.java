import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		System.out.println(a.add(b)); //덧셈
		System.out.println(a.subtract(b)); //뺄셈
		System.out.println(a.multiply(b)); //곱셈
		br.close();
	}
}