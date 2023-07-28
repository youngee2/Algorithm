import java.util.ArrayList;
class Solution {
    public String[] solution(String my_str, int n) {
		ArrayList<String> list= new ArrayList<>();
        int index=0;
        
		while(index<my_str.length()) {
			if(my_str.length()>=n+index) {
				list.add(my_str.substring(index,index+n));
				index+=n;
			}else {
				list.add(my_str.substring(index));
                break;
			}
			
		}
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}