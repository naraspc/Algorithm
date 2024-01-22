class Solution {
    public int solution(int a, int b, int n) {
        int temp = 0; //temp 
		int num = n; // n값 조작할 인트 선언

        while(num >= a) { // 빈병이 a보다 적으면 의미없음
            temp += num / a * b; // 빈병 개수 구하기 
            num = num / a * b + num % a;
        }
		return temp;
    }


}