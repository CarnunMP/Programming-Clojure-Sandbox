; Lazy seqs are the shit! E.g. the whole numbers:
(defn whole-numbers [] (iterate inc 1))

; 'take' is one way to view a finite subject of an infinite, lazy sequence:
(take 10 (whole-numbers)) ; => (1 2 3 4 5 6 7 8 9 10)

; 'interleave' runs until one of the collections passed to it runs out of items:
(interleave (whole-numbers) ["A" "B" "C" "D" "E"]) ; => (1 "A" 2 "B" 3 "C" 4 "D" 5 "E")

; One interesting way to filter a sequence is with 'take-while', which takes while a predicate remains true:
(take-while (complement #{\a\e\i\o\u}) "the-quick-brown-fox") ; => (\t \h)
; Note: the set #{\a\e\i\o\u} is acting as a predicate function, here — and 'complement' is reversing its behavior!
; So, it returns true when its argument _isn't_ a vowel.

; After using the sequence funtions on a string, the result is a sequence.
; If you want to conver back to a string, use (apply str seq):
(reverse "hello") ; => (\o \l \l \e \h)
(apply str (reverse "hello")) ; => "olleh"