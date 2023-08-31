package com.desafio;

import com.desafio.Services.ServiceValores;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TestCalculos {
    List<Double> valores = new ArrayList<>();
    ServiceValores service = new ServiceValores();


    @Test
    public void testMedia(){
        for(int i = 1; i < 21 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(10.5, service.calcMedia(valores) );
    }

    @Test
    public void testMediana(){
        for(int i = 1; i < 21 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(10.5, service.calcMediana(valores));
    }

    @Test
    public void testDesvPadrao(){
        for(int i = 1; i < 21 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(5.766281297335398, service.calcDesvPadrao(valores));
    }


}
