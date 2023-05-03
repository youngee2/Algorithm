import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException{
    	Deque<Integer> deque= new LinkedList<>();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine()); //명령의 수
    	String str="";
    	while(n!=0) {
    		str=br.readLine(); //명령 입력받음.
    		if(str.contains("push_back")) {
    			deque.addLast(Integer.parseInt(str.substring(10))); //정수 X를 덱의 뒤에 원소 추가.
    		}else if(str.contains("push_front")) {
    			deque.addFirst(Integer.parseInt(str.substring(11)));//정수 X를 덱의 앞에 원소 추가
    		}else { //명령이 push가 아닐 경우.
    			switch(str) {
    			case "pop_front":
    				System.out.println(deque.isEmpty()?-1:deque.removeFirst());
    				//removeFirst() 메서드는 덱의 맨 앞쪽에서 원소를 제거하고 반환.
    				// 덱이 비어있으면 예외가 발생하여 if문으로 비어있지 않을 경우 해당 메서드를 실행하도록 함.
    				break;
    			case "pop_back":
    				System.out.println(deque.isEmpty()?-1:deque.removeLast());
    				//removeLast() 메서드는 덱의 맨 뒤쪽에서 원소를 제거하고 반환.
    				// 덱이 비어있으면 예외가 발생하여 if문으로 비어있지 않을 경우 해당 메서드를 실행하도록 함.
    				break;
    			case "size":
    				System.out.println(deque.size());
    			   //덱에 들어있는 원소의 개수를 반환.
    				break;
    			case "empty":
    				System.out.println(deque.isEmpty()?1:0);
    				//덱이 비어있으면 1을, 아니면 0을 출력.
    				break;
    			case "front":
    				System.out.println(deque.isEmpty()?-1:deque.getFirst());
    				//getFirst() 메서드는 덱의 맨 앞에 있는 원소를 출력.
    				break;
    			case "back":
    				System.out.println(deque.isEmpty()?-1:deque.getLast());
    				//getLast() 메서드는 덱의 맨 뒤에 있는 원소를 출력.
    				break;
    			}
    		}
    		n--;
    	}
        }
    }