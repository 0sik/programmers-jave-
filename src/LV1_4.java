import java.util.*;
class Solution4 {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int index = 0;

        int temp = 0;

        while(n>0){
            temp = (int) (n%10);
            n = n/10;
            answer[index] = temp;
            index ++;
        }
        return answer;
    }
}
public class LV1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 solution = new Solution4();
		int [] answer = solution.solution(12345);
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
