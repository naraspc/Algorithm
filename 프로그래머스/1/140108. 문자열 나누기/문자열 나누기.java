class Solution {
    public int solution(String s) {
        

       char first = s.charAt(0); // 첫 번째 문자 기준
		int firstNum = 0; // 기준 문자의 개수
		int diff = 0; //기준 문자가 아닌 문자들의 개수
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (firstNum == diff) { // 만약 기준 문자의 개수와 아닌 문자들의 개수가 같을 경우 반환할 결과값을 증가시킨 후 기준 문자를 바꿔줌
				result++;
				first = s.charAt(i);
			}
			if (s.charAt(i) == first) firstNum++;
			else diff++;
		}
		return result;
	}
}