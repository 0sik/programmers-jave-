class Solution3{
	public int solution(int n) {
		int sum=0;
		while(true) {
			sum+= n%10;
			if(n<10)
				break;
			n= n/10;
		}
		return sum;
	}
}
public class LV1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 solution = new Solution3();
		System.out.println("°ª"+solution.solution(3344));
		

	}

}
