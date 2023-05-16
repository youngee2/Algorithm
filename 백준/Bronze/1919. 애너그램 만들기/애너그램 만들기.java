import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();// a 문자열 대입
		String b = br.readLine();// b 문자열 대입
		int[] arr = new int[26];
		int[] arr1 = new int[26];
		int count = 0, c2=0;
		
		// a문자열 길이만큼 반복하는데 arr배열에 a 문자를 차례대로 -97를 한 후 해당 수의 인덱스를 +1함.
		// -97를 하는 이유는 아스키코드를 활용.
		for (int i = 0; i < a.length(); i++) {
			arr[a.charAt(i) - 97]++; 
		}
		//b도 마찬가지로 a 방법처럼 진행
		for (int i = 0; i < b.length(); i++) {
			arr1[b.charAt(i) - 97]++;
		}
		//위 코드에서 값을 다 구함. 이제 비교를 하여 카운트하면 됨.
		//26번을 반복하는데 c2 변수에 arr 배열의 해당 인덱스 값에서 arr1 배열의 해당 인덱스 값을 뺀 후 절대값으로 저장한다. 
		//count++하면 되는데 Math.abs(arr[i]-arr1[i])를 한 이유는 문자열에 해당 알파벳이 하나가 아니라 여러 개 일 수 있어서
		// c2!=0 는 0이 아니면 count에 c2를 저장한다.
		for (int i = 0; i < 26; i++) {
				c2=Math.abs(arr[i] -arr1[i]);
				if(c2 !=0) {
					count+=c2;
				}
			}
		br.close();
		System.out.println(count);
	}
}