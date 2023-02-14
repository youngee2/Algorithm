import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		if (direction.equals("right")) {
			list.add(0, list.get(list.size() - 1));
			list.remove(list.size() - 1);
		} else if (direction.equals("left")) {
			list.add(list.size(), list.get(0));
			list.remove(0);
		}
		int[] answer = list.stream()
				.mapToInt(Integer::intValue)
			    	.toArray();
        return answer;
	}
}