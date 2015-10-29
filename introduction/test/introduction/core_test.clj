(ns introduction.core-test
  (:require [clojure.test :refer :all]
            [introduction.core :refer :all]))

;;fp-hello-world
(deftest my-fp-hello-world
  (is
    (= (with-out-str (fp-hello-world))
       "Hello World\n" ) "Should print out Hello World\n"))

;;fp-hello-world-n-times
(deftest my-fp-hello-world
  (is
    (= (with-out-str (fp-hello-world-n-times 2))
       "Hello World\nHello World\n") "Should print Hello World\n n times"))

;;fp-list-replication
(deftest my-fp-list-replication
  (is
    (= (fp-list-replication 3 '(1 2 3 4))
       '(1 1 1 2 2 2 3 3 3 4 4 4 )) "Should return a list with each element repeated n times"))

;;fp-filter-array
(deftest my-fp-filter-array
  (is 
    (= 
      (fp-filter-array 3 '(10 9 8 2 7 5 1 3 0))
      '(2 1 0)) "Should return a vector containing all the numbers in the list less than the delimiter in original order"))

;;fp-filter-positions-in-a-list
(deftest my-fp-filter-positions-in-a-list
  (is
    (=
     (fp-filter-positions-in-a-list '(2 5 3 4 6 7 9 8)) '(5 4 7 8))
    "Should return a sequence of the elements at the odd positions in the list"))

;;fp-array-of-n-elements
(deftest my-fp-array-of-n-elements
  (is
    (= (fp-array-of-n-elements 3)
       [1, 2, 3])
    "Creates an array of N integers"))

;;fp-reverse-a-list
(deftest my-fp-reverse-a-list
  (is
    (= (fp-reverse-a-list '(19 22 3 28 26 17 18 4 28 0))
       '(0 28 4 18 17 26 28 3 22 19))))
