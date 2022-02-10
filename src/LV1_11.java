//이상한 문자 만들기
class Solution11 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        } 
        
        return answer;
    }
}
public class LV1_11{
	public static void main(String[] args) {
		Solution11 solution = new Solution11();
		String answer = "hello";
		String arr= solution.solution(answer);
		String[] str = arr.split("");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
	}
}
}