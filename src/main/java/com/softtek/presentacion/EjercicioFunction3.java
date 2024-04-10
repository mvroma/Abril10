package com.softtek.presentacion;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class EjercicioFunction3 {
    public static void main(String[] args) {
        String contraseña = "C0ntra$eña";
        Function<String, Boolean> comprobar = prueba -> {
            if (prueba.length() < 8){
                return false ;
            }
            boolean hasUpperCase = prueba.chars().anyMatch(Character::isUpperCase);
            boolean hasLowerCase = prueba.chars().anyMatch(Character::isLowerCase);
            boolean hasDigit = prueba.chars().anyMatch(Character::isDigit);
            boolean hasSpecialChar = prueba.chars().anyMatch(c -> !Character.isAlphabetic(c) && !Character.isDigit(c));
            return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        };
        boolean esCorrecto = comprobar.apply(contraseña);
        System.out.println("¿Es válida la contraseña?" + esCorrecto);
    }
}
