import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mod = 1000000007;
		int n = Integer.parseInt(br.readLine()); // n값
		long f = 0, f0 = 0, f1 = 1; 
		for (int i = 2; i <= n; i++) {
			f = (f0 + f1) % mod; 
			f0 = f1;
			f1 = f;
		}
		System.out.println(n<=1?f0:f0+f1%mod);
	}
}