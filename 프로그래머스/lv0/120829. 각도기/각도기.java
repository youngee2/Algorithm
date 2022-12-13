class Solution {
    public int solution(int angle) {
        if(angle<90 && angle>0)  angle=1;
        else if(angle==90)       angle=2;
        else if(angle>90 && angle<180)  angle=3;
        else if(angle==180) angle=4;
        return angle;
    }
}