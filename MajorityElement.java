public class MajorityElement {
    public int majorityElement(int[] nums) {
        int res = 0, count = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == nums[res])
                count++;
            else
                count--;
            if(count == 0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[res] == nums[i])
                count++;
        }
        if(count < nums.length/2)
            return -1;
        return nums[res];
    }
}
