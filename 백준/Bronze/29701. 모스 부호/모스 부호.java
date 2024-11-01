import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split(" ");

        HashMap<String,String> map = new HashMap<String,String>(){
            {
                put(".-", "A");
                put("-...", "B");
                put("-.-.", "C");
                put("-..", "D");
                put(".", "E");
                put("..-.", "F");
                put("--.", "G");
                put("....", "H");
                put("..", "I");
                put(".---", "J");
                put("-.-", "K");
                put(".-..", "L");
                put("--", "M");
                put("-.", "N");
                put("---", "O");
                put(".--.", "P");
                put("--.-", "Q");
                put(".-.", "R");
                put("...", "S");
                put("-", "T");
                put("..-", "U");
                put("...-", "V");
                put(".--", "W");
                put("-..-", "X");
                put("-.--", "Y");
                put("--..", "Z");
                put(".----", "1");
                put("..---", "2");
                put("...--", "3");
                put("....-", "4");
                put(".....", "5");
                put("-....", "6");
                put("--...", "7");
                put("---..", "8");
                put("----.", "9");
                put("-----", "0");
                put("--..--", ",");
                put(".-.-.-", ".");
                put("..--..", "?");
                put("---...", ":");
                put("-....-", "-");
                put(".--.-.", "@");
            }
        };
        StringBuilder sb = new StringBuilder();

        for(String s:arr){
            sb.append(map.get(s));
        }


        System.out.println(sb.toString());


        br.close();
    }
}