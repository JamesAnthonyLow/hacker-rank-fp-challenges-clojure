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

(defn fp-filter-positions-in-a-list [lst]
  (keep-indexed #(if (odd? %1) %2) lst))

(defn fp-array-of-n-elements [num]
  (vec (take num ((fn ints ([] (ints 1))
                    ([n] (cons n (lazy-seq 
                                 (ints (inc n))))))))))

(defn fp-reverse-a-list [lst]
  (reduce (fn [new-lst item]
            (cons item new-lst))
          '() lst))

(defn fp-sum-of-odd-elements [lst]
  (reduce #(if (odd? %2) (+ %1 %2) %1) 0 lst))

