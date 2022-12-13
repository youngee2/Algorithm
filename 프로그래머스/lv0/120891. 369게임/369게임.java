class Solution {
    public static int solution(int order) {
        int count=0;
        char[] arr = (""+order).toCharArray();
        for(int i=0; i<arr.length; i++) {
        	switch(arr[i]) {
        	case '3': count++;break;
        	case '6': count++;break;
        	case '9': count++;break;
        	}
        }
        return count;
    }
}