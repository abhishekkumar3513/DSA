class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;
        int Curcount=0;
        int [] freq=new int[3];
        int left=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            freq[ch-'a']++;
            if(freq[ch-'a']==1){
                Curcount++;
            }
            while(Curcount==3){
                count+=(n-right);
                char c=s.charAt(left);
                freq[c-'a']--;
                if(freq[c-'a']==0){
                    Curcount--;
                }
                left++;
            }
        }
        return count;
    }
}