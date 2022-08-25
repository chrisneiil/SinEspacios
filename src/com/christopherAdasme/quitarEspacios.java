package com.christopherAdasme;


import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

import java.sql.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quitarEspacios {
    public static void main(String[] args) {
        String xd = "¿ hola   tengo  espacios  xd  ?";


        String resultado = xd.replaceAll(" +", " "); //  respeta si es que al comienzo y al final de los caracteres hay un espacio.
        String resultadoSinEspacioAlFinal = resultado.replaceAll(" ", " ").trim(); //.trim() borra los espacios de los extremos.
        System.out.println(resultado);
        System.out.println(resultadoSinEspacioAlFinal);
        String[] divididos = resultadoSinEspacioAlFinal.split(" ");
        System.out.println(Arrays.asList(divididos));

        // una forma de dejar los caracteres pegados a un texto.
        resultadoSinEspacioAlFinal = resultadoSinEspacioAlFinal.replaceAll("\\¿ ", "¿").trim();
        for (String dividido:
             divididos) {
            if(dividido.equals("?")){
                resultadoSinEspacioAlFinal = resultadoSinEspacioAlFinal.replaceAll("\\?", " ").trim();
                resultadoSinEspacioAlFinal = resultadoSinEspacioAlFinal + "?";
            }
        }
        System.out.println(resultadoSinEspacioAlFinal);

    }
}
