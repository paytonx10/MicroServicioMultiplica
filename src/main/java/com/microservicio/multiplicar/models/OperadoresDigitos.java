package com.microservicio.multiplicar.models;
import java.util.ArrayList;

/**
 * @author Felipe Garrido
 */
public class OperadoresDigitos {

    private ArrayList<Integer> digitos = new ArrayList<Integer>();
    private ArrayList<Character> operadores = new ArrayList<Character>();

    public ArrayList<Integer> getDigitos() {
        return digitos;
    }

    public void setDigitos(ArrayList<Integer> digitos) {
        this.digitos = digitos;
    }

    public ArrayList<Character> getOperadores() {
        return operadores;
    }

    public void setOperadores(ArrayList<Character> operadores) {
        this.operadores = operadores;
    }

}
