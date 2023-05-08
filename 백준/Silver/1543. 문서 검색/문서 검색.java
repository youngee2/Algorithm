import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int count=0,index = 0;
		  while (index < str1.length()) {
	            index = str1.indexOf(str2, index);
	            if (index != -1) {
	                count++;
	                index += str2.length();
	            } else {
	                break;
	            }
	        }
		System.out.println(count);
		br.close();
	}
}