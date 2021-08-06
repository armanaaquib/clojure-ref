;; if
(def a 0)

(defn classify-num [a]
  (if (zero? a)
    :zero
    (if (= a 1)
    :one
    :many)
    )
  )

(classify-num 0)
(classify-num 1)
(classify-num 2)

;; case
(defn classify-num-2 [a]
  (case a
    0 :zero
    1 :one
    :many))

(classify-num-2 0)

;; cond
(defn classify-pos-neg-zero [a]
  (cond
    (pos? a) :positive
    (neg? a) :negative
    :else :zero))

(classify-pos-neg-zero 0)
(classify-pos-neg-zero 1)
(classify-pos-neg-zero -1)

;; condp
(def animals #{:tiger :dog :elephant})
(def fruits #{:apple :banana :papaya})
(def colors #{:black :white :orange})

(defn classify-category [a]
  (comment
    (cond
    (contains? animals a) :animal
    (contains? fruits a) :fruit
    (contains? colors a) :color
    :else :unknown))
  (condp contains? a
    animals :animal
    fruits :fruit
    colors :color
    :unknown
    ))

(classify-category :tiger)
(classify-category :white)
(classify-category :orange)
(classify-category :random)


;; when
(when true 
  (println "This is cool")
  (println "This is also cool"))

;; when-not
(when-not false 
  (println "This is cool")
  (println "This is also cool"))


