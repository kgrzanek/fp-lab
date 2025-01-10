def pierwiastek_herona(liczba, epsilon=0.0001, maksymalne_iteracje=100):
    przyblizenie = liczba  # Poczatkowe przyblizenie to sama liczba
    for i in range(maksymalne_iteracje):
        kolejne_przyblizenie = (przyblizenie + liczba / przyblizenie) / 2  # Obliczanie lepszego przyblizenia
        
        if abs(przyblizenie - kolejne_przyblizenie) < epsilon:
            return kolejne_przyblizenie  # Zwracamy przyblizony pierwiastek, gdy osiagnieta jest wystarczajaca dokladnosc
        
        przyblizenie = kolejne_przyblizenie
    return przyblizenie  # Zwracamy ostatnie przyblizenie po osiagnieciu maksymalnej liczby iteracji




liczba = float(input("Wprowadz liczbe: "))
przyblizony_pierwiastek = pierwiastek_herona(liczba)
print(f"Pierwiastek kwadratowy z liczby wynosi: {przyblizony_pierwiastek}")








