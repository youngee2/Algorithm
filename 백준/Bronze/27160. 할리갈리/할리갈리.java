import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String answer = "NO";

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + value);
        }


        for (String s : map.keySet()) {
            if (map.get(s) == 5) {
                answer = "YES";
            }
        }
        System.out.println(answer);
    }
}