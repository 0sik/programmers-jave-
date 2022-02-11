class Solution13 {
    public int solution(int n) {
        int answer = 0;
        boolean flag = true;

        for (int i = 2; i <= n ; i++ ) {
            for (int j = 2; j <= Math.sqrt(i) ; j++ ) {
                if (  i % j == 0 ) {
                    flag = false; break;
                }
            }
            if(flag == true) answer++;
            flag = true; 
        }
  
        return answer;
    }
}
public class LV1_13{
	public static void main(String[] args) {
		Solution13 solution = new Solution13();
		System.out.println(solution.solution(10));
	}
}