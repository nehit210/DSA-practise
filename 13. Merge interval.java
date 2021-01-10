class Solution 
{
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> arr = new LinkedList<>();
        for (int[] interval : intervals) 
        {
            if (arr.isEmpty() || arr.getLast()[1] < interval[0]) 
            {
                arr.add(interval);
            }
            else
            {
                arr.getLast()[1] = Math.max(arr.getLast()[1], interval[1]);
            }
        }
        return arr.toArray(new int[arr.size()][]);
    }
}
