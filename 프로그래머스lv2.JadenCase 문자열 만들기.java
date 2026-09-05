class Solution {
    public String solution(String s) {
        String[] words = s.split(" ",-1);
        String answer = "";
        for(int i=0; i<words.length; i++){
            if(words[i].isEmpty()){
                answer += " ";
    }       
            else {
                answer += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase()+ " ";
    }
}
        return answer.substring(0, answer.length() - 1);
    }
}
