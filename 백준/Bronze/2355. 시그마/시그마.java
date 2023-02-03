import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        long a = Integer.parseInt(st.nextToken());  //1
        long b = Integer.parseInt(st.nextToken());  //2

        long max= a>b?a:b; long min = a>b?b:a;
        long answer = (max+min) * (max-min+1)/2;
        System.out.println(answer);
    }
}