
import java.util.*;

class Solution12 {
  public long solution(long n) {
      Double sqrt = Math.sqrt(n);
      
      if(sqrt == sqrt.intValue()){
          return (long)Math.pow(sqrt + 1, 2);
      } else return -1;
  }
}

public class LV1_12{
	public static void main(String[] args) {
		Solution12 solution = new Solution12();
		System.out.println(solution.solution(121));

	}
	
}