
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import javax.management.Query;

class Solution {
    private int count = 1;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        set.addAll(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        Queue<String> dque = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        dque.addLast(beginWord);
        bfs(endWord, wordList, dque, visited);
        return count;
    }
    
    private void bfs(String endWord, List<String> wordList, Deque<String> dque, Set<String> visited) {
        if (dque.size() == 0) {
            return;
        }
        int n = dque.size();
        
        for (int i = 0; i < n; i++) {
            for (String item : wordList) {
                if (!visited.contains(item) && isNext(dque.pollFirst(), item)) {
                    count++;
                    if (endWord.equals(item)) {
                        return;
                    } else {
                        visited.add(item);
                        dque.push(item);
                    }
                }
            }
        }
        bfs(endWord, wordList, dque, visited);
    }

    private boolean isNext(String start, String end) {
        int countDef = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != end.charAt(i)) {
                countDef++;
            }
        }
        return countDef == 1;
    }
}