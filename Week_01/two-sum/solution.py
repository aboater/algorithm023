class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        int_map = {}
        for i in range(len(nums)):
            other_num = target - nums[i]
            try:
                return [int_map[other_num], i]
            except:
                int_map[nums[i]] = i