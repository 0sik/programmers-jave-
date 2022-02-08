
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
		long [] answer = solution.solution(4,3);
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
	}

}
}
