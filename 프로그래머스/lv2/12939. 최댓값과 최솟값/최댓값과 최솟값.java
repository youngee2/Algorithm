class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);

		for (int i = 0; i < arr.length; i++) {
			int number = Integer.parseInt(arr[i]);
			if (max < number) {
				max = number;
			} else if (min > number) {
				min = number;
			}
		}

        return min + " "+ max;
    }
}