import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        // 펼쳐진 카드의 개수를 변수 n에 저장
        int n=Integer.parseInt(br.readLine());

        //같은 과일별로 개수를 더함.
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String card=st.nextToken();

            if(map.containsKey(card)){
                map.put(card, map.get(card)+Integer.parseInt(st.nextToken()));
            }else{
                map.put(card, Integer.parseInt(st.nextToken()));
            }
        }

        // 값이 5가 있으면 YES 출력
        System.out.println(map.containsValue(5)?"YES":"NO");
    }
}