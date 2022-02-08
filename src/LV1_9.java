class Solution9 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i<phone_number.length();i++){
            if (i<phone_number.length()-4)
                answer+="*";
            else
                answer+=phone_number.charAt(i);
        }
        return answer;
    }
}
public class LV1_9{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution9 test = new Solution9();
		System.out.println(test.solution("01072450432"));
		
	}
}