import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    HashSet<String> check = new HashSet<>();
    public void list(String name, String state){
        if(state.equals("enter")){
            check.add(name);
        }else{
            check.remove(name);
        }

    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String name=st.nextToken();
            String state=st.nextToken();

            m.list(name,state);
        }


        ArrayList<String> answer = new ArrayList<>(m.check);
        Collections.sort(answer, Collections.reverseOrder());

        for(String str:answer){
            bw.write(str+"\n");
        }

        bw.close();
        br.close();

    }
}
