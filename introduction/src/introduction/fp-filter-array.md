###[Problem:](https://www.hackerrank.com/challenges/fp-filter-array)
Implement a function that takes an array and filters out the values that are greater than a specified delimiter. 

**Sample Input:** ```3 '(10 9 8 2 7 5 1 3 0)```

**Sample Output:** ```(2 1 0)```

Output should remain in original order

###[Solution]
```clojure
(fn[delim lst]
  (loop[coll [] [num & rest] lst]
    (if num
      (recur (if (< num delim) (conj coll num) coll) rest)
      coll))) 
```
