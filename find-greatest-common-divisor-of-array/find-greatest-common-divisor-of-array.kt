class Solution {
    fun findGCD(nums: IntArray): Int {
        nums.sort()
        var min = nums[0]
        var max = nums[nums.size - 1]
        var ans = 0
        for(i in 1..min){
            if((max % i)+(min % i) == 0 ){
                ans = i
                println(ans)
            }
        }
        return ans
    }
}