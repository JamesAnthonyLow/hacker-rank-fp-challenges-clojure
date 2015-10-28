###[Problem:](https://www.hackerrank.com/challenges/fp-array-of-n-elements)
Create an array of N integers, where N is specified as input.
*[Looks like a job for ```lazy-seq```!](https://clojuredocs.org/clojure.core/lazy-seq)

**Sample Input:** ```3```

**Sample Output:** ```[1 2 3]```

###Solution
```clojure
(fn [num]
  (vec (take num ((fn ints ([] (ints 1))
                    ([n] (cons n (lazy-seq 
                                 (ints (inc n))))))))))
```
