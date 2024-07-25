package leetcode;/*
Given a sorted array of distinct integers and a target value,
 return the index if the target is found.
  If not, return the index where it would be if it were inserted in order.

Farklı tamsayılardan oluşan sıralanmış bir dizi ve bir hedef değer verildiğinde,
hedef bulunursa dizini döndürün. Değilse, dizini sırayla eklenmiş olsaydı olacağı yere döndürün.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

        1 <= nums.length <= 104
        -104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
        -104 <= target <= 104
*/


public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] nums1 = {1,3,5,6,10,12,45,60,100};
        int target2 = 50;

        System.out.println(searchInsert2(nums1, target2));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (nums[i] > target) {

                    return i;
                }else if (i == nums.length - 1){
                    return i+1;
                }
            }

        }
        return 0;

    }

    public static int searchInsert2(int[] nums, int target) {
        //Input: nums = [1,3,5,6,10,12,45,60,100], target = 2
        //Input: nums = [0,1,2,3,4 ,5 ,6 ,7 ,8], target = 2
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}
