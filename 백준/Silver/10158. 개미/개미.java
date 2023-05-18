import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken()); // 격자 w
        int h = Integer.parseInt(st.nextToken()); // 격자 h
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken()); // 개미의 초기 위치 
        int q = Integer.parseInt(st.nextToken()); // 개미의 초기 위치 
        int t = Integer.parseInt(br.readLine()); // 개미가 움직이려는 시간 

        // 개미가 t시간 후에 도착하는 위치 계산.
        // w나 h의 2배는 개미가 상자를 한 바퀴 도는데 걸리는 시간. 
        p = (p + t) % (2 * w); //개미가 가로 방향으로 t시간동안 움직인 후의 위치. 왕복하려면 다시 돌아와야하므로 2배로 계산하고 나머지를 구함.
        q = (q + t) % (2 * h); 

        // 계산한 p가 격자 w보다 크면 반전시켜 반대 방향으로
        if(p > w) p = 2 * w - p;
        if(q > h) q = 2 * h - q;

        System.out.printf("%d %d", p, q);
        br.close();
    }
}