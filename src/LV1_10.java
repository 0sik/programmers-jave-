class Solution10 {
    public int[] solution(int[] arr) {
        if(arr.length ==1)
            return new int[]{-1};
        
        int minidx=0;
        for(int i =0;i<arr.length;i++){
            if(arr[minidx]>arr[i]){
                minidx=i;
            }
        }
       int[] answer = new int[arr.length-1];
        int cnt = 0;
        for(int i=0; i<arr.length; i++) {
            if(i == minidx) continue;
            answer[cnt++] = arr[i];
        }
            return answer;
    }
}

public class LV1_10{
	public static void main(String[] args) {
		Solution10 test = new Solution10();
		int[] arr= {4,5,6,7};
		int [] answer = test.solution(arr);
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);

	}
}
}