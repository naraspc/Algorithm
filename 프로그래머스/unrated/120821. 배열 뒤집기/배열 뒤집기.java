
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] answer = new int[num_list.length];
        for (int i : num_list) {
            arr.add(i);
        }

        Collections.reverse(arr);

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}