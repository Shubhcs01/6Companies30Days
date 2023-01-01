class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int temp,a,b;
        for(String str:tokens){
            switch(str){
                case "+":
                    temp = st.pop()+st.pop();
                    st.push(temp);
                    break;
                case "-":
                    a = st.pop();
                    b = st.pop();
                    st.push(b-a);
                    break;
                case "*":
                    temp = st.pop()*st.pop();
                    st.push(temp);
                    break;
                case "/":
                    a = st.pop();
                    b = st.pop();
                    st.push(b/a);
                    break;
                default:
                    st.push(Integer.parseInt(str));
                    break;
            }
        }
        return st.peek();
    }
}