import java.util.Arrays;
class Solution {
  		    public static int solution(String before, String after) {
	        char[] beforearr = before.toCharArray(); 
	        char[] afterarr = after.toCharArray();
	        
	       Arrays.sort(beforearr);
	       Arrays.sort(afterarr);
	       
	       before = new String(beforearr);
	       after = new String(afterarr);
	       
	       if(before.equals(after)) {
	    	   return 1;
	       }return 0;       
	    }
}