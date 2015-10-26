###[Problem](https://www.hackerrank.com/challenges/fp-list-replication)
Given a list create a duplicate list containing each element n times.

###Solution
```clojure
(fn [num lst]
  (reduce 
    (fn [new-lst elem]
      (concat (repeat num elem) new-lst))
    '() (reverse lst)))
```
