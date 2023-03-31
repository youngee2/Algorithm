import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int n = 0, spy = 0; // n은 BufferedReader로 받은 문자를 정수형으로 변환해서 대입할 변수.
		// spy는 아홉 난쟁이들의 키를 더한 후 일곱 난쟁이의 키의 합(100)을 뺀 나머지 수.
		int start = 0, end = 8; // two pointers
		int y = 0; // y는 두개의 포인터가 가르키는 수를 더한 값. 이 y값이 spy값과 같으면 종료되어야 함.
		for (int i = 0; i < 9; i++) { // 9번 반복해서 난쟁이들의 키를 입력받음.
			n = Integer.parseInt(br.readLine());
			list.add(n); // 받은 키를 list에 저장.
			spy += n; // spy에 모든 난쟁이들의 키를 더함.
		}
		spy = spy - 100; // 아홉 명의 난쟁이 키에서 일곱 난쟁이의 키의 합(100)을 뺀 수.
		Collections.sort(list);// 키 오름차순 정렬
		while (true) {
			y = list.get(start) + list.get(end); // 두 포인터가 가르키는 수를 더해서 저장.
			if (y == spy) { // y 값과 spy 값이 같으면 종료.
				break;
			} else if (y < spy) { // y값이 spy값보다 작으면 수가 오름차순이므로 start 포인터를 증가시켜 y값을 올림.
				start++;
			} else { // 만약 y값이 spy값보다 크면 수가 오름차순으므로 end값을 줄여아함.
				end--;
			}
		}

		// 최종으로 start,end 포인터의 위치에 있는 수를 제거해야함.(일곱난쟁이를 제외한 두 난쟁이)
		// start를 먼저 제거하면 end 포인터 위치가 맞지 않으므로 end포인터 위치 먼저 제거해야 함.
		list.remove(end);
		list.remove(start);

		for (int i = 0; i < 7; i++) {
			System.out.println(list.get(i));
		}
	}
}