import java.io.*;
import java.util.PriorityQueue;

public class Main {
    //낮은 수가 우선순위를 가짐
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    //데이터를 추가하는 메서드
    public void addData(int i){
    minHeap.add(i);
    }
    
    //데이터를 삭제하는 메서드
    public int removeData(){
    if(minHeap.isEmpty()){
        return 0;
    }else{
        return minHeap.remove();
    }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main ct1 = new Main();
        //데이터를 몇번 받을건지 저장하는 변수
        int n=Integer.parseInt(br.readLine());

        //n만큼 반복하면서 해당 데이터가 0이라면 removeData() 실행 후 결과 저장
        //그렇지 않은 경우는 addData() 실행
        for(int i=0;i<n;i++){
            int s = Integer.parseInt(br.readLine());

            if(s==0){
                int ans=ct1.removeData();
                bw.write(ans+"\n");
            }else{
                ct1.addData(s);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}