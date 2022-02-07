import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Test {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> member_id = new HashMap<>();
        Map<String, HashSet<String>> reportMember = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            member_id.put(id_list[i], i);
            reportMember.put(id_list[i], new HashSet<>());
        }

        for(String rep : report) {
            String[] split = rep.split(" ");
            reportMember.get(split[1]).add(split[0]);
        }

        for(String key : reportMember.keySet()) {
            HashSet<String> reports = reportMember.get(key);
            if(reports.size() >= k) {
                for(String rep : reports) {
                    answer[member_id.get(rep)] += 1;
                }
            }
        }
        return answer;
    }
}

public class LV1_5 {
    public static void main(String[] args) {
        Test test = new Test();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        //String[] id_list = {"con", "ryan"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        //String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
        //int k = 2;
        int[] solution = test.solution(id_list, report, k);
        for(int result : solution)
            System.out.print(result + ",");
    }
}