import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int idx = 0;
        for(int[] cmd: commands){
        
            int[] tmp = Arrays.copyOfRange(array, cmd[0]-1, cmd[1]);

            Arrays.sort(tmp);

            answer[idx] = tmp[cmd[2] -1];

            idx++;
            
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int [] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution s = new Solution();
        s.solution(array, commands);
        // solution(array,commnads))
    }
}