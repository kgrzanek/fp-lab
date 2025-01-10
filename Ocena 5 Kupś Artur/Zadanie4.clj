(defn powerset [s]
  (if (empty? s)
    (list '())
    (let [rest (powerset (rest s))
          first-element (first s)]
      (concat rest (map #(cons first-element %) rest)))))

;; Funkcja główna
(defn -main []
  ;; Test funkcji
  (println "Powerset [1 2 3]:")
  (println (powerset [1 2 3])))

(-main)
