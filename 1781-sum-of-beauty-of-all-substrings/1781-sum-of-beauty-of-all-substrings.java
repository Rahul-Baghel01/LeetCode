class Solution{
    public int beautySum(String s){
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            int max=0;
            for(int j=i;j<s.length();j++){
                int idx=s.charAt(j)-'a';
                freq[idx]++;
                max=Math.max(max,freq[idx]);

                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0) min=Math.min(min,freq[k]);
                }
                ans+=max-min;
            }
        }
        return ans;
    }
}