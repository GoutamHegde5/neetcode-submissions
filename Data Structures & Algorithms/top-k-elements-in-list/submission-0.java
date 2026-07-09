

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> ab = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!ab.containsKey(nums[i])) {
                ab.put(nums[i], 1);
            } else {
                ab.put(nums[i], ab.getOrDefault(nums[i], 0) + 1);
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int element = 0;

            for (int key : ab.keySet()) {
                if (ab.get(key) > maxFreq) {
                    maxFreq = ab.get(key);
                    element = key;
                }
            }

            ans[i] = element;
            ab.remove(element);
        }

        return ans;
    }
}