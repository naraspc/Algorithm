import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (int i = 0, j = charArr.length - 1; i < j; i++, j--) {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
        }
        String answer = new String(charArr);
        return answer;
    }
}
