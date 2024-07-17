import java.util.HashSet;

class DuplicateNumber{
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int arr : nums){
            if(!hs.contains(arr)){
                hs.add(arr);
            }else
                return arr;
        }
        
        return -1;
    }
}