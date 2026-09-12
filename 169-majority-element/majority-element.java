class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int answer=nums[0];
        int max=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                answer=entry.getKey();
            }
        }
        return answer;
    }
}