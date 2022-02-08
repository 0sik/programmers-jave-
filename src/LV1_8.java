
class Solution8 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i =0;i<n;i++){
            answer[i]=num;
            num=num+(long)x;
        }
        return answer;
    }
}
public class LV1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 solution = new Solution8();
		System.out.println(solution.solution(8,4));
	}

}
