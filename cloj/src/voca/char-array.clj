(char-array "asdf")
;; => [\a, \s, \d, \f]

(seq (char-array "asdf"))
;; => (\a \s \d \f)

(seq (char-array 10))
;; => (\  \  \  \  \  \  \  \  \  \ )
