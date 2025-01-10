;; a. Wzór na pierwiastek sześcienny
(defn cube-root [x]
  (Math/pow x (/ 1.0 3.0)))

;; b. Procedura Herona zależna od epsilon
(defn heron-method-epsilon [x epsilon]
  (let [next (fn [guess] (/ (+ (/ x (* guess guess)) (* 2 guess)) 3.0))]
    (loop [guess x]
      (let [new-guess (next guess)]
        (if (< (Math/abs (- new-guess guess)) epsilon)
          new-guess
          (recur new-guess))))))

;; c. Procedura Herona zależna od liczby kroków
(defn heron-method-steps [x steps]
  (let [next (fn [guess] (/ (+ (/ x (* guess guess)) (* 2 guess)) 3.0))]
    (loop [guess x step 0]
      (if (>= step steps)
        guess
        (recur (next guess) (inc step))))))

;; Funkcja główna
(defn -main [] 
  (println "Pierwiastek sześcienny z 27 to:" (cube-root 27))
  (println "Pierwiastek sześcienny z 27 z epsilon 0.0001 to:" (heron-method-epsilon 27 0.0001))
  (println "Pierwiastek sześcienny z 27 po 10 krokach to:" (heron-method-steps 27 10)))

(-main)