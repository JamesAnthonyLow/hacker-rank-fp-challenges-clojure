###[Problem](https://www.hackerrank.com/challenges/fp-list-replication)
Given a list print each element of the list n times.

**Sample Input:** ```3 '(1 2 3 4)```

**Sample Output:** ```(1 1 1 2 2 2 3 3 3 4 4 4)```

###Solution
```clojure
(fn [num lst] 
 (loop [[first & rest] lst]
  (dotimes [n num] (println first))
  (if rest (recur rest))))
```
