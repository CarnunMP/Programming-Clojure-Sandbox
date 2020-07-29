; Clojure programs are built out of _pure functions_--i.e., functions without side-effects.
; Immutability and purity go hand-in-hand.

; Clojure isn't a fully lazy language: it's functions and expressions aren't lazy.
; But because so much Clojure programming comes down to sequence manipulation, many of the benefits of a fully lazy language are realised.

; Lazy techniques imply pure functions, because like lazy sequences you don't have to worry about _when_ pure functions are called!

; Functional code aids testing, because _the only relevant testing environment_ is a function's arguments!

; Pure functions are truly 'encapsulated': they don't need to hide behind APIs to approximate this desirable behaviour.

;;;

; Remember, you always have (doc ___), in the REPL. For instance:
  ; (doc take)
  ; -------------------------
  ; clojure.core/take
  ; ([n] [n coll])
  ;   Returns a lazy sequence of the first n items in coll, or all items if
  ;   there are fewer than n.  Returns a stateful transducer when
  ;   no collection is provided.
  ; nil

; But note: the printer used by the REPL isn't lazy!

; Ooh, and re the printer:
(time (repeat 10000 1))
; "Elapsed time: 0.024633 msecs"
; => (1 1 1 ... 1)

; One to remember!