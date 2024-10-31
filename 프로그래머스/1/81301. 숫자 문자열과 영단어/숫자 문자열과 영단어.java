class Solution {
    public int solution(String s) {
    String[] list = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0; i<10; i++){
             s= s.replace(list[i],i+"");
        }        
        
        return Integer.parseInt(s);
    }
}