package com.example.br.RestSB.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.br.RestSB.controller.Gerarsalario;

import jakarta.ws.rs.core.MediaType;

@RestController
public class Salarios {

    @Autowired
    private Gerarsalario gerarsalario;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
    path = "salario-programa", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getMeusal(){
        return new ResponseEntity<>(gerarsalario.salarioProgramador(), HttpStatus.OK);
    }


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "todos-salarios", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?>getTodosSalarios(){
        return new ResponseEntity<>(gerarsalario.todValores(), HttpStatus.OK);
    }
    
}

