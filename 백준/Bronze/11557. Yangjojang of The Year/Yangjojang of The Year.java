import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스의 숫자 T
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while(t-->0){

            //학교의 숫자 정수 N
            int n=Integer.parseInt(br.readLine());

            int max=0;
            String school="";

            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                String name=st.nextToken();
                int drink=Integer.parseInt(st.nextToken());
                if(max<drink){
                    max=drink;
                    school=name;
                }
            }
            bw.write(school+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}