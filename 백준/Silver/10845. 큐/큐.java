import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Queue<String> queue = new LinkedList<>(); //String형 queue 선언.
		String str="",last="";
		for(int i=0; i<num; i++) {
			str=br.readLine();
	
		if(str.contains("push")) {
			last=str.substring(5);
			queue.offer(last); //queue에 값 추가. (정수 x를 큐에 넣는 연산)

		}
		switch(str) {
		case "pop":
			//queue.isEmpty() 메서드로 queue가 비어있는지 확인. 비어있는 경우 -1 출력. 
			//queue에 정수가 들어있는 경우 poll메서드 실행.
			// poll메서드는 가장 먼저 저장된 정수를 빼내고 반환한다. 없을경우 null
			System.out.println(queue.isEmpty()?Integer.valueOf(-1):queue.poll());
		break;
		
		case "size":
			//queue에 들어있는 정수의 개수 출력.
		System.out.println(queue.size()); 
		break;
		
		case "empty":
			//queue.isEmpty() 메서드로 queue가 비어있는지 확인. 비어있는 경우 -1 출력. 
			//queue가 비어있으면 1, 아니면 0을 출력.	
		System.out.println(queue.isEmpty()?Integer.valueOf(1):Integer.valueOf(0)); 
		break;
		
		case "front":
			//queue의 가장 앞에 있는 정수를 출력. queue에 들어있는 정수가 없는 경우에 -1 출력.
			//queue.isEmpty() 메서드로 queue가 비어있는지 확인. 비어있는 경우 -1 출력. 
			// 비어있지 않을 경우 queue.peek()메서드를 사용해 반환.
		System.out.println(queue.isEmpty()?Integer.valueOf(-1):queue.peek());
		break;
		
		case "back": //queue의 가장 뒤에 있는 정수를 출력한다.(최근에 삽입한 정수)
			//큐에 들어있는 정수가 없는 경우 -1 출력.
			System.out.println(queue.isEmpty()?Integer.valueOf(-1):last);
			break;
		}
	}
	}
}