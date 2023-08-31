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
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(10.5, service.calcMedia(valores) );
    }

    @Test
    public void testMediana(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(10.5, service.calcMediana(valores));
    }

    @Test
    public void testDesvPadrao(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(5.766281297335398, service.calcDesvPadrao(valores));
    }

    @Test
    public void testValorMax(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(20.0, service.valorMax(valores));
    }

    @Test
    public void testValorMin(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(1.0, service.valorMin(valores));
    }

    @Test
    public void testSoma(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(210, service.calcSoma(valores));
    }
}
