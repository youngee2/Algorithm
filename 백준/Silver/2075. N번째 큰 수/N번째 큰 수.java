import java.io.*;
import java.util.*;

public class Main {
    PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());;

    //n번째 큰 수 반환 메서드
    public int rank(int num){
        int next=1;
        while(next!=num){
            list.poll();
            next++;
        }
        return list.peek();
    }
    
    public static void main(String[] args) throws IOException {
        Main ct2 = new Main();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //n번째 큰 수 찾는 문제+ n*n 개의 데이터를 받을 때 사용되는 변수 
        int n=Integer.parseInt(st.nextToken());

        // PriorityQueue에 데이터 저장
        for(int i=0;i<n; i++){
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                ct2.list.add(Integer.parseInt(st.nextToken()));
            }
        }

        bw.write(String.valueOf(ct2.rank(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}