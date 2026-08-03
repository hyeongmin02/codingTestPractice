import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum=0;
        int cnt=0;
        for(int i=0;i<d.length;i++){
            if(sum<=budget){
                sum+=d[i];  
                if(sum<=budget) cnt++;
            }
            if(sum>budget) break;
            
        }
        return cnt;
    }
}
