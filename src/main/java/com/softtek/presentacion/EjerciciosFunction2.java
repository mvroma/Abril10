package com.softtek.presentacion;
import jdk.jshell.StatementSnippet;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import com.softtek.modelo.Estadistica;
public class EjerciciosFunction2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        Function<List<Integer>, Estadistica> calcular = nums -> {
            double sum = nums.stream().mapToDouble(Integer::doubleValue).sum();
            double media = sum / nums.size();
            double min = nums.stream().mapToDouble(Integer::doubleValue).min().getAsDouble();
            double max = nums.stream().mapToDouble(Integer::doubleValue).max().getAsDouble();
            return new Estadistica(min, max, media);
        };
        Estadistica stats = calcular.apply(numeros);
        System.out.println("Sus estadísticas son : " + stats);
    }
}
