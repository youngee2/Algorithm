import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //거인 나라의 인구 수
        int n = Integer.parseInt(st.nextToken());
        //센티의 키
        int centi = Integer.parseInt(st.nextToken());
        //마법의 뿅망치 횟수 제한
        int count = Integer.parseInt(st.nextToken());

        //거인의 키 저장
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(br.readLine());
            list.offer(height);
        }
        
        int answer=0;

        //queue에서 제일 큰 거인의 키가 센티의 키와 같거나 크면 /2를 한 후에 
        //뿅망치 횟수를 -1한다. 
        //만약 센티보다 큰 거인이 없거나 나눌 이유가 없다면 반복문을 끝낸다.
        while (count > 0) {
            int first=list.peek();
            if (first==1||first<centi) {
                break;
            } else {
                int k = list.poll();
                list.offer(k / 2);
                count--;
                answer++;
            }
        }

        //queue에서 제일 큰 거인이 센티보다 크거나 같으면 NO 출력한 후, 제일 큰 거인의 키를 출력하고
        //만약 거인들이 센티보다 작으면 YES 출력하고 뿅망치를 최소로 사용한 횟수를 출력.
        int first = list.peek();

        if (first >= centi) {
            bw.write("NO");
            bw.newLine();
            bw.write(String.valueOf(first));
        } else {
            bw.write("YES");
            bw.newLine();
            bw.write(String.valueOf(answer));
        }

        bw.flush();
        bw.close();
        br.close();

    }
}