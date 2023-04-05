import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine()); //입력받은 수
		for(int i=n; i>0; i--) {
			for(int k=0; k<n-i; k++) {
				System.out.print(" "); //공백 출력하는데 하나씩 증가.
			}
			for(int j=n; j>n-i; j--) { //별 출력하는데 내려갈수록 하나씩 감소.
				System.out.print("*");
			}
			System.out.println(); //줄넘김
		}
	}
}