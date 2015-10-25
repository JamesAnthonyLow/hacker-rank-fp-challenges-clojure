(ns introduction.core-test
  (:require [clojure.test :refer :all]
            [introduction.core :refer :all])
  (clojure.core/load "fp-filter-array"))

;;fp-filter-array

(deftest my-fp-filter-array
  (is 
    (= 
      (introduction.core/fp-filter-array 3 '(10 9 8 2 7 5 1 3 0))
      '(2 1 0))))
