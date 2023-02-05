import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static int solution(int n, int[] arr,int x) {
		int answer=0;
		int left=0,right=n-1;
		Arrays.sort(arr);
		while(left<right) {
			if(arr[left]+arr[right]==x) {
				left++;right--;
				answer++;
			}else if(arr[left]+arr[right]>x) {
				right--;
			}else {
				left++;
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		br.close();
		System.out.print(Main.solution(n, arr,x));
	}
}