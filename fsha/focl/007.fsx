// https://www.4clojure.com/problem/7

// 1
let v1 = [1; 2; 3; 4]
v1.Equals ([1; 2; 3] @ [4]) // true
v1.Equals <| [1; 2; 3] @ [4] // true