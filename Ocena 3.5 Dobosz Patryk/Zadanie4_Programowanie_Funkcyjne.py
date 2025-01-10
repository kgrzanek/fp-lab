def power_set(collection):
    if len(collection) == 0: #zwracamy zbior pusty
        return [[]]
    else: # rozdzielamy kolekcje na jej pierwszy element oraz pozostale
        first_element = collection[0]
        rest_of_elements = collection[1:]
        
        power_set_of_rest = power_set(rest_of_elements) #rekurencyjnie tworzymy kolekcje z elementow pozostalych
        
        # dodajemy pierwszy element do kazdego podzbioru w zbiorze potegowym pozostalych elementow
        # (w kazdym kolejnym wywolaniu funkcji elementem pierwszym jest kolejna liczba z kolekcji podanej w parametrze)
        power_set_with_first = [subset + [first_element] for subset in power_set_of_rest] 

        return power_set_of_rest + power_set_with_first
        # zbior potegowy pozostalych elementow zostaje polaczony ze zbiorem potegowym zawierajacym pierwszy element

def display_powerset(power_set):
    for subset in power_set:
        print("{ " + ", ".join(map(str, subset)) + " }")

#Przyklad uzycia
collection = [1, 2, 3]
power_set =power_set(collection)
display_powerset(power_set)

