package com.desafio.Services;

import com.desafio.Entity.Valores;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ServiceValores {

    public String calc(Valores valores){
        String resultado;
        Double media;
        Double mediana = calcMediana(valores.getValores());
        Double desvPond = calcDesvPadrao(valores.getValores());
        media = calcMedia(valores.getValores());

        resultado = "Quatidade de dados recebidos: " + valores.getValores().size() +  "\nA media é: " + media + "\nMediana: " + mediana + "\nDesvio padrao: " + desvPond;

        return resultado;
    }

    public Double calcMedia(List<Double> valores){
        Double resultado;
        int tamanho = valores.size();
        Double soma = 0.0;
        Double auxiliar;

        for (Double valore : valores) {

            auxiliar = valore;
            soma += auxiliar;
        }

        soma = soma/tamanho;

        return soma;
    }

    private Double calcMediana(List<Double> valores){
        Double resultado;
        int mediana;

        Collections.sort(valores);

        if (valores.size() %2 == 0){

            List<Double> valorMediana = new ArrayList<>();

            valorMediana.add(valores.get(valores.size()/2));
            valorMediana.add(valores.get((valores.size()/2) -1));

            resultado = calcMedia(valorMediana);
        }else{
            double tamanho = Math.floor((valores.size()/2));
            resultado = valores.get((int) tamanho);
        }

            return resultado;
    }


    public Double calcDesvPadrao (List<Double> valores){

        double media = calcMedia(valores);
        double soma = 0;

        for (double valor : valores) {
            double diferenca = valor - media;
            soma += diferenca * diferenca;
        }

        double variancia = soma / (valores.size() - 1);
        return Math.sqrt(variancia);
    }

}



