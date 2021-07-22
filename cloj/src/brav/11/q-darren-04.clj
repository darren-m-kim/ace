;; create a random number and save it somewhere in runtime,
;; print it after 3 seconds,
;; and then remove the value by code.

(require '[clojure.core.async :refer
           [go go-loop timeout chan thread
            take! put! alts!! close!
            <! >! <!! >!!]])

;; 1
(def c (chan))
(do
  (thread (>!!  c (rand 100)))
  (Thread/sleep 3000)
  (prn (<!! c))
  (close! c))
