import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    HashSet<String> list = new HashSet<>();
    StringBuilder sb = new StringBuilder();

    public void addData(String data) {
        list.add(data);
    }

    public String comparePw() {
        String answer="";
        for (String x : list) {
            sb.append(x).reverse();
            if (list.contains(sb.toString())) {
                answer=x;
            }else{
                sb.setLength(0);
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main m=new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            m.addData(br.readLine());
        }

        String pw= m.comparePw();

        System.out.println(pw.length()+" "+pw.charAt(pw.length()/2));

        br.close();
    }
}