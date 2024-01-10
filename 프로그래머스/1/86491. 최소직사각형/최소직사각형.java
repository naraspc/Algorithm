class Solution {
    public int solution(int[][] sizes) {
        int max_high = 0;
        int max_length = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int length = Math.max(sizes[i][0],sizes[i][1]);
            int high = Math.min(sizes[i][0],sizes[i][1]);
            max_high = Math.max(max_high,high);
            max_length = Math.max(max_length,length);
            
        }
        return max_high * max_length;
    }
}