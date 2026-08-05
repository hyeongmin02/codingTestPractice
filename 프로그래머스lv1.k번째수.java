import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] k = new int [commands.length];
        int[] answer = new int [commands.length];
        for(int i=0;i<commands.length;i++){
            for(int j=0;j<commands[i].length;j++){
                k = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
                Arrays.sort(k);
                answer[i] = k[commands[i][2]-1];
            }
        }
        return answer;
    }
}
