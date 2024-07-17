// public class arrayp2 {
//     class Solution {
//         public int search(int[] arr, int target) {
//             int low = 0;
//             int high = arr.length - 1;
    
//             while(low <= high)
//             {
//                 int mid = (high+low)/2;
    
//                 if(arr[mid] == target)
//                 {
//                     return mid;
//                 }
    
//                 if(arr[low] <= arr[mid])
//                 {
//                     if(arr[low]<=target && target <= arr[mid])
//                     {
//                         high = mid - 1;
//                     }
//                     else
//                     {
//                         low = mid + 1;
//                     }
//                 }
    
//                 else
//                 {
//                     if(arr[mid] <= target  &&  target <= arr[high])
//                     {
//                         low = mid+1;
//                     }
//                     else
//                     {
//                         high=mid-1;
//                     }
//                 }
//             }
//             return -1;
    
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,0,5};
//         int  target = 3;
//         search(target);
//     }
// }

public class arrayp2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] rotatedArray1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int result1 = solution.search(rotatedArray1, target1);
        printResult(target1, result1);

        // Example 2
        int[] rotatedArray2 = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int target2 = 6;
        int result2 = solution.search(rotatedArray2, target2);
        printResult(target2, result2);
    }

    private static void printResult(int target, int result) {
        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}

class Solution {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
