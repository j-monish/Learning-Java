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







