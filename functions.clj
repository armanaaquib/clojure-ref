;; fn
(def add
  "Add two numbers"
  (fn
    ([] 0)
    ([x] x)
    ([x y] (+ x y))))

(println (add))
(println (add 10))
(println (add 10 20))

;; defn
(defn plus
  "Add two numbers"
  ([] 0)
  ([x] x)
  ([x y] (+ x y)))

(println (plus))
(println (plus 10))
(println (plus 10 20))
