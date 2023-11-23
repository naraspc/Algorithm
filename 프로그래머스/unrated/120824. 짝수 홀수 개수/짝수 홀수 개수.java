class Solution {
    public int[] solution(int[] num_list) {
       int a = 0;
        int b = 0;
        for (int j : num_list) {
            if (j % 2 == 0) {
                a++;
            } else b++;
        }

        return new int[]{a,b};
    }
}