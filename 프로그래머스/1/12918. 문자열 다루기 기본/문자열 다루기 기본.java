class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false; // s의 길이가 4나 6이 아니면 false
        for(int i = 0; i<s.length(); i ++) { // s길이만큼 회전
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false; // i가 0과 9 사이의 숫자가 아니라면 false
        } 
        return true; // 나머지 경우의수는 true
    }
}