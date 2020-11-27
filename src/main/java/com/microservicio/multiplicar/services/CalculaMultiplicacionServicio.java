package com.microservicio.multiplicar.services;
import com.microservicio.multiplicar.models.OperadoresDigitos;
import java.util.ArrayList;

/**
 * @author Felipe Garrido
 */
public class CalculaMultiplicacionServicio {

    public OperadoresDigitos calcularMultiplicacion(OperadoresDigitos operadoresDigitos) throws Exception {
        OperadoresDigitos operadoresDigitosRetorno = new OperadoresDigitos();
        try {
            ArrayList<Character> operadores = operadoresDigitos.getOperadores();
            ArrayList<Integer> digitos = operadoresDigitos.getDigitos();
            for (int i = 0; i < operadores.size(); i++) {
                if (operadores.get(i) == '*') {
                    operadores.remove(i);
                    digitos.set(i, (digitos.get(i) * digitos.get(i + 1)));
                    digitos.remove(i + 1);
                    i -= 1;
                }
            }
            operadoresDigitosRetorno.setDigitos(digitos);
            operadoresDigitosRetorno.setOperadores(operadores);
        } catch (Exception e) {
            throw new Exception("Error servicio multiplicar: " + e.getMessage());
        }
        return operadoresDigitosRetorno;
    }
}
