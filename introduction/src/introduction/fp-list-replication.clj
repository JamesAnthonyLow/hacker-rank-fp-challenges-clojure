(ns introduction.core)
(defn fp-list-replication [num lst] 
  (loop [[first & rest] lst]
    (dotimes [n num] (println first))
    (if rest (recur rest))))

