class Solution {
    public int[] solution(int money) {

    int price = 5500;
    int exchange = 0;
    int coffee = 0;

    
    coffee = money / price;
    exchange = money - coffee*price;


        return new int[]{coffee, exchange};
    }
}