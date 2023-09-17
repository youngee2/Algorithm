import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력받을 정수의 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = list[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(list[i], dp[i - 1] + list[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

        br.close();
    }
}