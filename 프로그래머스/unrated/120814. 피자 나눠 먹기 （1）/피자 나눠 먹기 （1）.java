class Solution {
    public int solution(int n) {
        int morePizza = 0;
        
             if (n % 7 != 0) {
            morePizza = 1;
        }
       
        
        
        return n/7 + morePizza;
    }
}