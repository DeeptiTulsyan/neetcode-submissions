class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int[] alphabets=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            alphabets[c-'a']+=1;
        }
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            alphabets[c-'a']-=1;
            if(alphabets[c-'a']<0)
            return false;
        }
        return true;
    }
}
