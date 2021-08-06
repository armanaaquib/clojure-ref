(println "Hello World!")
(println (+ 2 (* 2 3)))

(+ 2 (* 4 3))


(slurp "https://pokeapi.co/api/v2/pokemon/1")

(str "Hello" "World" [1 2 3])

(zero? 0)
(rem 3 2)

;; comp
(def add-two (comp inc inc inc))

(add-two 1)

(def div-by? (comp zero? rem))

(div-by? 4 2)

(def not-div-by? (complement div-by?))

(not-div-by? 4 3)

;; partial
(def add-two-2 (partial + 2))

(add-two-2 1 3)

;; juxt
(def range-of (juxt min max))

(range-of 2 3 4 5)

;; apply
(apply + 1 [2 3 4])

;; second highest noumber
(apply - ((juxt + min max) 100 40 10))

(def prod-of (partial apply *))

(prod-of '(1 2 3 4))

(def second-greatest (comp (partial apply -) (juxt + min max)))

;; (second-greatest 10 200 40)
(defn second-greatest-2 [x y z]
  (let [total (+ x y z)
        greatest (max x y z)
        least (min x y z)]
    (- total greatest least)))

(second-greatest-2 10 20 30)

;; do
(do (+ 2 3)
    (+ 3 4))

;; quote
(quote (a 2 3))