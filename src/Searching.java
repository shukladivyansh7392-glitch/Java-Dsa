//public class Searching {

//    public int binarySearch(int[] arr, int target){
//        int n = arr.length;
//        int start = 0;
//        int end = n-1;
//        while (start <= end){
//            int mid = start + (end - start) / 2;
//            //compare target with midvalue
//            if(target == arr[mid]){
//                //return mid
//                return mid;
//            }
//            else if(target > arr[mid]){
//                //got to right side
//                start= mid+1;
//            }
//            else{
//                //agar target chhota hai mid value se
//                end = mid-1;
//            }
//            //update mid
//            mid = start + (end - start) / 2;
//        }
//        //agar aap yha tk a gaye hai to iska matlab
//        //Target is not found
//        return -1;
//    }
//
//    static int  getLowerBound(int[] arr, int target){
//        int n = arr.length;
//        int start = 0;
//        int end = n-1;
//        int ans = -1;
//
//        while(start <= end){
//            int mid = start + (end-start) / 2;
//
//            if(arr[mid] >= target){
//                //ans store
//                ans = mid;
//                        //move to left
//                end = mid -1;
//            }
//            else {
//                //right move
//                start = mid + 1;
//            }
//        }
//        return ans;
//
//    }
//
//    public static int getUpperBound(int[] arr, int traget) {
//        int n = arr.length;
//        int s = 0;
//        int e = n-1;
//        int ans = -1;
//
//        while(s <= e){
//            int mid = s + (e-s) /2;
//
//            if(arr[mid] <= traget){
//                //right move
//                s = mid + 1;
//            }
//            else {
//                //arr[mid] >= target
//                //ans store
//                ans = mid;
//                //left move
//                e = mid - 1;
//            }
//            }
//        return ans;
//    }
////public static int findPivotIndex(int[] nums){
////        int n = nums.length;
////        int s = 0;
////        int e = n-1;
////        int ans = -1;
////
////        if(nums[s] < nums[e]){
////            //no effective rotation
////            return -1;
////        }
////
////        //binary search wala logic
////    while(s <= e){
////        int mid = s+(e-s)/2;
////        if(nums[mid] < nums[n-1]){
////            //iska matlab ham l2 bali line par hai
////            //answer to L1 bali paar hai
////            //iska matlb move to l1, or left
////            e = mid -1;
////        }
////        else{
////            //mid mera l2 par hai hi already
////            //ans store
////            ans = mid+1;
////            //move to right
////        }
////    }
////    return ans;
////}
//
//    public static int findPivotIndex(int[] nums) {
//        int n = nums.length;
//        int s = 0;
//        int e = n - 1;
//        int ans = -1;
//
//        if (nums[s] < nums[e]) {
//            // no effective rotation
//            return -1;
//        }
//
//        while (s <= e) {
//
//            int mid = s + (e - s) / 2;
//
//            if (nums[mid] < nums[n - 1]) {
//                // mid L2 wali line par hai
//                // answer left side mein hai
//                e = mid - 1;
//            }
//            else {
//                // mid L1 wali line par hai
//                ans = mid;
//
//                // right side move karo
//                s = mid + 1;
//            }
//        }
//
//        return ans;
//    }
//
//
//    public int search(int[] nums, int target){
//        int pivoteIndex = findPivotIndex(nums);
//        int n = nums.length;
//
//        //if pivoteindex == -1, then array is alredy sorted
//        if(pivoteIndex == -1){
//          //  int ans = binarySearch(nums, 0, n-1, target);
//       //     return ans;
//        }
//        else{
//            //array is not sorted, array is sorted
//
//            //array can be devided l1 and l2 bala logic
//
//            //indexes for L1 wala array ka part
//            int startArray1 = 0;
//            int endArray1 = pivoteIndex;
//            if(target >= nums[startArray1] && target <= nums[endArray1]){
//                int ans = binarySearch(nums, startArray1, endArray1, target);
//                return ans;
//            }
//
//
//            //indexs for L2 wala array ka part
//            int startArray2 = pivoteIndex+1;
//            int endArray2 = n-1;
//            if(target >= nums[startArray2] && target <= nums[startArray2]){
//                int ans = binarySearch(nums, startArray2, endArray2, target);
//                return ans;
//            }
//        }
//        return -1;
//
//
//    }
//
//   public static void main(String[] args) {
//        int[] nums = {50,60,70,10,20,30,40};
//        System.out.println("Find Pivot Index :- "+findPivotIndex(nums));
//
////        int[] arr = {10,20,30,30,30,30,30,40,50};
////        int target = 30;
////        int ans = (getUpperBound(arr, target));
////        System.out.println("ans :- " + ans);
//
//
//
//
//
//
////        int[] arr = {10,20,30,40,50,60,70,80};
////        int target = 50;
////        Searching obj = new Searching();
////        int result = obj.binarySearch(arr, target);
////        System.out.println("Index: "+ result);
//    }
//
//
//
//
//
//}
