def fib_recur(number): #Funkcja glowna
    if number == 0:
        return number
    if number <= 2:
        return 1
    return fib_add(1, 1, number) #Funkcja pomocnicza przyjmujaca lower=1,higher=1 oraz number jako argument

def fib_add(lower, higher, number):
    if number == 3:
        return lower + higher #dla x=3
    else:
        return fib_add(higher, lower + higher, number - 1) #W przeciwnym wypadku funkcja wywoluje sama siebie z argumentami
                                                           #(higher=lower,lower+higher=higher,number-1), dopoki warunek pierwszy nie jest prawda
result = fib_recur(999)
print(result)


