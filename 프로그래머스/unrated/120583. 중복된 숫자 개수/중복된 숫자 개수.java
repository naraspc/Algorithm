class Solution {
    public int solution(int[] array, int n) {
       int answer = 0;
        for (int j : array) {
            if (j == n) answer++;
        }
        return answer;

    } 
}
