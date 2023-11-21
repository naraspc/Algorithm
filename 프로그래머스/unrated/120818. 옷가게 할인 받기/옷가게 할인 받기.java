class Solution {
    public int solution(int price) {
    double salePrice = 0;
        if (price < 100000) {
            salePrice = price;
        }else if ((price > 100000 && price < 300000) || price == 100000) {
            salePrice = price - price * 0.05;
        } else if (price < 500000) {
            salePrice = price - price * 0.1;
        } else {
            salePrice = price - price * 0.2;
        }
        return (int) salePrice;

    }
}