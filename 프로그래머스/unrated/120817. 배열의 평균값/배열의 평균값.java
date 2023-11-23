class Solution {
    public double solution(int[] numbers) {
         int a = 0;
        for (int number : numbers) {
            a += number;
        }
        return (double) a / numbers.length;
    } 
}