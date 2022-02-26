public class Problem_002_MySolution02 {

	public String solution(String new_id) {
		
        String answer = new_id;
        
        // 1단계
        answer = answer.toLowerCase();
        
        // 2단계
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계
        answer = answer.replaceAll("[.]{2,}", ".");
        
        // 4단계
        answer = answer.replaceAll("^[.]{1}", "");
        answer = answer.replaceAll("[.]{1}$", "");
        
        // 5단계
        if (answer.equals("")) answer += "a";
        
        // 6단계
        if (answer.length() >= 16) {
        	answer = answer.substring(0, 15);
        }
        
        // 6단계에서 잘라낸 문자열 맨 끝이 마침표(.)일 경우
        answer = answer.replaceAll("[.]{1}$", "");
        
        // 7단계
        while (answer.length() < 3) {
        	answer += answer.charAt(answer.length()-1);
        }
        
        
        return answer;
        
    }	
	
}