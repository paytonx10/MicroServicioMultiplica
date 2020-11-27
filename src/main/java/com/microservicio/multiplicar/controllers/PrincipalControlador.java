package com.microservicio.multiplicar.controllers;
import com.microservicio.multiplicar.models.OperadoresDigitos;
import com.microservicio.multiplicar.services.CalculaMultiplicacionServicio;
import org.springframework.web.bind.annotation.*;

/**
 * @author Felipe Garrido
 */
@RestController
public class PrincipalControlador {

    @PostMapping(value = "/multiplica", consumes = "application/json", produces = "application/json")
    public OperadoresDigitos multiplicar(@RequestBody OperadoresDigitos operadoresDigitos) throws Exception {
        CalculaMultiplicacionServicio calculaMultiplicacion = new CalculaMultiplicacionServicio();
        OperadoresDigitos operadoresDigitosRetorno = calculaMultiplicacion.calcularMultiplicacion(operadoresDigitos);
        return operadoresDigitosRetorno;
    }
}
