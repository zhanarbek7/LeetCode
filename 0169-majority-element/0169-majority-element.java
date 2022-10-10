class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num), map.get(num) + 1);
            } else map.put(num, 0);
        }
        Comparator<Integer> valueComparator = (k1, k2) -> map.get(k2).compareTo(map.get(k1));
        TreeMap<Integer,Integer> treeMap = new TreeMap<>(valueComparator);
        treeMap.putAll(map);
        return treeMap.entrySet().iterator().next().getKey();
    }
}