class Solution {
    public String solution(String s) {
       
        String answer = ""; 
        int cnt = 0;
        String[] array = s.split(""); // s를 한단어씩 짤라서 배열에 저장

        for(String ss : array) { // 반복돌려서 
            cnt = ss.contains(" ") ? 0 : cnt + 1; // 공백이면 초기화
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); // 짝수일시 대문자 홀수일시 소문자 변환 
        }
      return answer;
  }
}