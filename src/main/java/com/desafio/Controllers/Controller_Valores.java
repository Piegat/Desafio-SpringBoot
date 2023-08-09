package com.desafio.Controllers;

import com.desafio.Entity.Valores;
import com.desafio.Services.ServiceValores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/valores")
public class Controller_Valores {

    @Autowired
    private ServiceValores serviceValores;

    @PostMapping
    public ResponseEntity<String> postValores (@RequestBody Valores valores){
        try{

            String resultado = serviceValores.calc(valores);
            return ResponseEntity.ok(resultado);

        }catch (Exception e){

            return ResponseEntity.badRequest().body(e.getMessage());

        }


    }


}
