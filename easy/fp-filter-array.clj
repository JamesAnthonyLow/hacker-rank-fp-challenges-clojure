(fn[delim lst]
  (loop[coll [] [num & rest] lst]
    (if num
      (recur (if (< num delim) (conj coll num) coll) rest)
      coll))) 
