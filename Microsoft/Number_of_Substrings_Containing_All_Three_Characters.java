// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/

class Solution {
    public int numberOfSubstrings(String s) {
        
        int count = 0;
        
        //stores most recent(prev) index of a,b,c 
        int aidx = -1; 
        int bidx = -1; 
        int cidx = -1;
        
        for (int i = 0; i < s.length(); i++) { 
            
            if(s.charAt(i)=='a') {
                aidx = i; //update with latest index
                if(bidx > -1 && cidx > -1){
                    //min(bidx,aidx) -> all substrings generated from front
                    //+1 -> for itself
                    count += Math.min(bidx,cidx)+1;
                }
            } else if(s.charAt(i)=='b') { 
                bidx = i;
                if(aidx > -1 && cidx > -1){
                    count += Math.min(aidx,cidx)+1;
                } 
            } else { 
                cidx = i;
                if(bidx > -1 && aidx > -1){
                    count += Math.min(aidx,bidx)+1;    
                }
            } 
        } 
        
        return count;
    }
}
// Submission link:
// https://leetcode.com/submissions/detail/870602389/