import java.util.Arrays;

public class P16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = nums[0]+nums[1]+nums[2];
        int minDifference = Integer.MAX_VALUE;
        for(int i=0 ;i<nums.length;i++){
            int left  = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target)return sum;
                else if(sum<target)left++;
                else right--;

                int difToTarget= Math.abs(sum-target);
                if(minDifference>difToTarget){
                    resultSum = sum;
                    minDifference=difToTarget;
                }
            }
        }
        return resultSum;

    }
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
}
