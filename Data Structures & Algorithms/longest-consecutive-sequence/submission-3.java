class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> a = new HashSet<>();

        for (int num : nums) {
            a.add(num);
        }

        int max = 0;

        for (int num : a) {

            if (!a.contains(num - 1)) {   
                int current = num;
                int count = 1;

                while (a.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}