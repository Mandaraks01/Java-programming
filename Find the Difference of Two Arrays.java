Class solution{
public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<Integer> first = new ArrayList<>();
    List<Integer> second = new ArrayList<>();
    for (int i = 0; i < nums1.length; i++) {
        if (!contains(nums2, nums1[i]) && !first.contains(nums1[i])) {
            first.add(nums1[i]);
        }
    }
    for (int i = 0; i < nums2.length; i++) {
        if (!contains(nums1, nums2[i]) && !second.contains(nums2[i])) {
            second.add(nums2[i]);
        }
    }
    List<List<Integer>> result = new ArrayList<>();
    result.add(first);
    result.add(second);
    return result;
}
 
private static boolean contains(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            return true;
        }
    }
    return false;
}
