def FibSteps(number): #Ilosc krokow, niezbedne do obliczenia fib(n)
    if number < 2:
        return 1 #(n) = 1  dla n < 2
    else:
        return FibSteps(number - 1) + FibSteps(number - 2) + 1 #(n) = fib(n-1) + fib(n-2) + 1   dla n => 2

#Przyklad uzycia dla n=5
n = 5
result = FibSteps(n)
print(f"FibSteps({n}) = {result}")





