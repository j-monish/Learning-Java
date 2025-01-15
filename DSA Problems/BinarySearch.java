//  Binary Search
// import java.util.*;
// class Solution {
//     public int search(int[] nums, int target) {
//         int low = 0;
//         int high = nums.length - 1;
//         int mid = -1;
//         while(low<=high){
//             mid = low + ((high - low)/2);
//             if(nums[mid] == target){
//                 return mid;
//             }
//             else if(nums[mid] <= target){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         return -1;



// Find First and Last Position of Element in Sorted Array

// class Solution {
//     int findFirstOccurence(int[] nums, int target){
//         int low = 0;
//         int high = nums.length - 1;
//         int mid = -1;
//         int res_1 = mid;
//         while(low<=high){
//             mid = low + ((high - low)/2);
//             if(nums[mid] == target){
//                 res_1 = mid;
//                 high = mid - 1; 
//             }
//             else if(nums[mid] <= target){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         return res_1;
//     }
//     int findLastOccurence(int[] nums, int target){
//         int low = 0;
//         int high = nums.length - 1;
//         int mid = -1;
//         int res_2 = mid;
//         while(low<=high){
//             mid = low + ((high - low)/2);
//             if(nums[mid] == target){
//                 res_2 = mid;
//                 low = mid + 1; 
                
//             }
//             else if(nums[mid] <= target){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         return res_2;
//     }
//     public int[] searchRange(int[] nums, int target) {
//         int[] result = {-1, -1};
//         int firstOccurence = findFirstOccurence(nums, target);
//         int lastOccurence  = findLastOccurence(nums,target);
//         result [0] = firstOccurence;
//         result [1] = lastOccurence;
//         return result;
//         }
// }



// Number of occurrence of given element in sorted array.
// class Solution {
//     // code here
//     int findFirstOccurence(int[] arr, int target){
//     int low = 0;
//     int high = arr.length - 1;
//     int mid = -1;
//     int res_1 = mid;
//     while(low<=high){
//         mid = low + ((high - low)/2);
//         if(arr[mid] == target){
//             res_1 = mid;
//             high = mid - 1; 
//         }
//         else if(arr[mid] <= target){
//             low = mid + 1;
//         }
//         else{
//             high = mid - 1;
//         }
//     }
//     return res_1;
// }
// int findLastOccurence(int[] arr, int target){
//     int low = 0;
//     int high = arr.length - 1;
//     int mid = -1;
//     int res_2 = mid;
//     while(low<=high){
//         mid = low + ((high - low)/2);
//         if(arr[mid] == target){
//             res_2 = mid;
//             low = mid + 1; 
            
//         }
//         else if(arr[mid] <= target){
//             low = mid + 1;
//         }
//         else{
//             high = mid - 1;
//         }
//     }
//     return res_2;
// }
//     int countFreq(int[] arr, int target) {
//     int firstOccurence = findFirstOccurence(arr, target);
//     int lastOccurence  = findLastOccurence(arr,target);
//     int result;
//     if (lastOccurence == -1 || firstOccurence == -1){
//         result = 0;
//     }
//     else {
//         result = lastOccurence - firstOccurence + 1;
        
//     }
//     return result;
        
// }
// }




// Find Kth Rotation
                //  MAIN LOGIC: The Kth rotation is equal to the index of the minimum element.
        // class Solution {
//     public int findKRotation(List<Integer> arr) {
//         int low = 0;
//         int high = arr.size() - 1;
//         int n = arr.size();
        
//         while (low <= high){

                // Array was already sorted if  low element is less than high element.
//             if ((arr.get(low) <= arr.get(high))){
//                 return low;
//             }
            
//             int mid = low + ((high - low)/2);
                
                //Checking mid with its left and right elements,
                // if mid is less than both of them, then it's the minimum element of array. 
//             int prev = (mid + n - 1)%n;
//             int next = (mid + 1)%n;
//             if (arr.get(mid) <= arr.get(prev) && arr.get(mid) <= arr.get(next)){
//                 return mid;
//             }

                // To continue to minimize the search space we use this else statement. 
                // IMP : Minimum element will lie in the unsorted array only,
                //       so to ensure we are searching in this space only,
                //       we use the if and else statements. 
//             else{
//                 if(arr.get(low) <=arr.get(mid)){
//                     low = mid + 1;
//                 }
// 
//                 else{
//                     high = mid -1;
//                 }
//             }
//         }
//         return -1;
//     }
// }



// Floor in a Sorted Array
// class Solution {
//     static int findFloor(int[] arr, int k) {
//         int low = 0;
//         int high = arr.length - 1;
//         int mid = -1;
//         int result = -1;
//         if( k < arr[low]){
//             return -1;
//         }
//         while(low<=high){
//             mid = low + ((high - low)/2);
//             if(arr[mid] <= k){
//                 low = mid+1;
//                 result = mid;
                 
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         return result;
//     }
// }