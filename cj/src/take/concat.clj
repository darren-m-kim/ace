;; concat
(concat [1 2] [3 4 5])
;; => (1 2 3 4 5)
(concat [1 2] '(:a :b :c) #{"x" "y"})
;; => (1 2 :a :b :c "x" "y")

;; concat
(concat [1 2] [3 4]) ;; => (1 2 3 4)
(apply concat [[1 2] [3 4]]) ;; => (1 2 3 4)
(concat [1 2] [3 4 5]) ;; => (1 2 3 4 5) 
(concat [1 2] '(3 4 5));; => (1 2 3 4 5)
(concat '(1 2) '(3 4 5)) ;; => (1 2 3 4 5) 
(concat [1 2] #{3 4 5}) ;; => (1 2 4 3 5) 
(concat #{1 2} #{3 4 5}) ;; => (1 2 4 3 5) 
(concat {:a 1} [2 3 4]) ;; => ([:a 1] 2 3 4) 
(concat {:a 1} {:b 2}) ;; => ([:a 1] [:b 2])
(concat [1 2] [3 4] [5 6]);; => (1 2 3 4 5 6) 
