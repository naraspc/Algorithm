class Solution {
    public int solution(int[] numbers) {
           int first = numbers[0];
        int second = 0;

        for (int i = 1; i < numbers.length ; i ++) {
            if ( numbers[i] > first ) {
                second = first;
                first = numbers[i];
            }else if (numbers[i] > second) {
                        second = numbers[i];

                }



        }
        return first * second;
    }
}