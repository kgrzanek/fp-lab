;; a) Rekurencyjna funkcja Fibonacci'ego w najprostszej postaci wywołuje się dwukrotnie dla każdego kroku (dla n > 1). Dokładna liczba kroków  T(n)

;; T(n) = T(n-1) + T(n-2) + 1

;; b) Procedura rekurencyjna generująca proces iteracyjny
;; Zamiast używać rekurencji, możemy użyć procesu iteracyjnego do obliczenia liczby Fibonacci'ego, co znacząco poprawi wydajność.

;; Procedura iteracyjna
(defn fib-iter [n]
  (loop [a 0 b 1 i n]
    (if (zero? i)
      a
      (recur b (+ a b) (dec i)))))

(println "Fibonacci 10 to:" (fib-iter 10))


;; c)

;; b. Procedura iteracyjna z użyciem recur
  (:import [java.math BigInteger])

;; Procedura iteracyjna z użyciem BigInteger
(defn fib-iter [n]
  (let [zero (BigInteger. "0")
        one (BigInteger. "1")]
    (loop [a zero b one i n]
      (if (zero? i)
        a
        (recur b (.add a b) (dec i))))))

;; Funkcja główna
(defn -main []
  (println "Fibonacci 10 to:" (fib-iter 10))
  (println "Fibonacci 10000 to:" (fib-iter 10000)))

(-main)

