class Solution {
    public int solution(int slice, int n) {
           int answer = 0;
        int morePizza = 0;

        if (n % slice != 0) {
            morePizza = 1;
        }

        answer = n/slice +morePizza;


        return answer;
    }
}