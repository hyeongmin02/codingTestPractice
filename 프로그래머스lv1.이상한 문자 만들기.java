class Solution {
    public String solution(String s) {
        char[] array = s.toCharArray();
        int idx =0;
        for(int i=0;i<array.length;i++){
            if(array[i] == ' '){
                idx=0;
                continue;
            }
            if(idx%2!=0) array[i] = Character.toLowerCase(array[i]);
            if(idx%2 == 0) array[i] = Character.toUpperCase(array[i]);
            idx++;
        }
        return new String (array);
    }
}
