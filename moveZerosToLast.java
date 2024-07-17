public class moveZerosToLast {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                // swap(nums[i], nums[count]);
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
    }
}
