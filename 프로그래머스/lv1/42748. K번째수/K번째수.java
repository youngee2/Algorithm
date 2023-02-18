import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
	int idx = 0, tmp = 0, m = 0, n = 0, z = 0;
		int[] answer = new int[commands.length];
		for (int k = 0; k < commands.length; k++) {
			m = commands[k][0]; // ?번째부터
			n = commands[k][1]; // ?번째까지 자른 후
			z = commands[k][2]; // ?번째 숫자 구하기

			int test[] = Arrays.copyOfRange(array, m - 1, n);
			Arrays.sort(test);
			for (int i = 0; i < test.length; i++) {
				idx = i;
				for (int j = i + 1; j < test.length; j++) {
					if (test[j] < test[idx]) {
						idx = j;
					}
					tmp = test[i];
					test[i] = test[idx];
					test[idx] = tmp;
				}
			}
			answer[k] = test[z - 1];
		}
		return answer;
	}

}