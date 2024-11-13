import java.io.*;
import java.util.*;

public class Main {

    Stack<String> skill_stackA = new Stack<>();
    Stack<String> skill_stackB = new Stack<>();
    boolean stackState = false;
    static int count = 0;

    public void addData(String skill) {

        switch (skill) {
            case "S":
                skill_stackA.push(skill);
                break;
            case "L":
                skill_stackB.push(skill);
                break;
            case "K":
                if (!skill_stackA.isEmpty()) {
                    skill_stackA.pop();
                    count++;
                } else {
                    stackState = true;
                    return;
                }
                break;
            case "R":
                if (!skill_stackB.isEmpty()) {
                    skill_stackB.pop();
                    count++;
                } else {
                    stackState = true;
                    return;
                }
                break;
            default:
                if(Character.getNumericValue(skill.charAt(0))<=9){
                    count++;
                }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Main m = new Main();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < n; i++) {
            String skill_name = Character.toString(str.charAt(i));
            m.addData(skill_name);

            if (m.stackState) {
                break;
            }
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}