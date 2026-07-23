
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        for(int index = 0; index < nums.length / 2; ++index) {
            int temp = nums[index];
            nums[index] = nums[nums.length -1 - index];
            nums[nums.length -1 - index] = temp;

        }
        int elemcounted = 1;
        int prevelem = nums[0];
        for(int index = 1; index < nums.length; ++index){
            if(nums[index] != prevelem){
                elemcounted +=1;
                prevelem = nums[index];

            }
            if(elemcounted == 3){
                return nums[index];
            }
        }
        return nums[0];
        }

    }
