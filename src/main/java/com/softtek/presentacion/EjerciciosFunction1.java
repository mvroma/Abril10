package com.softtek.presentacion;
import com.softtek.modelo.Estadistica;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class EjerciciosFunction1 {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Function<Integer, Integer> esPar = num -> num % 2 == 0 ? num : null;
    List<Integer> numPares = numbers.stream()
            .map(esPar)
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
        
        System.out.println("Los números pares son : " + numPares);
    }
}
