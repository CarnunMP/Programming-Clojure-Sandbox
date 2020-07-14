; Lazy seqs are the shit! E.g. the whole numbers:
(defn whole-numbers [] (iterate inc 1))

; 'take' is one way to view a finite subject of an infinite, lazy sequence:
(take 10 (whole-numbers)) ; => (1 2 3 4 5 6 7 8 9 10)