class Solution {
    Set<Integer> intersection = new HashSet<>();
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0; 

  // to traverse the arrays
  while (i < nums1.length && j < nums2.length) {
      
    //if current element in i is smaller
    if (nums1[i] < nums2[j]) { 
      i++;
    } else if (nums2[j] < nums1[i]) {
      j++;
    } else {
    
      //both elements are equal
      intersection.add(nums1[i]);
      i++;
      j++;
    }
  }
  int k = intersection.size();
  int[] res = new int[k];
  int cur = 0;
for(int x : intersection){
    res[cur++] = x;
}
return res;
}    
    }
