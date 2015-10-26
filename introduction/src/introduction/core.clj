(ns introduction.core)

(defn fp-hello-world-n-times [n]
(dotimes [n n] (println "Hello World")))

(defn fp-hello-world []
(println "Hello World"))

(defn fp-list-replication [num lst]
  (reduce 
    (fn [new-lst elem]
      (concat (repeat num elem) new-lst))
    '() (reverse lst)))

(defn fp-filter-array [delim lst]
  (loop [coll [] [num & rest] lst]
    (if num
      (recur (if (< num delim) (conj coll num) coll) rest)
      coll))) 



