;; clojure.core/vector
;; ([] [a] [a b] [a b c] [a b c d] [a b c d e] [a b c d e f] [a b c d e f & args])
;; Creates a new vector containing the args.

(vector 1 2 3)
;; => [1 2 3]

(= (vector 1 2 3)
   [1 2 3])
;; => true
