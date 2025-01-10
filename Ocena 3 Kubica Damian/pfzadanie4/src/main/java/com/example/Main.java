// Zadanie 4. Zbiór potęgowy (ang. powerset)
//Napisać procedurę, która przyjmuje kolekcję elementów (lista, wektor, zbiór) i generuje zbiór potęgowy dla tej kolekcji. Zbiór potęgowy to zbiór wszystkich podzbiorów danego zbioru łącznie ze zbiorem pustym.
//(powerset [1 2 3]) => ([] [1] [2] [3] [1 2] [1 3] [2 3] [1 2 3]

package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<List<Integer>> generatePowerSet(List<Integer> set) {
        List<List<Integer>> powerSet = new ArrayList<>();
        powerSet.add(new ArrayList<>());

        for (Integer element : set) {
            int setSize = powerSet.size();
            for (int j = 0; j < setSize; j++) {
                List<Integer> subset = new ArrayList<>(powerSet.get(j));
                subset.add(element);
                powerSet.add(subset);
            }
        }

        return powerSet;
    }

    public static void main(String[] args) {
        List<Integer> set = List.of(1, 2, 3);
        List<List<Integer>> powerSet = generatePowerSet(set);

        System.out.println(powerSet);
    }
}