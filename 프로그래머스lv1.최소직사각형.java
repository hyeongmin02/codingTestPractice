class Solution {
    public int solution(int[][] sizes) {
        int lllong = sizes[0][0];
        int ssshort = 0;
        for(int i=0;i<sizes.length;i++){
            if(lllong<Math.max(sizes[i][0],sizes[i][1])) lllong = Math.max(sizes[i][0],sizes[i][1]);
            if(ssshort<Math.min(sizes[i][0],sizes[i][1])) ssshort = Math.min(sizes[i][0],sizes[i][1]);
        }
        int answer = lllong*ssshort;
        return answer;
    }
}
