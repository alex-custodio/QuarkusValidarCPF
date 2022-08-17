package model;

import java.util.Objects;

public class ValidarClass {

    public static String validar(String cpf){
        double contadorDigito1=10;
        double somaTotal1=0;
        double somaTotal2=0;
        double contadorDigito2=11;
        Objects.requireNonNull(cpf);
        char[] arrayCpf = cpf.toCharArray();
        if (arrayCpf.length < 11){
            return "Não foi digitado números suficientes";
        }
        for (int i =0; i < 10; i++){
            int parseInt = Integer.parseInt(String.valueOf(arrayCpf[i]));
            if (i < 9){
                somaTotal1 += parseInt * contadorDigito1;

                somaTotal2 += parseInt * contadorDigito2;
                contadorDigito1--;
                contadorDigito2--;
            } else{
                somaTotal2 += parseInt * contadorDigito2;
            }


        }
        int resultado1= 11 - (somaTotal1 % 11) > 9 ? 0 : (int) (11 - (somaTotal1 % 11));
        int resultado2= 11 - (somaTotal2 % 11) > 9 ? 0 : (int) (11 - (somaTotal2 % 11));
        String resultados = String.valueOf(resultado1) + String.valueOf(resultado2);
        String indices = String.valueOf(arrayCpf[9]) + String.valueOf(arrayCpf[10]);

        if (resultados.equalsIgnoreCase(indices)){
            return "VALIDADO! ESTE CPF É VÁLIDO";
        }else {
            return "NÃO VALIDADO! ESTE CPF NÃO É VÁLIDO";
        }

    }
}
