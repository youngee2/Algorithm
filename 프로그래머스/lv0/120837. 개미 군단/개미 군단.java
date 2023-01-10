class Solution {
    public int solution(int hp) {
        int attack5 = hp/5;
        int attack3 = (hp-5*attack5)/3;
        int attack1 = (hp-3*attack3-5*attack5)/1;
        return attack5+attack3+attack1;
    }
}