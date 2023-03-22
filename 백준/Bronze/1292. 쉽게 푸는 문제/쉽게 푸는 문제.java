import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken()); //시작을 나타내는 정수 값
		int b = Integer.parseInt(st.nextToken()); //끝을 나타내는 정수 값
		int count=1; 
		int sum=0; //구간에 속하는 숫자의 합 ( a~b번째 숫자 합)
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<b; i++) { 
			for(int j=0; j<count; j++) { // 현재 수만큼 반복.
				list.add(count); //수열 값 ArrayList에 추가.
			}
			count++; //수 증가
		}
		
		for(int i=a-1; i<b; i++) { 
			//list는 0부터 시작하니 시작하는 수에서 -1를 해줌.
			//a-1에서 b까지 1씩 증가하면서 반복문을 돔.(3번째부터 7번째까지)
			sum+=list.get(i);
			// sum에 list i번째 값을 가져와 더함.
			// 1 2 [ 2 3 3 3 4] 4 4 4 5 5 5 5 5 
			// 괄호 친 부분을 더함(3번째부터 7번째까지). 2+3+3+3+4+4+4 
			// sum의 값은 15가 됨.
		}
		System.out.print(sum);
	}
}