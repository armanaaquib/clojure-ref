;; recursion

(defn print-hello-world [n]
  (when-not (zero? n)
      (println "Hello World!")
      (print-hello-world (dec n))))

(print-hello-world 5)

(defn factorial [n]
  (if (zero? n)
    1
    (* n (factorial (dec n)))))

(factorial 0)
(factorial 1)
(factorial 2)
(factorial 5)
(factorial 50N)
;; (factorial 5000N)

;; tail call optimization

(defn factorial-2 [n r]
  (if (zero? n)
    r
    (recur (dec n) (* r n))))

(factorial-2 0 1)
(factorial-2 1 1)
(factorial-2 2 1)
(factorial-2 5 1)
(factorial-2 50N 1)
(factorial-2 5000N 1)

;; loop

(defn factorial-3 [n]
  (loop [n n
         r 1]
  (if (zero? n)
    r
    (recur (dec n) (* r n)))))

(factorial-3 0)
(factorial-3 1)
(factorial-3 2)
(factorial-3 5)
(factorial-3 50N)
(factorial-3 5000N)

(loop [v [:black :blue :green]]
  (when-not (empty? v)
    (println (first v))
    (recur (rest v))))

;; dotimes

(dotimes [n 5]
  (println "Hello World!")
  (println n))

;; doseq

(doseq [el [:black :blue :gree]]
  (println el))

(doseq [el [:black :blue :gree]
        n [1 2 3]]
  (println [el n]))

;; repeat

(repeat 5 2)

;; for

(for [el [1 2 3]]
  (+ el 10))

(for [x [1 2 3]
      y [4 5 6]]
  (+ x y))

(for [x [1 0 3]
      y [4 0 5]
      :when (not= x y 0)
      :let [z (+ x y)]]
  [x y z])

;; ->>

(defn sqr[x] (* x x))

(->> (sqr 12)
     (* 13))
; (* 13 (sqr 12))

;; ->

(-> 10 (/ 100))

; (/ 10 /100)

;; cond->

(cond-> {:a 1 :b 2}
  true (update :a inc)
  false (assoc :a 0 :b 0)
  true (update :b inc))