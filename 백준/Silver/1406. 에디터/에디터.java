import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s=br.readLine(); //초기에 편집기에 입력되어 있는 문자열.
	    Stack<String> stackA = new Stack<>();
	    Stack<String> stackB = new Stack<>();
	    StringBuilder st = new StringBuilder();
	    int n = Integer.parseInt(br.readLine()); //입력할 명령어의 개수.
	    String str ="";
	    
	    for(int i=0; i<s.length(); i++) {
	    	stackA.push(Character.toString(s.charAt(i)));//초기 문자열을 스택에 저장.
	    }
	    for(int i=0; i<n; i++) {
	    	str=br.readLine();
	    	if(str.contains("P")) { //입력받은 명령어가 P일 경우 해당  문자를 스택에 추가.
	    		stackA.push(str.substring(2));
	    	}
	    	switch(str) {
	    	case "L": //커서를 왼쪽으로 한 칸 옮기는 역할.
	    		if(!stackA.isEmpty()) { //만약 비어있지 않을 경우 
	    			stackB.push(stackA.pop());	    			
	    		}
	    		break;
	    	case "D"://커서를 오른쪽으로 한 칸 옮기는 역할.
	    		if(!stackB.isEmpty()) {
	    			stackA.push(stackB.pop());
	    		}
	    		break;
	    	case "B": //커서를 왼쪽에 있는 문자를 삭제.
	    		if(!stackA.isEmpty()) {
	    			stackA.pop();
	    		}
	    		break;
	    	
	    	}
	    }
	    

	   while(!stackB.isEmpty()) {
		   stackA.push(stackB.pop());
	   }
	   while(!stackA.isEmpty()) {
		st.append(stackA.pop());
	   }
	   System.out.println(st.reverse());
	    
      
     
	}
}