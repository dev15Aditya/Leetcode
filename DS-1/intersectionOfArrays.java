import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 ={2,2};
        int[] k = intersect(nums1, nums2);
        for(int n:k){
            System.out.print(n+" ");
        }
    }
    public static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> arr = new ArrayList<>();
        
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] output = new int[arr.size()];
        int k =0;
        while(k<arr.size()){
            output[k] = arr.get(k);
            k++;
        }
        return output;
    }
}
