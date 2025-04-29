class Solution {
    public String solution(int num) {    

        switch(num%2){
           case 0:
               return "Even";
          default:
               return "Odd";
               }

        /*if(num%2==0) return "Even";
        return "Odd";
        */
        
        // return num%2==0?"Even":"Odd";
    }
}