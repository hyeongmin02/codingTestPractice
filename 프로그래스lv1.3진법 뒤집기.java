import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        int answer=0;
        while(n>0){
            list.add(n%3);
            n/=3;
        }
        for(int i=0;i<list.size();i++){
            answer+=list.get(i) * Math.pow(3,list.size()-i-1);   
        }
        return (int)answer;
    }
}
