(ns introduction.core)
(defn fp-list-replication [num lst]
  (reduce 
    (fn [new-lst elem]
      (concat (repeat num elem) new-lst))
    '() (reverse lst)))


