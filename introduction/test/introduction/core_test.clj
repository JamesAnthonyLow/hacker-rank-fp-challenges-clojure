(ns introduction.core-test
  (:require [clojure.test :refer :all]
            [introduction.core :refer :all])
  (load "fp-filter-array")
  (load "fp-hello-world")
  (load "fp-hello-world-n-times"))

;;fp-hello-world
(deftest my-fp-hello-world
  (is
    (= (with-out-str (introduction.core/fp-hello-world))
       "Hello World\n" ) "Should print out Hello World\n"))

;;fp-hello-world-n-times
(deftest my-fp-hello-world
  (is
    (= (with-out-str (introduction.core/fp-hello-world-n-times 2))
       "Hello World\nHello World\n") "Should print Hello World\n n times"))

;;fp-filter-array
(deftest my-fp-filter-array
  (is 
    (= 
      (introduction.core/fp-filter-array 3 '(10 9 8 2 7 5 1 3 0))
      '(2 1 0)) "Should return a vector containing all the numbers in the list less than the delimiter in original order"))
