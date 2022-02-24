class solution{
	public long [] solution(int x, int n)
		long[]answer = new long[n];
		long base = x;
		for(int i = 0; i < n; i++) {
			answer[i]=base*(i+1);
		}
		return answer;
}
public class LV1_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
