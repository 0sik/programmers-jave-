public class Problem_002_MySolution02 {

	public String solution(String new_id) {
		
        String answer = new_id;
        
        // 1�ܰ�
        answer = answer.toLowerCase();
        
        // 2�ܰ�
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        // 3�ܰ�
        answer = answer.replaceAll("[.]{2,}", ".");
        
        // 4�ܰ�
        answer = answer.replaceAll("^[.]{1}", "");
        answer = answer.replaceAll("[.]{1}$", "");
        
        // 5�ܰ�
        if (answer.equals("")) answer += "a";
        
        // 6�ܰ�
        if (answer.length() >= 16) {
        	answer = answer.substring(0, 15);
        }
        
        // 6�ܰ迡�� �߶� ���ڿ� �� ���� ��ħǥ(.)�� ���
        answer = answer.replaceAll("[.]{1}$", "");
        
        // 7�ܰ�
        while (answer.length() < 3) {
        	answer += answer.charAt(answer.length()-1);
        }
        
        
        return answer;
        
    }	
	
}