class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int max=0;
         HashSet<Character> a=new HashSet<>();
         for(int i=0;i<s.length();i++){
           while(a.contains(s.charAt(i))){
            a.remove(s.charAt(count));
            count++;
           }
           a.add(s.charAt(i));
           max=Math.max(max,i-count+1);
         }
         return max;
    }
}
