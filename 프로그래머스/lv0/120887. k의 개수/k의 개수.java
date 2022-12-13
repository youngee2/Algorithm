class Solution {
	    public int solution(int i, int j, int k) {
	        int count=0;
	    	String str="";
	        for(int m=i; m<=j; m++) {
	    		str += Integer.toString(m);
	        }
	        char[] arr=str.toCharArray();
	        for(int m=0; m<str.length(); m++) {
	        	if(arr[m]==Integer.toString(k).charAt(0)) count++;
	        }
	        return count;
	    }
}