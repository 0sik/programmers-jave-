import java.util.*;
class Solution14 {
    public String solution(String s) {
		Character [] arr = new Character [s.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr,Collections.reverseOrder());
		s = "";
		for(int i=0; i<arr.length; i++) {
			s += arr[i];
		}
		return s;
    }

}
public class LV1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution14 solution = new Solution14();
		String answer = "hello";
		String arr= solution.solution(answer);
		String[] str = arr.split("");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
	}
	}
}