def cube_root(x):
    return iterate(1, x, x)
#funkcja iteracyjna

def iterate(guess, x, prev_guess):
    epsilon = 0.000001 #przyblizenie

    if lower_than_epsilon(guess, prev_guess): # nasz wynik spelnia wymagania
        return guess
    else: #Jezeli nie spelnia,to podajemy kolejne przyblizenie i wykonujemy rekurencyjnie kolejna metode
        next_guess = (2 * guess + x / (guess * guess)) / 3 #wzor (x/y^2+2y)/3
        return iterate(next_guess, x, guess)

# Jezeli (Obecne przyblizenie - poprzednie przyblizenie) < epsilon, zwraca true, czyli wynik jest wystarczajacy
def lower_than_epsilon(guess, prev_guess):
    epsilon = 0.000001
    return abs(guess - prev_guess) < epsilon

# Przyklady uzycia
print(cube_root(28))  # Wynik: 3.036588971
print(cube_root(125))  # Wynik: 5.0
print(cube_root(8))  # Wynik: 2.0
