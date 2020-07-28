; Clojure programs are built out of _pure functions_--i.e., functions without side-effects.
; Immutability and purity go hand-in-hand.

; Clojure isn't a fully lazy language: it's functions and expressions aren't lazy.
; But because so much Clojure programming comes down to sequence manipulation, many of the benefits of a fully lazy language are realised.

; Lazy techniques imply pure functions, because like lazy sequences you don't have to worry about _when_ pure functions are called!

; Functional code aids testing, because _the only relevant testing environment_ is a function's arguments!

; Pure functions are truly 'encapsulated': they don't need to hide behind APIs to approximate this desirable behaviour.

