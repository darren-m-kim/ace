module Hack where

-- https://www.hackerrank.com/challenges/solve-me-first

solveMeFirst a b =
  a + b

main = do
    val1 <- readLn
    val2 <- readLn
    let sum = solveMeFirst val1 val2
    print sum
