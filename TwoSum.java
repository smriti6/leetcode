class TwoSum {
    public static void main(String[] args) {

    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    // You can return the answer in any order.
    // Example 1:

    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        System.out.println("Two Sum");
        int nums[]={2,5,5,11};
        int target =10;
        int t[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    t[0]=i;
                    t[1]=j;
                }
            }
        }
        System.out.println(t[0]+" "+t[1]);
    }
}