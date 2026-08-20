class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        if(strs.length==0)
        return res;
        boolean visString[]=new boolean[strs.length];
        for(int i=0;i<strs.length;i++)
        {
            String s=strs[i];
            if(visString[i]==false)
            {
             List<String> sublist=new ArrayList<>();
             sublist.add(s);
            for(int k=i+1;k<strs.length;k++)
            {
                boolean isAnagram=true;
                int[] alphabets=new int[26];
                String str=strs[k];
                if(s.length()!=str.length())
                continue;
                for(int j=0;j<s.length();j++)
                {
                    char c=s.charAt(j);
                    alphabets[c-'a']+=1;
                }
                for(int j=0;j<str.length();j++)
                {
                    char c=str.charAt(j);
                    alphabets[c-'a']-=1;
                    if(alphabets[c-'a']<0)
                    {
                    isAnagram=false;
                    break;}
                }
                if(isAnagram)
                {
                    visString[k]=true;
                    sublist.add(str);
                }
                
            }
            res.add(sublist);
            
            }
        }
        return res;
    }
}
