class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int yang = 0;
        int drink = 0;
        int service = 0;
        int temp = 0;
        

        
        for (int i=0; i < n ; i++ ){
            yang += 12000;
            temp ++;
            if (temp == 10) {
                service ++;
                temp = 0;
            }
        }
        for (int j=0; j < k ; j++ ){
            drink += 2000;
        }
        
        
        
        answer = yang + drink - service * 2000;
        return answer;
    }
}