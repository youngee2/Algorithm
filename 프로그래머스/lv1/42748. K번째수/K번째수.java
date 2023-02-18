import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
     int m = 0, n = 0, z = 0;
		int[] answer = new int[commands.length];
		for (int k = 0; k < commands.length; k++) {
			m = commands[k][0]; // ?번째부터
			n = commands[k][1]; // ?번째까지 자른 후
			z = commands[k][2]; // ?번째 숫자 구하기.

			int test[] = Arrays.copyOfRange(array, m - 1, n);
			Arrays.sort(test);
			answer[k] = test[z - 1];
		}
		return answer;
	}
}