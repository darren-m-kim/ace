;; You have two channels, and a single consumer thread.
;; The consumer thread is supposed to take from the first channel
;; which happens to have a value available. 
;; Read the docstring of a/alts! and try to solve the problem.

(require '[clojure.core.async :as a])

;; 1
;; using alt! with go
(let [c1 (a/chan)
      c2 (a/chan)
      _ (if (< (rand 100) 50)
             (a/put! c1 "value to first channel!")
             (a/put! c2 "value to second channel!"))]
  (a/go
    (let [[v c] (a/alts! [c1 c2])]
      (prn v))))

;; 2
;; using alt!!
(let [c1 (a/chan)
      c2 (a/chan)
      _ (if (< (rand 100) 50)
             (a/put! c1 "value to first channel!")
             (a/put! c2 "value to second channel!"))]
  (let [[v c] (a/alts!! [c1 c2])]
    (prn v)))
