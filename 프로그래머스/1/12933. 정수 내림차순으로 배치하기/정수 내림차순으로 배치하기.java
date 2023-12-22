import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {

        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();

        for(String s : str)
            answer.append(s);
        
        return Long.parseLong(answer.toString());
    }
}