###[Problem](https://www.hackerrank.com/challenges/fp-list-replication)
Given a list print each element of the list n times.

###Solution
```clojure
(fn [num lst] 
 (loop [[first & rest] lst]
  (dotimes [n num] (println first))
  (if rest (recur rest))))
```
