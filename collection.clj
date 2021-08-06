;; list

'(1 2 3)

(def a 4)

(list a a a)
'(a a a)

;; vector

[1 2 3]

(vector 1 2 3)

;; set

#{1 2 3}

(set [1 2 3])
(sorted-set 1 2 3)

;; map

{:a 1 :b 1}

(hash-map :a 1 :b 1)


;; =

(= [1 2 [3]] [1 2 [3]])
(= #{1 2 3} #{1 3 2})
(= {:a 1} {:a 1})

;; count

(count [1 2 [3]])
(count '(1 2 [3]))
(count #{1 2 3})
(count {:a 1})

;; conj

(conj [1 2 3] 4 5)
(conj '(1 2 3) 0 -1)
(conj #{1 2 3} 4)
(conj {:a 1} {:b 1 :c 1})
(conj {:a 1} {:a 10 :c 1})
(conj {:a 1} {:b 1 :c 1})
(conj {:a 1} [:b 2])
(conj {:a 1} [:a 2])

;; first

(first [1 2])
(first '(1 2))
(first #{1 2 3})
(first {:a 1 :b 1})


;; second

(second [1 2])
(second '(1 2))
(second #{1 2 3})
(second {:a 1 :b 1})

;; rest

(rest [1 2])
(rest '(1 2))
(rest #{1 2 3})
(rest {:a 1 :b 1 :c 1})

;; get

(get [1 2 3] 2)
([1 2 3] 2)

(get [1 2 3] 5 100)
;; ([1 2 3] 5 100)

(get {:a 1 :b 1 :c 1} :b 0)
({:a 1 :b 1 :c 1} :b 0)

(get #{10 2 3} 10 :not-found)
(#{10 2 3} 10)
;; (#{10 2 3} 10 :not-found)

(def vowels #{\a \e \i \o \u})

((complement vowels) \b)
(remove (complement vowels) "abcdefghi")

;; keyword as functions

(:a {:a 1 :b 2})


;; assoc

(assoc {:a 1 :b 2 :c 3} :a 10 :b 20)
(assoc [1 2 3 4 5] 1 10)
;; (assoc '(1 2 3 4 5) 1 10)

;; dissoc

(dissoc {:a 1 :b 2 :c 3} :a :b)
;; (dissoc [1 2 3 4 5] 1)
;; (assoc '(1 2 3 4 5) 1 10)


;; get-in
(get-in {:a {:b [1 2]}} [:a :b 1])

;; assoc-in
(assoc-in {:a {:b [1 2]}} [:a :b 1] 20)

;; keys

(keys {:a 1 :b 2 :c 3})

;; vals

(vals {:a 1 :b 2 :c 3})

;; update

(update {:name "Name" :salary 100} :salary * 2)