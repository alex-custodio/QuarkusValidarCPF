package model;

import java.util.Objects;

public class ValidarClass {
    public static String validar(String cpf){
        Objects.requireNonNull(cpf);
        return "teste";
    }
}
