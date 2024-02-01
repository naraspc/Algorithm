class Solution {
    public int solution(int number, int limit, int power) {
        
//약수는 두 수의 곱이 자기 자신이 되는 것이기 때문에 제곱수를 제외하면 한 쌍으로 갖는다.
//약수 개수가 홀수개일 경우 약수의 개수는 가운데 수를 기준으로 같은 값을 같는다.
//약수 개수가 짝수개일 경우 약수의 개수는 서로 대응된다.
        
        int answer = 0;
        
        for(int i=1;i<=number;i++){ //기사의 명수만큼 회전
            int cnt = 0; // 약수의개수
            for(int j=1;j*j<=i;j++){ // 제시된 수의 제곱근까지만 회전하여 약수찾기
                if(j*j==i) cnt++;
                else if(i%j==0) cnt+=2;  
            }
            
            if(cnt>limit) cnt = power; // 리미트에 걸리면 설정한 공격력의 무기로 세팅
            answer += cnt; //무게와 공격력은 1:1 관계이므로 +하여 저장
        }
        
        return answer; //무게출력 
    }
}

