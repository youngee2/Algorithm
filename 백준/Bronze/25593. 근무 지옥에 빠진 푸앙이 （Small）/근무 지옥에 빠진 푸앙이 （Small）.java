import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private HashMap<String,Integer> map = new HashMap<>();
    private static final int[] WORK_TIME={4,6,4,10};

    public void input(int j,String list){
        String[] arr = list.split(" ");

        for(int i=0; i<7; i++){
            if(!arr[i].equals("-")){
                map.put(arr[i],map.getOrDefault(arr[i],0)+WORK_TIME[j]);
            }
        }
    }


    public boolean part(){
        if(map.isEmpty()){
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int min=list.get(0);
        int max=list.get(list.size()-1);

        return (max - min <= 12);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        Main day=new Main();

        for(int i=0; i<n; i++){
            for(int j=0; j<4; j++) {
                day.input(j,br.readLine());
            }
        }

        System.out.println(day.part()?"Yes":"No");
    }
}