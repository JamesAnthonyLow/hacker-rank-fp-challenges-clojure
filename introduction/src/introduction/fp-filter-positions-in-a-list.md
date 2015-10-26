###[Problem:](https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list)
For given list with n integers, return a new list removing the elements at odd positions.

**Sample Input:** ```'(2 5 3 4 6 7 9 8)```

**Sample Output:** ```(5 4 7 8)```

Output should remain in original order

###Solution
```clojure
(fn [lst]
  (keep-indexed #(if (odd? %1) %2) lst))
```
