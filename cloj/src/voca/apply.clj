

(apply max [1 2 3])
;; => 3

(apply map inc [[1 2 3]])
;; => (2 3 4)

(str 123 456)
;; => "123456" 

(str [123 456])
;; => "[123 456]" 

(apply str [123 456])
;; => "123456" 

(max 1 2 3)
;; => 3 

(max [1 2 3])
;; => [1 2 3] 

(apply max [1 2 3])
;; => 3

(apply max '(1 2 3))
;; => 3

(apply max #{1 2 3})
;; => 3

(apply + 1 [2 3 4])
;; => 10

(apply + 1 [2 3 4])
;; => 10