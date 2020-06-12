; A neat example of destructuring:
(require '[clojure.string :as str])
(defn ellipsise [words]
  (let [[w1 w2 w3] (str/split words #"\s+")] ; destructuring form [w1 w2 w3] ignores 4th, 5th, etc. words!
    (str/join " " [w1 w2 w3 "..."])))

(ellipsise "The quick brown fox jumps over the lazy dog.")
; => "The quick brown ..."

;;;

; Naming Java objects and calling them with '.':
(def rnd (new java.util.Random))
(. rnd nextInt) ; calls the no-arg version of nextInt()
(. rnd nextInt 10) ; calls nextInt(10)

; '.' also works with statics. For instance:
(. Math PI) ; => 3.141592653589793

; Note: Clojure imports `java.lang` automatically. But for unqualified access to other classes you can do e.g.:
(import '(java.util Random Locale)
        '(java.text MessageFormat))

; Note: if you need access to underlying Java docs, you can type something like '(javadoc java.util.URL) in the REPL!

;;;

; `if` allows for only a single form in each 'branch'. But this can be circumvented with `do`!
(defn is-small? [number]
  (if (< number 100)
    "yes"
    (do
      (println "Saw a big number" number)
      "no")))

(is-small? 200)
; Saw a big number
; => "no"

; Note that here, with `do`, the function's side-effect are *explicitly flagged*.
