class Solution {
    public int solution(int slice, int n) {
        
        int morePizza = 0;

        if (n % slice != 0) {
            morePizza = 1;
        }


        return n/slice +morePizza;

    }
}