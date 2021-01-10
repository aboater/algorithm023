class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hash_map = {}
        for i in nums:
            try:
                hash_map[i] += 1
            except:
                hash_map[i] = 1
        
        frequent = sorted(hash_map.items(), key=lambda item: item[1], reverse=True)
        
        result = []
        for i in range(k):
            result.append(frequent[i][0])
        
        return result
            