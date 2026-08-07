class Solution {
    public String solution(String s, int n) {
        char [] k = s.toCharArray();
        for(int i=0;i<k.length;i++){
            if(k[i]==' ') continue;
            if(Character.isLowerCase(k[i])){
            k[i]=(char)((k[i]-'a'+ n) %26 +'a');
            }
            if(Character.isUpperCase(k[i])){
                k[i]=(char)((k[i]-'A'+ n) %26 +'A');
            }
        }
        return new String (k);
    }
}
