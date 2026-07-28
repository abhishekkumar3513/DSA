class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        int sum=0;
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            String op=operations[i];
            if(op.equals("+")){
                int last=stack.pop();
                int secondlast=stack.peek();
                stack.push(last);
                stack.push(last+secondlast);
            }
            else if(op.equals("D")){
                int last=stack.peek();
                stack.push(2*last);
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else{
                int num=Integer.parseInt(op);
                stack.push(num);
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}