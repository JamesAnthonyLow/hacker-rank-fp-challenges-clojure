###[Problem:](https://www.hackerrank.com/challenges/fp-reverse-a-list)
Reverese a list without using the reverse function.

**Sample Input:** ```'(19 22 3 28 26 17 18 4 28 0)```

**Sample Output:** ```'(0 28 4 18 17 26 28 3 22 19)```

###Solution
```clojure
(fn [lst]
  (reduce (fn [new-lst item]
            (cons item new-lst))
          '() lst))
```
