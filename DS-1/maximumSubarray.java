public class maximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] arr){
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i =0; i<arr.length;i++){
            sum += arr[i];
            max = Math.max(sum,max);
            if(sum<0) sum = 0;
        }
        return max;
    }
}
