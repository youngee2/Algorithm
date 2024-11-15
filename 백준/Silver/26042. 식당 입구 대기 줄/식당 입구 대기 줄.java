import java.io.*;
import java.util.*;

public class Main {
    Deque<Integer> list = new LinkedList<>();
    int max_waiting = 0;
    int waiting_student_num=0;

    public void addData(int value) {
        list.offer(value);

        if (list.size() > max_waiting) {
            max_waiting = list.size();
            waiting_student_num = value;
        } else if (list.size() == max_waiting) {
            waiting_student_num = Math.min(waiting_student_num, value);
        }
    }

    public void answer() {
        list.poll();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Main m = new Main();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());

            if (s == 1) {
                int num = Integer.parseInt(st.nextToken());
                m.addData(num);
            } else {
                m.answer();
            }
        }

        bw.write(m.max_waiting + " " + m.waiting_student_num);
        bw.flush();
        bw.close();
        br.close();
    }
}