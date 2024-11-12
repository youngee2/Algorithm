import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Deque<Integer> deque1 = new LinkedList<>();

    public void addData(int i){
        deque1.offer(i);
    }

    public void removeData() throws IOException {
       String num= String.valueOf(deque1.pollFirst());
       bw.write(num+" ");
    }

    public void moveData(){
        deque1.offerLast(deque1.pollFirst());
    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        int n=Integer.parseInt(m.br.readLine());

        for(int i=1; i<=n; i++){
            m.addData(i);
        }

        for(int i=0; i<n; i++){
            m.removeData();
            m.moveData();

        }
        m.bw.flush();
        m.bw.close();
        m.br.close();
    }
}