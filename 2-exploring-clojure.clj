; A neat example of destructuring:
(require '[clojure.string :as str])
(defn ellipsise [words]
  (let [[w1 w2 w3] (str/split words #"\s+")] ; destructuring form [w1 w2 w3] ignores 4th, 5th, etc. words!
    (str/join " " [w1 w2 w3 "..."])))

(ellipsise "The quick brown fox jumps over the lazy dog.")
; => "The quick brown ..."