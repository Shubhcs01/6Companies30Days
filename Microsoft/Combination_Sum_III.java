class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        //Levels and Options Approach
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list  = new ArrayList<>();
        helper(1,0,k,n,ans,list);
        return ans;
    }
    
    private void helper(int num ,int sum, int k, int n,List<List<Integer>> ans, List<Integer> list){
        
        if(sum==n && k==0){
          ans.add(new ArrayList<>(list));
        }
        
        if(k==0 || sum > n) return;
        
        //Options to choose
        for (int i = num; i <= 9; i++) {
            list.add(i); //include
            sum += i;
            helper(i+1,sum,k-1,n,ans,list);
            list.remove(list.size()-1); //exclude
            sum -= i;
        }
    }
}