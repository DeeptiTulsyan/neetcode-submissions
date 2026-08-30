class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start=newInterval[0];
        int end=newInterval[1];
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            int st=intervals[i][0];
            int en=intervals[i][1];
            if(en<start)
            {
                list.add(intervals[i]);
            }
            else if(st>end)
            {
                list.add(new int[]{start,end});
                for(int j=i;j<intervals.length;j++)
                {
                    list.add(intervals[j]);
                }
                return list.toArray(new int[list.size()][]);
            }
            else
            {
                start=Math.min(st,start);
                end=Math.max(end,en);
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}
