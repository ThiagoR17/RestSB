package com.example.br.RestSB.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;

import com.example.br.RestSB.entity.Valores;



@Controller
public class Gerarsalario {

    public BigDecimal salarioProgramador(){
        Valores salarioProgramador = new Valores();
        salarioProgramador.setMeusalYoutube(new BigDecimal("25.00"));

        return salarioProgramador.getMeusalnoYoutube();
    }
    
    
    public Valores todValores() {
        Valores valores = new Valores(new BigDecimal("25.00"), new BigDecimal("35.00"));
        return valores;
    }
    
}
