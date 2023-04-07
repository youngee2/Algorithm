import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int numA = numbers[numbers.length-1]*numbers[numbers.length-2];
        //오름차순 정렬을 했기 때문에 제일 높은 수 두개를 곱한다.
        int numB= numbers[0]*numbers[1];
        //마이너스 * 마이너스는 양수이기 때문에 numA보다 더 큰 값을 가질 수 있어서 제일 낮은 수 2개를 곱한다. 하나가 양수거나 두개가 양수이면 무조건 numA가 큼.
        
        int answer=numA<numB?numB:numA; //구한 두 수를 비교하여 더 높은 수를 출력.
        return answer;
    }
}