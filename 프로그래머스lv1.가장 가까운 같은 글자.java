class Solution {
    public int[] solution(String s) {
        char[] c = s.toCharArray();
        int[] result = new int[s.length()];
        result[0] =-1;
        for(int i=1;i<s.length();i++){
            for(int j=i-1;j>=0;j--){
                if(c[i]==c[j]){
                    result[i] = i-j;
                    break;
                }
                result[i] = -1;
            }
        }
        return result;
    }
}
