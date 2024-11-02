import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    private HashSet<Integer> listA =new HashSet<>();
    private HashSet<Integer> listB =new HashSet<>();

    public void addDataA(int number){
        listA.add(number);
    }

    public void addDataB(int number){
        listB.add(number);
    }


    public int counting(){
        int count=0;

        for(int x:listA) {
            if (!listB.contains(x)) {
                count++;
            }
        }

        for(int x:listB) {
            if (!listA.contains(x)) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) throws IOException {
        Main link = new Main();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());


        st= new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            link.addDataA(Integer.parseInt(st.nextToken()));
        }

        st= new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++){
            link.addDataB(Integer.parseInt(st.nextToken()));
        }

        System.out.println(link.counting());
    }
}