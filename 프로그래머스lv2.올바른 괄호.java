class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') open++;
            else open --;
            if(open<0) {
                answer = false;
                break;
            }
        }
        if(open==0) answer=true;
        else answer= false;
        return answer;
    }
}
