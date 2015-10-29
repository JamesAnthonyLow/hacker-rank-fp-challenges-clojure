###[Problem:](https://www.hackerrank.com/challenges/fp-sum-of-odd-elements)
Return sum of odd elements from a list.

**Sample Input:** ```'(3 2 4 6 5 7 8 0 1)```

**Sample Output:** ```16```

###Solution
```clojure
(fn [lst] (reduce #(if (odd? %2) (+ %1 %2) %1) 0 lst))
```
