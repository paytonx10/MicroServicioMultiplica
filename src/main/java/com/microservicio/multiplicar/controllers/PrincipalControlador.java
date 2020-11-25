package com.microservicio.multiplicar.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalControlador {
    @RequestMapping("/multiplicar")
    public Integer multiplicar(@RequestParam(value="calculoMultiplicar") String valores) {
        String[] valoresArr = valores.split(",");
        int valoresMul = 1;
        for (int i = 0; i < valoresArr.length; i++) {
            valoresMul *= Integer.valueOf(valoresArr[i]);
        }
        System.out.println("Multiplicacion: "+valoresMul);
        return valoresMul;
    }
}
