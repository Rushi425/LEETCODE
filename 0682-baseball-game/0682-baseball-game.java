class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> res = new Stack<>();

        for(String a: operations){
            if(a.equals("+")){
                int val1 = res.peek();
                res.pop();
                int val2 = res.peek();
                res.add(val1);
                res.add(val1 + val2);
            }
            else if(a.equals("D")){
                int val = res.peek();
                res.add(2 * val);
            }
            else if(a.equals("C")){
                res.pop();
            }
            else{
                res.add(Integer.parseInt(a));
            }
        }
        int sum = 0;
        for(int i: res){
            sum += i;
        }
        return sum;
    }
}