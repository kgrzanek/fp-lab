FibResults = {}  #Uzywamy slownika

def FibIterative(number):
    if number not in FibResults: #sprawdzamy czy liczba jest juz obliczona i przechowywana w slowniku
        if number < 2:
            FibResults[number] = number #Tak-zwracamy obliczona wartosc
        else:
            FibResults[number] = FibIterative(number - 1) + FibIterative(number - 2) #Nie-obliczamy wartosc rekurencyjnie i dodajemy do slownika przed zwroceniem
    return FibResults[number]



#Przyklad uzycia dla n=100
n = 100
result = FibIterative(n)
print(f"FibIterative({n}) = {result}")



