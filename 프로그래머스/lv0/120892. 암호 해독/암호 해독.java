class Solution {
	   	  	    public static String solution(String cipher, int code) {
	        String str="";
	        for(int i=0; i<cipher.length(); i++) {
	        		if((i+1)%code==0) {
	        			str+=cipher.charAt(i);
	        		}
	        }
	        return str;
	   }
}