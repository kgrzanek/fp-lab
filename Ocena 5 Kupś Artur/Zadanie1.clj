;; Funkcja, która oblicza sumę kwadratów pierwszych n liczb naturalnych
(defn sum-of-squares [n]
  ;; Redukcja sumuje kwadraty liczb z zakresu od 1 do n włącznie
  (reduce + (map #(* % %) (range 1 (inc n)))))

;; Funkcja, która oblicza kwadrat sumy pierwszych n liczb naturalnych
(defn square-of-sum [n]
  ;; Oblicza sumę liczb z zakresu od 1 do n włącznie
  (let [sum (reduce + (range 1 (inc n)))]
    ;; Zwraca kwadrat tej sumy
    (* sum sum)))

;; Funkcja, która oblicza różnicę między kwadratem sumy a sumą kwadratów
(defn difference [n]
  (- (square-of-sum n) (sum-of-squares n)))

;; Funkcja główna programu
(defn -main []
  ;; Wynik różnicy dla pierwszych 100 liczb naturalnych
  (println "The difference between the sum of the squares and the square of the sum for the first 100 natural numbers is:"
           (difference 100)))

;; Funkcja główna
(-main)
