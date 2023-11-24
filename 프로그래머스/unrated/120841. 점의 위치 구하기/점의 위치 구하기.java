class Solution {
    public int solution(int[] dot) {
      int left_negative = 0;
        int left_positive = 0;
        int right_negative = 0;
        int right_positive = 0;
        int answer = 0;

        for (int i = 0; i < dot.length; i++) {

            if (i == 0) {
                if (dot[i] <= 0) {
                    left_negative++;
                } else {
                    left_positive++;
                }
            } else {
                if (dot[i] <= 0) {
                    right_negative ++;
                } else {
                    right_positive ++;
                }
            }
        }
        return (findPositon(left_negative,left_positive,right_negative,right_positive));




    }
    public int findPositon(int left_negative,int left_positive, int right_negative, int right_positive) {
        int answer = 0;
        if (left_negative > 0 && right_negative > 0) {
            answer = 3;
        } else if (left_positive > 0 && right_positive > 0) {
            answer = 1;
        } else if (left_negative > 0 && right_positive > 0) {
            answer = 2;
        } else
            answer = 4;

        return answer;
    }
}