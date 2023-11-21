class Solution {
    public int solution(int n) {
        int result1 = (int) Math.sqrt(n);
        double result = Math.sqrt(n);
        int price = 2;
        if (result1 == result) {
            price = 1;
        }
        return price;
    }
}