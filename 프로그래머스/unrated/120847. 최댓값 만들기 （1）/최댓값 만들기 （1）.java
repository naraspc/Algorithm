class Solution {
    public int solution(int[] numbers) {
          int sum = 0 ;


            for (int i = 0; i < numbers.length ; i ++) {

                for(int j = 0; j < numbers.length ; j ++) {

                    if ( j == i ) {
                        break;
                    } else if (numbers[i] * numbers[j] > sum) {
                        sum = numbers[i] * numbers[j];
                    } else continue;
                    
                    }


        }
        return sum;

    }
}