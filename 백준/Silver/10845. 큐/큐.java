import java.io.*;
import java.util.*;

public class Main {
    private static void printWrite(BufferedWriter bw, int value) throws IOException {
        bw.write(String.valueOf(value));
        bw.newLine();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> list = new LinkedList<>();

        //명령의 수
        int n=Integer.parseInt(st.nextToken());

        while(n-->0){
            st=new StringTokenizer(br.readLine());
            String command=st.nextToken();

            switch (command){
                case "push":
                    int data=Integer.parseInt(st.nextToken());
                    list.add(data);
                    break;

                case "pop":
                    if(list.isEmpty()){
                        printWrite(bw,-1);
                    }else{
                        printWrite(bw,list.poll());
                    }
                    break;

                case "size":
                    printWrite(bw,list.size());
                    break;

                case "empty":
                    if(list.isEmpty()){
                        printWrite(bw,1);
                    }else{
                        printWrite(bw,0);
                    }
                    break;

                case "front":
                    if(list.isEmpty()){
                        printWrite(bw,-1);
                    }else{
                        printWrite(bw,list.peek());
                    }
                    break;

                case "back":
                    if(list.isEmpty()){
                        printWrite(bw,-1);
                    }else{
                        printWrite(bw,list.peekLast());
                    }
                    break;
            }

        }
        bw.flush();
        bw.close();
        br.close();

    }
}
