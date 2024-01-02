class Solution {
    public int solution(int num) {
        long n = num;
        int answer = 0;
        while(n != 1) {
            answer ++;
            if (n % 2 == 0) {
                n = n/2;
            } else if (n == 1) {
                break;
            } else {
                n = (n * 3) + 1 ;
            }
            if (answer >= 500) {
                answer = -1;
                break ;
            }
        }
            return answer;
            
        
    }
}