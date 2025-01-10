package zadanie4fun;
import java.util.ArrayList;
import java.util.List;

public class zadanie4fun {

    public static void main(String[] args) {
        List<Integer> zbior = List.of(1, 2, 3);
        List<List<Integer>> zbiorPotegowy = generujZbiorPotegowy(zbior);
        System.out.println("Zbior potegowy dla zbioru " + zbior + ":");
        for (List<Integer> podzbior : zbiorPotegowy) {
        System.out.println(podzbior);
        }      
    }
    
    public static <T> List<List<T>> generujZbiorPotegowy(List<T> zbior) {
        List<List<T>> wynik = new ArrayList<>();
        wynik.add(new ArrayList<>());

        // Dla każdego elementu z oryginalnego zbioru
        for (T element : zbior) {
            List<List<T>> nowePodzbiory = new ArrayList<>();


            for (List<T> podzbior : wynik) {
                List<T> nowyPodzbior = new ArrayList<>(podzbior);
                nowyPodzbior.add(element);
                nowePodzbiory.add(nowyPodzbior);
            }

            wynik.addAll(nowePodzbiory);
        }
        return wynik;
    }
}
