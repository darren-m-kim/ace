module MyLib where

import Control.Monad
import Control.Monad.Writer  
import Data.Char
import Data.List
import Data.Monoid
  
gcd' :: Int -> Int -> Writer [String] Int
gcd' a b
  | b == 0 = do
      tell ["Finished with " ++ show a]
      return a
  | otherwise = do
      tell [show a ++ " mod " ++ show b ++ " = " ++ show (a `mod` b)]
      gcd' b (a `mod` b)
