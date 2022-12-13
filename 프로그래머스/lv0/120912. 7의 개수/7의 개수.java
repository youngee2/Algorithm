class Solution {
    public int solution(int[] array) {
         int count=0;
	        String num ="";
	        for(int i = 0; i<array.length; i++) {
				num += array[i];
			}
	        char[] chars = num.toCharArray();
	        
	        for(int i=0; i<chars.length; i++){
	        	  if(chars[i]=='7'){
	                count++;
	            }
	     
	        }
	        return count;
	    }
}