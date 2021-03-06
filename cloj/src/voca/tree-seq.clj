;; clojure.core/tree-seq
;; ([branch? children root])
;; Returns a lazy sequence of the nodes in a tree, via a depth-first walk.
;; branch? must be a fn of one arg that returns true if passed a node
;; that can have children (but may not).  children must be a fn of one
;; arg that returns a sequence of the children. Will only be called on
;; nodes for which branch? returns true. Root is the root node of the
;; tree.

(tree-seq sequential? identity '(1 2 (3 4)))
;; => ((1 2 (3 4)) 1 2 (3 4) 3 4)
(filter #(not (seq? %)) '((1 2 (3 4)) 1 2 (3 4) 3 4))
;; => (1 2 3 4)
