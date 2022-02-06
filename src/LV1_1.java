class Solution {
    public String solution(int num) {
        String answer = "";
        if (num%2==0){
            answer= "Even";
        }
        else{
            answer="Odd";
        }
        return answer;
    }
}
public class LV1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println("결과:"+ solution.solution(4));
		System.out.println("결과:"+ solution.solution(3));
		
		
	}

}
