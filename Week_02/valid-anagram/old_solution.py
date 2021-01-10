class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dict1 = dict()
        dict2 = dict()
        for i in s:
            if dict1.get(i) is not None:
                dict1[i] += 1
            else:
                dict1[i] = 1
        for i in t:
            if dict2.get(i) is not None:
                dict2[i] += 1
            else:
                dict2[i] = 1
        for i, j in zip(dict1.keys(), dict2.keys()):
            try:
                if dict1[i] != dict2[i]:
                    return False
            except:
                return False
        else:
            if len(dict1) == len(dict2):
                return True
            else:
                return False