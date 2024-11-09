import java.io.*;
import java.util.*;


public class Main {
    Stack<String>stackStr = new Stack<>();
    private static int CASE_NUMBER=1;
    
    public void addData(String[] arr){
        for(int i=0; i<arr.length; i++){
            stackStr.push(arr[i]);
        }
    }

    public String printData(){
        String s = "";
        int n=stackStr.size();

        for(int i=0; i<n; i++){
            s=s+stackStr.pop()+" ";
        }
        stackStr.clear();

        return "Case #"+CASE_NUMBER+": "+s;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       Main m = new Main();
        int n=Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++){
            m.addData(br.readLine().split(" "));

            bw.write(m.printData()+"\n");
            CASE_NUMBER++;
        }

        bw.close();
        br.close();
    }
}