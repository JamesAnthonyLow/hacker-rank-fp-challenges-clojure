(ns introduction.core-test
  (:require [clojure.test :refer :all]
            [introduction.core :refer :all]))
  (apply load ["fp-hello-world"
               "fp-hello-world-n-times"
               "fp-list-replication"
               "fp-filter-array"])

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

;;fp-list-replication
(deftest my-fp-list-replication
  (is
    (= (with-out-str (introduction.core/fp-list-replication 3 '(1 2 3 4)))
       "1\n1\n1\n2\n2\n2\n3\n3\n3\n4\n4\n4\n") "Should print each element in the list n times" ))

;;fp-filter-array
(deftest my-fp-filter-array
  (is 
    (= 
      (introduction.core/fp-filter-array 3 '(10 9 8 2 7 5 1 3 0))
      '(2 1 0)) "Should return a vector containing all the numbers in the list less than the delimiter in original order"))
