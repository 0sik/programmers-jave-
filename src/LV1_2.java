class Solution2 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i < arr.length ;i++){
        sum+=arr[i];
  }
     answer = sum/arr.length;
     return answer ;
        
    }
}
public class LV1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 solution = new Solution2();
		int x[] = {1,3,4,5};
		System.out.println("°ª:"+solution.solution(x));
		
		
	}

}
