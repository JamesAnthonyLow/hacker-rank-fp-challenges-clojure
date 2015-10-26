###[Problem](https://www.hackerrank.com/challenges/fp-hello-world-n-times)
Write a function that prints "Hello world" N times.

###Solution
```clojure
((fn [n]
(dotimes [n n] (println "Hello World")))
```
