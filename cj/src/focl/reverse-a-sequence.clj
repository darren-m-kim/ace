;; https://www.4clojure.com/problem/23

;; 1
(defn f1 [seq]
  (loop [o seq r '()]
    (if (empty? o)
      r
      (recur (rest o)
             (conj r (first o))))))
(= (f1 [1 2 3 4 5]) [5 4 3 2 1]) ;; => true
(= (f1 (sorted-set 5 7 2 7)) '(7 5 2)) ;; => true
(= (f1 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]) ;; => true

;; 2
(defn f2 [coll]
  (as-> coll c
    (zipmap (iterate dec (count c)) c)
    (sort c)
    (vals c)))
(= (f2 [1 2 3 4 5]) [5 4 3 2 1]) ;; => true
(= (f2 (sorted-set 5 7 2 7)) '(7 5 2)) ;; => true
(= (f2 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]) ;; => true

;; 3
(defn f3 [coll]
  (vals 
   (sort   
    (zipmap (iterate dec 0) coll))))
(= (f3 [1 2 3 4 5]) [5 4 3 2 1]) ;; => true
(= (f3 (sorted-set 5 7 2 7)) '(7 5 2)) ;; => true
(= (f3 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]) ;; => true
