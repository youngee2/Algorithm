import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[n + 1][3];
		int[][] emp = new int[n + 1][3];
		
		for(int i=0; i<n; i++) { //입력받음.
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				emp[i][j]=Integer.parseInt(st.nextToken());
			}			
		}
		
		//첫번째 줄 초기화
		for(int i=0; i<3; i++) {
			dp[0][i]=emp[0][i];
		}
		
		//dp 배열이 [i][0]이면 전단계 줄에서 0을 제외한 두개.(1,2)를 비교하여 작은 수랑 현재 배열값이랑 더한 후 저장. 
		for(int i=1; i<n; i++) {
			dp[i][0]=emp[i][0]+Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1]=emp[i][1]+Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2]=emp[i][2]+Math.min(dp[i-1][0], dp[i-1][1]);
		}
		
		//마지막 줄 제일 작은 수가 정답.
		int answer=Math.min(Math.min(dp[n-1][0], dp[n-1][1]),dp[n-1][2]);
		
		System.out.println(answer);
		br.close();
	}
}