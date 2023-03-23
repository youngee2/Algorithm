import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a =Integer.parseInt(st.nextToken()); 
		//집합 A의 원소의 개수
		int b =Integer.parseInt(st.nextToken()); 
		//집합 B의 원소의 개수
		int n=0; //집합 b 원소 받을 변수.
		
		st=new StringTokenizer(br.readLine());

		TreeSet<Integer> list = new TreeSet<>();
		
		for(int i=0; i<a; i++) {	//집합 A에 원소 입력.
			list.add(Integer.parseInt(st.nextToken())); 
		}
		
		st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<b; i++) { 
			//집합 b 원소를 n 변수에 입력받아 contains메서드를 활용해 집합 A에 포함되어있는지 확인.
			//만약 포함이 되어있을경우 remove를 통해 집합 A의 포함되어있는 값 제거.
			//교집합+집합B 제거되어야함.
			n=Integer.parseInt(st.nextToken());
			if(list.contains(n)) {
				list.remove(n);
			}
		}
		
		System.out.println(list.size()); //다 제거하고 남은 집합 A의 원소 개수
			for(int y:list) { //구체적인 원소 
				System.out.print(y+" ");
			}
		}	
	}