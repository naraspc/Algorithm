import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
       int[] answer = new int[commands.length]; // answer 선언

		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); 
            //commands[i][0] - 1에서 commands[i][1] - 1까지의 범위를 복사하여 temp에 저장
            					   

			Arrays.sort(temp); // 배열 오름차순 정렬
			answer[i] = temp[commands[i][2] - 1]; // 범위내의 숫자를 answer[i]에 저장
		}
		return answer; // answer 출력
	}
}