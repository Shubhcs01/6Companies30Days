// https://leetcode.com/problems/bulls-and-cows/

class Solution {
    public String getHint(String secret, String guess) {
        int cow=0,bull=0;
        int[] arr = new int[10];
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
            } else {
                if(arr[secret.charAt(i)-'0'] < 0) cow++;
                if(arr[guess.charAt(i)-'0'] > 0) cow++;
                arr[secret.charAt(i)-'0']++;
                arr[guess.charAt(i)-'0']--;
            }
        }
        
        return (""+bull+"A"+cow+"B");
    }
}