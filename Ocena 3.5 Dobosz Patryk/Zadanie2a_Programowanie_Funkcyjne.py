liczba=float(input ("Podaj liczbe do pierwiastkowania: "))
dokladnosc=float(input("Podaj dokladnosc obliczen: ")) #epsilon

bok=liczba

while abs(bok-liczba/bok)>dokladnosc:
    bok = (bok+liczba/bok)/2

print("Pierwiastkiem liczby",liczba,"jest",bok)



