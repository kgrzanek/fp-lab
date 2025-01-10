;; a. Pierwiastek sześcienny z wykorzystaniem average-damp oraz FIXED-POINT
(defn average-damp [f]
  (fn [x] (/ (+ (f x) x) 2)))

(defn fixed-point [f guess tolerance]
  (let [close-enough? (fn [v1 v2] (< (Math/abs (- v1 v2)) tolerance))]
    (loop [guess guess]
      (let [next (f guess)]
        (if (close-enough? guess next)
          next
          (recur next))))))

(defn cube-root [x]
  (fixed-point (average-damp (fn [y] (/ x (* y y)))) 1.0 0.0001))

;; b. Pierwiastek sześcienny z wykorzystaniem Newton's method
(defn newton-method [f df guess tolerance]
  (let [close-enough? (fn [v1 v2] (< (Math/abs (- v1 v2)) tolerance))]
    (loop [guess guess]
      (let [next (- guess (/ (f guess) (df guess)))]
        (if (close-enough? guess next)
          next
          (recur next))))))

(defn cube-root-newton [x]
  (newton-method (fn [y] (- (* y y y) x))
                 (fn [y] (* 3 y y))
                 1.0
                 0.0001))

;; c. Procedura implementująca złożenie funkcji
(defn zloz [f g]
  (fn [x] (f (g x))))

;; d. Procedura implementująca n-krotne złożenie funkcji
(defn n-krotne-zlozenie [f n]
  (if (= n 1)
    f
    (zloz f (n-krotne-zlozenie f (dec n)))))

;; Funkcja główna
(defn -main []
  ;; Testy funkcji
  (println "Pierwiastek sześcienny z 27 to:" (cube-root 27))
  (println "Pierwiastek sześcienny z 27 (Newton's method) to:" (cube-root-newton 27))
  
  (def kwadrat (fn [x] (* x x)))
  (def f (zloz kwadrat inc))
  (println "Złożenie funkcji kwadrat i inc dla 6 to:" (f 6)) ;; powinno zwrócić 49
  
  (defn inc-f [x] (inc x))
  (def f2 (n-krotne-zlozenie inc-f 5))
  (println "5-krotne zastosowanie funkcji inc do 10 to:" (f2 10))) ;; powinno zwrócić 15

(-main)
